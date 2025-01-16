from flask import Flask, render_template, Response
from ultralytics import YOLO
import cv2
import numpy as np
from sort.sort import Sort  # SORT 알고리즘을 사용한 객체 추적
from PIL import Image, ImageDraw, ImageFont  # Pillow 사용
import os

# Flask 애플리케이션 초기화
app = Flask(__name__)

# YOLOv8 모델 로드 (CPU 모드)
model = YOLO("yolov8n.pt").to("cpu")  # GPU가 없는 환경에서는 CPU로 모델 실행

# 객체 추적 초기화
tracker = Sort()

# 이전 프레임의 객체 좌표 저장
previous_positions = {}

# 방향 규칙 (대각선 포함)
DIRECTION_RULES = {
    "↑": lambda dx, dy: dy < -5 and abs(dx) <= abs(dy),  # 위쪽
    "↓": lambda dx, dy: dy > 5 and abs(dx) <= abs(dy),   # 아래쪽
    "←": lambda dx, dy: dx < -5 and abs(dx) > abs(dy),   # 왼쪽
    "→": lambda dx, dy: dx > 5 and abs(dx) > abs(dy),    # 오른쪽
    "↖": lambda dx, dy: dx < -5 and dy < -5,            # 위 왼쪽
    "↗": lambda dx, dy: dx > 5 and dy < -5,             # 위 오른쪽
    "↙": lambda dx, dy: dx < -5 and dy > 5,             # 아래 왼쪽
    "↘": lambda dx, dy: dx > 5 and dy > 5,              # 아래 오른쪽
}

# 폰트 경로 설정 (Pillow용, 대각선 기호 지원 폰트)
FONT_PATH = os.path.join("C:\\Windows\\Fonts", "malgunbd.ttf")  # 프로젝트 폴더에 저장된 Noto Sans Symbols 폰트
FONT_SIZE = 40  # 텍스트 크기
FONT_COLOR = (0, 255, 0)  # 녹색

def process_frame(frame):
    """프레임 처리 및 이동 방향 계산"""
    global previous_positions

    # YOLO 객체 감지
    results = model.predict(source=frame, save=False, conf=0.5, device="cpu")  # CPU에서 예측
    detections = []

    # 감지된 "person" 클래스의 바운딩 박스만 추가
    for result in results:
        for box in result.boxes:
            x1, y1, x2, y2 = map(int, box.xyxy[0])
            cls = int(box.cls[0])
            if cls == 0:  # "person" 클래스 ID는 0
                detections.append([x1, y1, x2, y2, box.conf[0]])  # x1, y1, x2, y2, confidence

    # SORT 알고리즘으로 객체 추적
    if len(detections) == 0:
        detections = np.empty((0, 5))  # 빈 배열을 올바른 형식으로 전달

    tracks = tracker.update(np.array(detections))

    # 이동 방향 계산 및 시각화
    for track in tracks:
        track_id = int(track[4])  # 객체 ID
        x1, y1, x2, y2 = map(int, track[:4])
        center_x, center_y = (x1 + x2) // 2, (y1 + y2) // 2

        # 이전 위치 확인
        if track_id in previous_positions:
            prev_x, prev_y = previous_positions[track_id]
            dx, dy = center_x - prev_x, center_y - prev_y

            # 방향 규칙 비교 및 화살표 기호 렌더링
            for direction, rule in DIRECTION_RULES.items():
                if rule(dx, dy):
                    frame = draw_text_inside(frame, direction, (x1, y1, x2, y2),
                                             FONT_PATH, FONT_SIZE, FONT_COLOR)

            # 궤적 표시
            cv2.arrowedLine(frame, (prev_x, prev_y), (center_x, center_y), (0, 255, 255), 2)

        # 현재 위치 저장
        previous_positions[track_id] = (center_x, center_y)

        # 바운딩 박스 그리기
        cv2.rectangle(frame, (x1, y1), (x2, y2), (0, 255, 0), 2)

    return frame

def draw_text_inside(image, text, box_coordinates, font_path, font_size, color):
    """Pillow를 사용해 텍스트를 바운딩 박스 안쪽 상단에 표시"""
    x1, y1, x2, _ = box_coordinates
    box_center_x = (x1 + x2) // 2  # 바운딩 박스의 중심 X 좌표

    # OpenCV 이미지를 Pillow 이미지로 변환
    image_pil = Image.fromarray(cv2.cvtColor(image, cv2.COLOR_BGR2RGB))
    draw = ImageDraw.Draw(image_pil)

    # 폰트 로드
    try:
        font = ImageFont.truetype(font_path, font_size)
    except OSError:
        print(f"Font file not found at {font_path}, falling back to default font.")
        font = ImageFont.load_default()

    # 텍스트 크기 계산
    text_bbox = draw.textbbox((0, 0), text, font=font)  # 텍스트 사각형 영역
    text_width = text_bbox[2] - text_bbox[0]
    text_height = text_bbox[3] - text_bbox[1]

    # 텍스트의 X, Y 좌표 (상단 내부)
    text_x = box_center_x - text_width // 2
    text_y = y1 + 5  # 바운딩 박스 내부 상단 여백 5 픽셀

    # 텍스트 그리기
    draw.text((text_x, text_y), text, font=font, fill=color)

    # Pillow 이미지를 OpenCV 이미지로 변환
    return cv2.cvtColor(np.array(image_pil), cv2.COLOR_RGB2BGR)

def generate_frames():
    """실시간 프레임 생성"""
    cap = cv2.VideoCapture(0)  # 웹캠 연결
    while True:
        ret, frame = cap.read()
        if not ret:
            break

        # 프레임 처리
        frame = process_frame(frame)

        # 프레임 스트리밍
        _, buffer = cv2.imencode(".jpg", frame)
        frame_bytes = buffer.tobytes()
        yield (
            b"--frame\r\n"
            b"Content-Type: image/jpeg\r\n\r\n" + frame_bytes + b"\r\n"
        )

    cap.release()

@app.route("/")
def index():
    """메인 페이지"""
    return render_template("index.html")

@app.route("/video_feed")
def video_feed():
    """비디오 스트림"""
    return Response(
        generate_frames(),
        mimetype="multipart/x-mixed-replace; boundary=frame",
    )

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=5000, debug=True)
