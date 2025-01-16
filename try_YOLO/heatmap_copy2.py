import cv2
import numpy as np
from ultralytics import YOLO

# YOLOv8 모델 로드 (학습된 가중치 파일 사용)
model = YOLO("bestyolo.pt")  # 학습된 가중치 파일 경로로 변경

# 영상 파일 로드
video_path = "../avi/ai3.mp4"  # 입력 영상 파일 경로
cap = cv2.VideoCapture(video_path)
output_path = "../avi/AI_미래밀집_구역.avi"  # 출력 영상 파일 경로

# 영상 저장 설정
fourcc = cv2.VideoWriter_fourcc(*'XVID')
fps = int(cap.get(cv2.CAP_PROP_FPS))
frame_width = int(cap.get(cv2.CAP_PROP_FRAME_WIDTH))
frame_height = int(cap.get(cv2.CAP_PROP_FRAME_HEIGHT))
out = cv2.VideoWriter(output_path, fourcc, fps, (frame_width, frame_height))

# 이전 프레임의 객체 위치 저장
previous_positions = {}
current_dense_zone = None  # 현재 밀집 구역을 추적

# 4x4 구역 설정
grid_rows = 4
grid_cols = 4
cell_width = frame_width // grid_cols
cell_height = frame_height // grid_rows

def calculate_zone(center_x, center_y):
    """객체 중심 좌표를 기반으로 구역 계산"""
    col = center_x // cell_width
    row = center_y // cell_height
    return row, col

# 영상 처리
while cap.isOpened():
    ret, frame = cap.read()
    if not ret:
        break

    # YOLOv8로 객체 탐지
    results = model(frame)
    current_positions = {}  # 현재 프레임에서 객체 ID별 위치 저장
    zone_count = np.zeros((grid_rows, grid_cols), dtype=int)  # 각 구역별 객체 수 계산

    # 탐지된 객체 정보 추출 및 바운딩 박스 표시
    for result in results:
        for box, score, cls in zip(result.boxes.xyxy, result.boxes.conf, result.boxes.cls):
            x1, y1, x2, y2 = box.cpu().numpy().astype(int)
            center_x, center_y = (x1 + x2) // 2, (y1 + y2) // 2

            # 객체 중심 좌표 저장
            current_positions[f"{x1}-{y1}-{x2}-{y2}"] = (center_x, center_y)

            # 구역 계산
            row, col = calculate_zone(center_x, center_y)
            zone_count[row, col] += 1

            # 바운딩 박스 그리기
            color = (150, 255, 190)  # 초록색
            cv2.rectangle(frame, (x1, y1), (x2, y2), color, 2)

    # 미래 밀집 구역 계산 및 표시
    for obj_id, (cur_x, cur_y) in current_positions.items():
        if obj_id in previous_positions:
            prev_x, prev_y = previous_positions[obj_id]
            dx, dy = cur_x - prev_x, cur_y - prev_y

            # 이동 방향 기반 미래 위치 예측
            future_x = cur_x + dx * 5  # n = 5 프레임 뒤 예측
            future_y = cur_y + dy * 5

            # 구역 계산
            row, col = calculate_zone(future_x, future_y)
            zone_count[row, col] += 1

            # 이동 방향 화살표 표시
            cv2.arrowedLine(frame, (prev_x, prev_y), (cur_x, cur_y), (0, 255, 255), 2)

        # 현재 위치를 이전 위치로 업데이트
        previous_positions[obj_id] = (cur_x, cur_y)

    # 현재 밀집 구역 계산
    max_zone_value = np.max(zone_count)
    if max_zone_value > 0:
        max_zone_indices = np.where(zone_count == max_zone_value)
        new_dense_zone = (max_zone_indices[0][0], max_zone_indices[1][0])  # 가장 밀집된 구역

        # 구역이 변경되었을 때만 업데이트
        if current_dense_zone != new_dense_zone:
            current_dense_zone = new_dense_zone

    # 4x4 구역 그리기 및 밀집 구역 표시
    for row in range(grid_rows):
        for col in range(grid_cols):
            top_left = (col * cell_width, row * cell_height)
            bottom_right = ((col + 1) * cell_width, (row + 1) * cell_height)
            color = (0, 0, 255) if (row, col) == current_dense_zone else (200, 200, 200)
            thickness = 2 if (row, col) == current_dense_zone else 1
            cv2.rectangle(frame, top_left, bottom_right, color, thickness)

    # 결과 저장 및 출력
    out.write(frame)
    cv2.imshow("Predicted Future Density Zone", frame)
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

cap.release()
out.release()
cv2.destroyAllWindows()