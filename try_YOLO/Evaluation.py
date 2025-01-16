from motmetrics import MetricsHost

# PyMOTMetrics를 사용하여 평가
metrics_host = MetricsHost()
results = metrics_host.compute(predicted_tracks, ground_truth_tracks, iou_threshold=0.5)
print(results)


# YOLOv8 성능 평가 명령
# yolo val model=./runs/detect/train7/weights/bestyolo.pt data=path/to/dataset.yaml