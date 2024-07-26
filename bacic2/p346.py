# datetime 모듈

import datetime as dt

time1 = dt.timedelta(days=3, hours=5, minutes =25)
time2 = dt.timedelta(days=3, hours=7, minutes =40)
print(time2-time1)

today = dt.date.today()
print(today)
print(today.year)

today = dt.date.today()
print(today)
week=dt.timedelta(weeks=1)
last_week = today - week
next_week = today + week
print("오늘 : ", today)
print("일주일 후 : ", next_week)
print("일주일 전 : ", last_week)

day1=dt.timedelta(days=3)
day1_3 = today +day1
print("3일 후 : ", day1_3)

today1 =dt.datetime.now()
print(today1)

today1 =dt.datetime.now()
print(today1.strftime('%Y년 %m월 %d일 %H시 %M분 %S초 %p %a'))

from datetime import datetime, timedelta
from dateutil.relativedelta import relativedelta as reD

months_4 = reD(months = 4)
last_4months = today - months_4
print('4개월 전 : ', last_4months)

