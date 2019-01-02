package com.demo;

import com.demo.entity.SearchResult;
import com.demo.entity.SongDetailResult;
import com.demo.util.DownLoadUtil;
import com.demo.util.GsonUtils;
import com.demo.util.HttpUtil;
import com.demo.util.OnDownloadFinishListener;

import java.io.File;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static String searchUrl = "https://c.y.qq.com/soso/fcgi-bin/client_search_cp?ct=24&qqmusic_ver=1298&new_json=1&remoteplace=txt.yqq.song&searchid=61961083735928929&t=0&aggr=1&cr=1&catZhida=1&lossless=0&flag_qc=0&g_tk=5381&loginUin=0&hostUin=0&format=json&inCharset=utf8&outCharset=utf-8&notice=0&platform=yqq&needNewCode=0&n=20";
    public static String detailUrl = "https://c.y.qq.com/base/fcgi-bin/fcg_music_express_mobile3.fcg?g_tk=5381&loginUin=0&hostUin=0&format=json&inCharset=utf8&outCharset=utf-8&notice=0&platform=yqq&needNewCode=0&cid=205361747&&uin=0&guid=4558837181";
	
	//搜索关键字
    public static String key = "周笔畅";
	//保存目录
    public static String savePath = "F:\\music\\" + key + "\\";

    public static void main(String[] args) {
        File file = new File(savePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        Main main = new Main();
        main.search();
    }

    private void search() {
        https://c.y.qq.com/soso/fcgi-bin/client_search_cp?ct=24&qqmusic_ver=1298&new_json=1&remoteplace=txt.yqq.song&searchid=61961083735928929&t=0&aggr=1&cr=1&catZhida=1&lossless=0&flag_qc=0&g_tk=5381&loginUin=0&hostUin=0&format=json&inCharset=utf8&outCharset=utf-8&notice=0&platform=yqq&needNewCode=0&n=20&w=刘德华&p=1

        System.out.println("--------------------------" + page);
        //获取搜索到的结果
        HashMap<String, String> paramsMap = new HashMap<>();
        paramsMap.put("w", key);
        paramsMap.put("p", String.valueOf(page));
        String searchResult = HttpUtil.getResponseByData(searchUrl, paramsMap);
        SearchResult result = GsonUtils.getInstance().deser(searchResult, SearchResult.class);
        List<SearchResult.DataBean.SongBean.ListBean> songList = result.getData().getSong().getList();
        downLoadFile(songList);
    }


    private boolean isHaveNext = true;

    private int page = 1;

    private int currentIndex;

    private void downLoadFile(List<SearchResult.DataBean.SongBean.ListBean> songList) {
        int size = songList.size();
        for (int i = 0; i < size; i++) {
            currentIndex = i;
            SearchResult.DataBean.SongBean.ListBean listBean = songList.get(i);
            String name = listBean.getName();
            String songmid = listBean.getFile().getMedia_mid();
            String fileName = "C400" + songmid + ".m4a";

            HashMap<String, String> map = new HashMap<>();
            map.put("songmid", songmid);
            map.put("filename", fileName);
            String response = HttpUtil.getResponseByData(detailUrl, map);
            SongDetailResult detailResult = GsonUtils.getInstance().deser(response, SongDetailResult.class);
            SongDetailResult.DataBean.ItemsBean bean = detailResult.getData().getItems().get(0);
            String downLoadUrl = "http://dl.stream.qqmusic.qq.com/" + bean.getFilename() + "?vkey=" + bean.getVkey() + "&guid=4558837181&uin=0&fromtag=66";

            if (bean.getVkey() != null && bean.getVkey().length() > 8) {
                DownLoadUtil.getInstance().download(downLoadUrl, savePath + name + ".m4a", new OnDownloadFinishListener() {
                    @Override
                    public void onSuccess() {
                        downSuccess(size, name);
                    }

                    @Override
                    public void onError() {
                        downFail(size, name);
                    }
                });
            } else {
                downFail(size, name);
            }

        }
    }

    private void downSuccess(int size, String x) {
        System.out.println(x + "下载完成");

        if (currentIndex == size - 1) {
            System.out.println(page + "全部下载完成");
            page += 1;
            search();
        }
    }

    private void downFail(int size, String name) {
        System.out.println(name + "下载失败");
        if (currentIndex == size - 1) {
            System.out.println(page + "全部下载完成");
            page += 1;
            search();
        }
    }


}
