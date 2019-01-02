import string
import urllib
# coding=utf-8
import os
from urllib import request
from urllib.error import HTTPError
from urllib.parse import quote

from flask import json

searchUrl = "https://c.y.qq.com/soso/fcgi-bin/client_search_cp?ct=24&qqmusic_ver=1298&new_json=1&remoteplace=txt.yqq.song&searchid=61961083735928929&t=0&aggr=1&cr=1&catZhida=1&lossless=0&flag_qc=0&g_tk=5381&loginUin=0&hostUin=0&format=json&inCharset=utf8&outCharset=utf-8&notice=0&platform=yqq&needNewCode=0&n=20";
detailUrl = "https://c.y.qq.com/base/fcgi-bin/fcg_music_express_mobile3.fcg?g_tk=5381&loginUin=0&hostUin=0&format=json&inCharset=utf8&outCharset=utf-8&notice=0&platform=yqq&needNewCode=0&cid=205361747&&uin=0&guid=4558837181";


def getData(url, headers=None):
    # 需要用 urllib.parse.quote 转换
    s = quote(url, safe=string.printable)
    req = request.urlopen(s)
    if not headers == None:
        for k, v in headers:
            req.add_header(k, v)
            pass
        pass
    data = req.read().decode("utf-8")
    return data;
    pass


# searchHeader
mFolder = ""
mSongname = ""
mCallback = None
page = 0;

downCount=0

def downSuccess(size, name):
    global  downCount
    global  mCallback
    mCallback((name + "下载完成------已下载"+str(downCount)+"首"))
    global currentIndex
    global  page
    if (currentIndex == size - 1):
        print(str(page) + "全部下载完成")
        page += 1;
        search();
        pass
    downCount+=1
    pass


def downFail(size, name):
    global  downCount
    global  mCallback
    mCallback((name + " 下载失败------已下载"+str(downCount)+"首"))
    global currentIndex
    global page
    if (currentIndex == size - 1):
        print(str(page) + "全部下载完成")
        page += 1;
        search();
        pass
    downCount+=1
    pass



def downLoadMp3(url, path, size, name):

    if os.path.exists(path):
        os.remove(path)
        print((path+"被删除"))

    try:
        s = quote(url, safe=string.printable)
        urllib.request.urlretrieve(s, path)
        downSuccess(size,name)
    except HTTPError:
        downFail(size,name)
    pass


currentIndex = 0


def search():

    # 先判断目录是否存在
    folder = mFolder + "/" + mSongname;
    if not os.path.exists(folder):
        os.makedirs(folder)

    # 请求网络
    data = getData(searchUrl + "&w=" + mSongname + "&p=" + str(page))
    dataJson = json.loads(data)
    print(data)

    list_ = dataJson["data"]["song"]["list"]
    songSize = len(list_)
    if not list_ == None:
        for x in range(songSize):
            global currentIndex
            currentIndex = x
            songBean = list_[x]
            name = songBean["name"]
            songmid = songBean["file"]["media_mid"]
            fileName = "C400" + songmid + ".m4a";

            detailData = getData(detailUrl + "&songmid=" + songmid + "&filename=" + fileName)
            detail = json.loads(detailData)
            if not detail == None:

                detailBean = detail["data"]["items"][0]
                downLoadUrl = "http://dl.stream.qqmusic.qq.com/" + detailBean["filename"] + "?vkey=" + detailBean[
                    "vkey"] + "&guid=4558837181&uin=0&fromtag=66";

                #
                if  detailBean["vkey"].strip() != "" and len(detailBean["vkey"]) > 8:

                    # 开始下载
                    downLoadMp3(downLoadUrl, folder + "/" + name + ".m4a", songSize, name)
                else:
                    # 下载失败
                    downFail(songSize, name)

                pass

            pass

        pass
    else:
        global mCallback
        global downCount
        mCallback("全部下载完成，共下载"+str(downCount)+"首歌")


def downLoad(folder, songname, callBack):
    global mFolder
    mFolder = folder
    global mSongname
    mSongname = songname
    global mCallback
    mCallback = callBack
    global page
    page = 1;
    global  downCount
    downCount=0
    search();

    pass
