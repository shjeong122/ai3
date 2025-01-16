import cv2
import numpy as np
from ultralytics import YOLO
from sort.sort import Sort  # SORT 알고리즘 사용

# YOLOv8 모델 로드 (학습된 가중치 파일 사용)
model = YOLO("bestyolo.pt")  # 학습된 가중치 파일 경로로 변경

# 영상 파일 로드
video_path = "../avi/여의도3.mp4"  # 입력 영상 파일 경로
cap = cv2.VideoCapture(video_path)
output_path = "../avi/AI밀집도_사용자지정.avi"  # 출력 영상 파일 경로

# 영상 저장 설정
fourcc = cv2.VideoWriter_fourcc(*'XVID')
fps = int(cap.get(cv2.CAP_PROP_FPS))
frame_width = int(cap.get(cv2.CAP_PROP_FRAME_WIDTH))
frame_height = int(cap.get(cv2.CAP_PROP_FRAME_HEIGHT))
out = cv2.VideoWriter(output_path, fourcc, fps, (frame_width, frame_height))

# SORT 초기화
tracker = Sort()

# 사용자 입력을 통해 설정할 영역의 좌표
start_point = None
end_point = None
selected_area_set = False

# 마우스 콜백 함수
def select_area(event, x, y, flags, param):
    global start_point, end_point, selected_area_set

    if event == cv2.EVENT_LBUTTONDOWN:  # 드래그 시작
        start_point = (x, y)
        end_point = None
        selected_area_set = False

    elif event == cv2.EVENT_MOUSEMOVE and start_point is not None:  # 드래그 중
        end_point = (x, y)

    elif event == cv2.EVENT_LBUTTONUP:  # 드래그 종료
        end_point = (x, y)
        selected_area_set = True

# OpenCV 창에 마우스 콜백 연결
cv2.namedWindow("Select Area")
cv2.setMouseCallback("Select Area", select_area)

# 영상 처리
while cap.isOpened():
    ret, frame = cap.read()
    if not ret:
        break

    # 사용자 지정 영역 표시
    if start_point and end_point:
        cv2.rectangle(frame, start_point, end_point, (255, 0, 0), 2)

    # 사용자 영역이 설정되면 밀집도 계산 시작
    if selected_area_set and start_point and end_point:
        # 선택된 영역 좌표
        x1_area, y1_area = min(start_point[0], end_point[0]), min(start_point[1], end_point[1])
        x2_area, y2_area = max(start_point[0], end_point[0]), max(start_point[1], end_point[1])

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

        # 선택된 영역 내 객체 수 계산
        object_count_in_area = 0
        for track in tracks:
            x1, y1, x2, y2, track_id = track.astype(int)
            center_x, center_y = (x1 + x2) // 2, (y1 + y2) // 2

            # 객체가 선택된 영역 내에 있으면 카운트
            if x1_area <= center_x <= x2_area and y1_area <= center_y <= y2_area:
                object_count_in_area += 1

                # 선택된 영역 내 객체를 강조 표시
                cv2.rectangle(frame, (x1, y1), (x2, y2), (0, 255, 0), 2)
                cv2.putText(frame, f"ID: {track_id}", (x1, y1 - 10),
                            cv2.FONT_HERSHEY_SIMPLEX, 0.5, (0, 255, 0), 2)

        # 밀집도 정보 화면에 표시
        cv2.putText(frame, f"Objects in Area: {object_count_in_area}", (x1_area, y1_area - 10),
                    cv2.FONT_HERSHEY_SIMPLEX, 0.8, (0, 0, 255), 2)

    # 결과 저장 및 출력
    out.write(frame)
    cv2.imshow("Select Area", frame)

    if cv2.waitKey(1) & 0xFF == ord('q'):  # 종료 키
        break

cap.release()
out.release()
cv2.destroyAllWindows()
