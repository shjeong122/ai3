# 학습_ 명령줄
# yolo task=detect mode=train model=yolov8n.pt data=data.yaml epochs=50 batch=16 imgsz=640

from ultralytics import YOLO

# YOLOv8 모델 초기화
model = YOLO("yolov8n.yaml")  # YOLOv8n 설정 파일 (작은 모델)

# 학습 실행
model.train(
    data="data.yaml",  # COCO 형식의 데이터셋 YAML 파일 경로
    epochs=10,         # 학습 반복 수
    imgsz=640,         # 입력 이미지 크기
    batch=16,          # 배치 크기
    name="future_density",  # 실험 이름
    device=0           # GPU 사용 ("cpu"로 설정하면 CPU 사용)
)

# 학습 완료 후, best.pt 파일을 future_density.pt로 복사
import shutil
shutil.copy("dataset/runs/train/future_density/weights/best.pt", "future_density.pt")
