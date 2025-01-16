# 검증_명령줄
# yolo task=detect mode=val model=runs/detect/train/weights/best.pt data=data.yaml

# 추론
from ultralytics import YOLO

model = YOLO("runs/detect/train/weights/best.pt")  # 학습된 모델 로드
results = model.predict(source="test_image.jpg", save=True, imgsz=640)

