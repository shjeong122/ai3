import os
import json

def convert_to_coco(input_json_path, output_json_path):
    """
    JSON 데이터를 COCO 포맷으로 변환합니다.
    :param input_json_path: 입력 JSON 파일 경로
    :param output_json_path: 출력 COCO 포맷 JSON 파일 경로
    """
    # COCO 포맷 기본 구조 초기화
    coco_format = {
        "images": [],
        "annotations": [],
        "categories": [{"id": 1, "name": "person"}]
    }

    # JSON 파일 읽기
    with open(input_json_path, 'r') as f:
        data = json.load(f)

    # 이미지 메타데이터 추가
    image_id = 1
    coco_format["images"].append({
        "id": image_id,
        "file_name": data["image"]["imagename"],
        "width": data["size"]["width"],
        "height": data["size"]["height"]
    })

    # Annotation 추가
    annotation_id = 1
    for obj in data["image"]["crowdinfo"]["objects"]:
        x, y = obj["directionindex"]
        width, height = 20, 20  # 예제: 고정된 객체 크기 (필요시 수정)
        coco_format["annotations"].append({
            "id": annotation_id,
            "image_id": image_id,
            "category_id": 1,
            "bbox": [x - width / 2, y - height / 2, width, height],
            "area": width * height,
            "iscrowd": 0
        })
        annotation_id += 1

    # COCO 포맷 JSON 저장
    with open(output_json_path, 'w') as f:
        json.dump(coco_format, f, indent=4)

    print(f"Converted {input_json_path} to COCO format at {output_json_path}")


def process_all_json_in_directory(input_dir, output_dir):
    """
    디렉토리 내 모든 JSON 파일을 COCO 포맷으로 변환합니다.
    :param input_dir: 입력 JSON 파일 디렉토리 경로
    :param output_dir: 출력 JSON 파일 저장 디렉토리 경로
    """
    if not os.path.exists(output_dir):
        os.makedirs(output_dir)

    for file_name in os.listdir(input_dir):
        if file_name.endswith(".json"):  # JSON 파일만 처리
            input_path = os.path.join(input_dir, file_name)
            output_path = os.path.join(output_dir, f"coco_{file_name}")
            try:
                convert_to_coco(input_path, output_path)
            except Exception as e:
                print(f"Failed to process {input_path}: {e}")


# 실행부
if __name__ == "__main__":
    input_directory = "D:\\AI3\\team_2\\cctv_project\\dataset\\labels\\val"  # 입력 디렉토리
    output_directory = "D:\\AI3\\team_2\\cctv_project\\dataset\\labels\\val_coco"  # 출력 디렉토리

    process_all_json_in_directory(input_directory, output_directory)
