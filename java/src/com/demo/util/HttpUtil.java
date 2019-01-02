package com.demo.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HttpUtil {


    /**
     * 访问网络工具类
     */
    public static String getResponseByData(String url, Map<String, String> params) {

        try {

            String newUrl = getNewUrl(url, params);
            URL net = new URL(newUrl);
            ByteArrayOutputStream outStream = new ByteArrayOutputStream();
            HttpURLConnection connect = (HttpURLConnection) (net.openConnection());
            connect.setRequestMethod("GET");
            connect.setDoOutput(true);
            connect.setConnectTimeout(1000 * 10);
            connect.setReadTimeout(1000 * 80);
            connect.setRequestProperty("ContentType", "application/x-www-form-urlencoded"); //采用通用的URL百分号编码的数据MIME类型来传参和设置请求头
            connect.setDoInput(true);
            // 连接
            connect.connect();
            // 接收数据
            int responseCode = connect.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                InputStream in = connect.getInputStream();
                byte[] data = new byte[1024];
                int len = 0;
                while ((len = in.read(data, 0, data.length)) != -1) {
                    outStream.write(data, 0, len);
                }
                in.close();
            }
            // 关闭连接
            connect.disconnect();
            String response = outStream.toString("UTF-8");
            return response;

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return "";
    }

    private static String getNewUrl(String url, Map<String, String> params) {

        Set<Map.Entry<String, String>> set = params.entrySet();
        Iterator<Map.Entry<String, String>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String param = "&" + key + "=" + params.get(key);
            url += param;
        }

        return url;
    }
}
