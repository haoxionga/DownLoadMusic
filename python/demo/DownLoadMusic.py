# coding=utf-8
import threading
from tkinter import *
from tkinter.filedialog import askdirectory

from demo import UrlUtil;

master = Tk()
def callBack(time):
    print(time)
    hintLabel.config(text=time)
    pass

def downLoad():
    #开启新线程操作
    _thread = threading.Thread(target=UrlUtil.downLoad, args=(enFolder.get(),enSoung.get(),callBack))
    _thread.setDaemon(True)
    _thread.start()#启动线程

    # UrlUtil.downLoad(enFolder.get(),enSoung.get(),callBack)
    pass


def selectFolder():
    path_ = askdirectory()
    path.set(path_)
    pass


f = Frame(master, height=320, width=480, bg="#ffffff")
f.pack_propagate(0)  # don't shrink
f.pack()

# 第一行
Label(f, text="请输入歌手名称:", bg="#fff").place(x=10, y=10, width=100, height=30)
enSoung = Entry(f)
enSoung.place(x=140, y=10, width=100, height=30)

path = StringVar()
# 第二行
Label(f, text="请选择保存目录:", bg="#fff").place(x=10, y=50, width=100, height=30)
enFolder=Entry(f, textvariable=path)
enFolder.place(x=140, y=50, width=200, height=30)
Button(f, text="浏览", command=selectFolder).place(x=344, y=50, width=100, height=30)

Button(f, text="开始下载!", command=downLoad).place(x=140, y=100, width=100, height=30)

hintLabel = Label(f, text="等待中", bg="#fff")
hintLabel.pack(side=LEFT)
hintLabel.place(x=10, y=140, width=340, height=30)
mainloop()
