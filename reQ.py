# 데이터를 사이트에서 검색해 오기
# 함수의 집합 library < module

import requests as req   # : 축약
url = "https://search.naver.com/search.naver"
rData = req.get(url, params = {'query' : '백일해 증상'})
print(rData.text)

