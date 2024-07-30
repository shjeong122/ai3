import os
import shutil

if os.path.exists("new_file.txt") :
    print("존재")
    os.remove("new_file.txt")
else :
    print("존재하지 않음")


""" if os.path.exists("test") :
    print("빈 폴더 존재")
    os.rmdir("test")
else :
    print("존재하지 않음") """

os.chdir('./키워드리스트')
file_names = os.listdir()

for filename in file_names :
    print(os.listdir())

if os.path.exists("test") :
    print("파일 존재하는 폴더")
    shutil.rmtree("test")