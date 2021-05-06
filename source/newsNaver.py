import requests
from bs4 import BeautifulSoup
import csv
import urllib.request
import ssl

urla = 'https://search.naver.com/search.naver?where=news&query='
urlb = '게임'
url = urla+urlb
idx = 0

res = requests.get(url)
res.raise_for_status()
news = BeautifulSoup(res.text, "lxml")

news_list = news.find_all("a", attrs={"class": "news_tit"})

with open('newsNaver.csv', 'a', encoding='UTF-8', newline='') as csvFile:
    writer = csv.writer(csvFile)
    if idx == 0:
        writer.writerow(("INDEX", 'NEWS_TITTLE', 'URL'))

    for a in range(len(news_list)):
        idx += 1
        title = news_list[a].get('title')
        url = news_list[a].get('href')
        writer.writerow((idx, title, url,))
        print(idx, "번째 기사가 입력되었습니다. ")
