import torch
print("CUDA Available:", torch.cuda.is_available())
print("Device Count:", torch.cuda.device_count())
print("CUDA Version:", torch.version.cuda)
print("PyTorch Version:", torch.__version__)
