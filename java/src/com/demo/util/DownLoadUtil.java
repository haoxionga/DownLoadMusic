package com.demo.util;


import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncodingAttributes;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * 工具类集合
 *
 * @author Rabbit_Lee
 */
public class DownLoadUtil {

    private static Object object = new Object();
    public static DownLoadUtil instance;

    public static DownLoadUtil getInstance() {
        synchronized (object) {
            if (instance == null) {
                instance = new DownLoadUtil();
            }
        }
        return instance;
    }

    /**
     * 传入要下载的图片的url列表，将url所对应的图片下载到本地
     *
     * @param
     */
    public void download(String urls, String filePath, OnDownloadFinishListener listener) {
        synchronized (object) {
            int imageNumber = 0;



            try {
                URL url = new URL(urls);
                DataInputStream dataInputStream = new DataInputStream(url.openStream());
                //创建文件流
                File file = new File(filePath);
                if (file.exists()) {
                    file.delete();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);

                byte[] buffer = new byte[1024];
                int length;

                while ((length = dataInputStream.read(buffer)) > 0) {
                    fileOutputStream.write(buffer, 0, length);
                }

                dataInputStream.close();
                fileOutputStream.close();
                imageNumber++;
                listener.onSuccess();
            } catch (Exception e) {
                e.printStackTrace();
                listener.onError();
            }
        }

    }




}
