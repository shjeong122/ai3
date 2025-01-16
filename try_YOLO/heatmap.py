import cv2
import numpy as np
from ultralytics import YOLO

# YOLOv8 모델 로드 (학습된 가중치 파일 사용)
model = YOLO("bestyolo.pt")  # 학습된 가중치 파일 경로로 변경

# 영상 파일 로드
video_path = "ai3.mp4"  # 입력 영상 파일 경로
cap = cv2.VideoCapture(video_path)
output_path = "AI히트맵.avi"  # 출력 영상 파일 경로

# 영상 저장 설정
fourcc = cv2.VideoWriter_fourcc(*'XVID')
fps = int(cap.get(cv2.CAP_PROP_FPS))
frame_width = int(cap.get(cv2.CAP_PROP_FRAME_WIDTH))
frame_height = int(cap.get(cv2.CAP_PROP_FRAME_HEIGHT))
out = cv2.VideoWriter(output_path, fourcc, fps, (frame_width, frame_height))

# 히트맵 생성 함수
def generate_heatmap(image, detections, radius=50, intensity=255):
    heatmap = np.zeros((image.shape[0], image.shape[1]), dtype=np.float32)
    for x, y, w, h in detections:
        center_x, center_y = int(x + w / 2), int(y + h / 2)
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

    # 탐지된 객체 정보 추출 및 바운딩 박스 표시
    for result in results:
        for box, score, cls in zip(result.boxes.xyxy, result.boxes.conf, result.boxes.cls):
            x1, y1, x2, y2 = box.cpu().numpy().astype(int)
            label = f"{model.names[int(cls)]} {score:.2f}"
            color = (150, 255, 190)  # 바운딩 박스 색상 (초록)

            # 바운딩 박스 그리기
            cv2.rectangle(frame, (x1, y1), (x2, y2), color, 2)
            #cv2.putText(frame, label, (x1, y1 - 10), cv2.FONT_HERSHEY_SIMPLEX, 0.5, color, 2)

            # 밀집도 계산을 위한 중심 좌표 추가
            w = x2 - x1
            h = y2 - y1
            detections.append((x1, y1, w, h))

    # 히트맵 생성 및 합성
    heatmap = generate_heatmap(frame, detections)
    colored_heatmap = cv2.applyColorMap(heatmap, cv2.COLORMAP_JET)
    overlay = cv2.addWeighted(frame, 0.6, colored_heatmap, 0.4, 0)

    # 결과 저장 및 출력
    out.write(overlay)
    cv2.imshow("Heatmap Overlay with Bounding Boxes", overlay)
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

cap.release()
out.release()
cv2.destroyAllWindows()