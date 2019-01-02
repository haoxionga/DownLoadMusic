package com.demo.util;

import it.sauronsoftware.jave.*;

import java.io.File;

public class FileFormatUtil {

    private static String sourPath = "/home/haoxiong/work/music/卓依婷/爱江山更爱美人.m4a";
    private static String sourceKey = ".m4a";
    private static  String targetKey=".mp3";

    public static void main(String[] args) {
        File file = new File(sourPath);
        forEachFile(file);
    }


    public static void forEachFile(File file) {
        if (file != null && file.exists()) {
            if (file.isFile()) {
                convertFile(file);
            } else if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File file1 : files) {
                    forEachFile(file1);
                }
            }
        }
    }

    /**
     * 将m4a文件转换成mp3
     */
    private static void convertFile(File source) {
        String path = source.getAbsolutePath();
        if (!path.contains(sourceKey)) {
            return;
        }
//
        path = path.replace(sourceKey, targetKey);
        File target = new File(path);
        AudioAttributes audio = new AudioAttributes();
        Encoder encoder = new Encoder();

        audio.setCodec("libmp3lame");
        EncodingAttributes attrs = new EncodingAttributes();
        attrs.setFormat("mp3");
        attrs.setAudioAttributes(audio);
        boolean isSuccess=false;
        try {
            encoder.encode(source, target, attrs);
            isSuccess=true;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InputFormatException e) {
            e.printStackTrace();
        } catch (EncoderException e) {
            e.printStackTrace();
        }finally {
            if (isSuccess){
                source.deleteOnExit();
            }

        }
    }

}
