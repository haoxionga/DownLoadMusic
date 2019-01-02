package com.demo.util;


import com.google.gson.Gson;


public class GsonUtils {

    private static GsonUtils instance;
    private static Object object = new Object();

    public static GsonUtils getInstance() {
        synchronized (object) {
            if (instance == null) {
                instance = new GsonUtils();
            }
            return instance;
        }

    }

    ;
    private Gson gson;

    public GsonUtils() {
        gson = new Gson();
    }


    /**
     * Gson字符串转可序列化对象
     *
     * @param object
     * @return
     */
    public <T extends Object> T deser(String object, Class<T> clazzt) {

        T result = null;
        try {
                result = gson.fromJson(object, clazzt);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }


    public String objectToJson(Object o) {
        String s = gson.toJson(o);
        return s
                ;
    }


    /**
     * Gson字符串转可序列化对象
     *
     * @param object
     * @param clazz
     * @return
     */
//    public  <T extends Object> T deser(String object, Class<T> clazz) {
//
//        T result = null;
//        try {
//            result = gson.fromJson(object, clazz);
//        } catch (Exception e) {
//            result = null;
//            e.printStackTrace();
//            Log.d("Gsontil", "解析出错了");
//        }
//
//        return result;
//    }

}