import cv2
import numpy as np
from ultralytics import YOLO
from sort.sort import Sort  # SORT 알고리즘 사용

# YOLOv8 모델 로드 (학습된 가중치 파일 사용)
model = YOLO("bestyolo.pt")  # 학습된 가중치 파일 경로로 변경

# 영상 파일 로드
video_path = "../avi/ai3.mp4"  # 입력 영상 파일 경로
cap = cv2.VideoCapture(video_path)
output_path = "../avi/AI히트맵_SORT.avi"  # 출력 영상 파일 경로

# 영상 저장 설정
fourcc = cv2.VideoWriter_fourcc(*'XVID')
fps = int(cap.get(cv2.CAP_PROP_FPS))
frame_width = int(cap.get(cv2.CAP_PROP_FRAME_WIDTH))
frame_height = int(cap.get(cv2.CAP_PROP_FRAME_HEIGHT))
out = cv2.VideoWriter(output_path, fourcc, fps, (frame_width, frame_height))

# SORT 초기화
tracker = Sort()

# 히트맵 생성 함수
def generate_heatmap(image, tracks, radius=50, intensity=255):
    heatmap = np.zeros((image.shape[0], image.shape[1]), dtype=np.float32)
    for track in tracks:
        x1, y1, x2, y2, track_id = track.astype(int)
        center_x, center_y = (x1 + x2) // 2, (y1 + y2) // 2
        cv2.circle(heatmap, (center_x, center_y), radius, intensity, -1)
    heatmap = cv2.GaussianBlur(heatmap, (0, 0), radius)
    heatmap = np.clip(heatmap, 0, 255).astype(np.uint8)
    return heatmap

# 영상 처리
while cap.isOpened():
    ret, frame = cap.read()
    if not ret:
        break

    # YOLOv8로 객체 탐지
    results = model(frame)
    detections = []

    # 탐지된 객체 정보 추출
    for result in results:
        for box, score, cls in zip(result.boxes.xyxy, result.boxes.conf, result.boxes.cls):
            x1, y1, x2, y2 = box.cpu().numpy().astype(int)
            score = float(score)
            detections.append([x1, y1, x2, y2, score])  # SORT 입력 형식: [x1, y1, x2, y2, score]

    # SORT로 객체 추적
    if len(detections) > 0:
        detections = np.array(detections)
    else:
        detections = np.empty((0, 5))  # 비어 있는 배열 처리
    tracks = tracker.update(detections)

    # 히트맵 생성
    heatmap = generate_heatmap(frame, tracks)
    colored_heatmap = cv2.applyColorMap(heatmap, cv2.COLORMAP_JET)

    # 추적된 객체 ID와 궤적 표시
    for track in tracks:
        x1, y1, x2, y2, track_id = track.astype(int)
        center_x, center_y = (x1 + x2) // 2, (y1 + y2) // 2

        # 바운딩 박스와 ID 표시
        cv2.rectangle(frame, (x1, y1), (x2, y2), (0, 255, 0), 2)
        cv2.putText(frame, f"ID: {track_id}", (x1, y1 - 10),
                    cv2.FONT_HERSHEY_SIMPLEX, 0.5, (255, 255, 255), 2)

    # 히트맵과 원본 프레임 결합
    overlay = cv2.addWeighted(frame, 0.6, colored_heatmap, 0.4, 0)

    # 결과 저장 및 출력
    out.write(overlay)
    cv2.imshow("Heatmap Overlay with SORT", overlay)
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

cap.release()
out.release()
cv2.destroyAllWindows()
