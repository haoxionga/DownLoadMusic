package com.demo.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchResult {



    private int code;
    private DataBean data;
    private String message;
    private String notice;
    private int subcode;
    private int time;
    private String tips;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public int getSubcode() {
        return subcode;
    }

    public void setSubcode(int subcode) {
        this.subcode = subcode;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public static class DataBean {


        private String keyword;
        private int priority;
        private SemanticBean semantic;
        private SongBean song;
        private int totaltime;
        private ZhidaBean zhida;
        private List<?> qc;
        private List<?> taglist;

        public String getKeyword() {
            return keyword;
        }

        public void setKeyword(String keyword) {
            this.keyword = keyword;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public SemanticBean getSemantic() {
            return semantic;
        }

        public void setSemantic(SemanticBean semantic) {
            this.semantic = semantic;
        }

        public SongBean getSong() {
            return song;
        }

        public void setSong(SongBean song) {
            this.song = song;
        }

        public int getTotaltime() {
            return totaltime;
        }

        public void setTotaltime(int totaltime) {
            this.totaltime = totaltime;
        }

        public ZhidaBean getZhida() {
            return zhida;
        }

        public void setZhida(ZhidaBean zhida) {
            this.zhida = zhida;
        }

        public List<?> getQc() {
            return qc;
        }

        public void setQc(List<?> qc) {
            this.qc = qc;
        }

        public List<?> getTaglist() {
            return taglist;
        }

        public void setTaglist(List<?> taglist) {
            this.taglist = taglist;
        }

        public static class SemanticBean {
            /**
             * curnum : 0
             * curpage : 2
             * list : []
             * totalnum : 0
             */

            private int curnum;
            private int curpage;
            private int totalnum;
            private List<?> list;

            public int getCurnum() {
                return curnum;
            }

            public void setCurnum(int curnum) {
                this.curnum = curnum;
            }

            public int getCurpage() {
                return curpage;
            }

            public void setCurpage(int curpage) {
                this.curpage = curpage;
            }

            public int getTotalnum() {
                return totalnum;
            }

            public void setTotalnum(int totalnum) {
                this.totalnum = totalnum;
            }

            public List<?> getList() {
                return list;
            }

            public void setList(List<?> list) {
                this.list = list;
            }
        }

        public static class SongBean {


            private int curnum;
            private int curpage;
            private int totalnum;
            private List<ListBean> list;

            public int getCurnum() {
                return curnum;
            }

            public void setCurnum(int curnum) {
                this.curnum = curnum;
            }

            public int getCurpage() {
                return curpage;
            }

            public void setCurpage(int curpage) {
                this.curpage = curpage;
            }

            public int getTotalnum() {
                return totalnum;
            }

            public void setTotalnum(int totalnum) {
                this.totalnum = totalnum;
            }

            public List<ListBean> getList() {
                return list;
            }

            public void setList(List<ListBean> list) {
                this.list = list;
            }

            public static class ListBean {


                private ActionBean action;
                private AlbumBean album;
                private int chinesesinger;
                private String docid;
                private FileBean file;
                private int fnote;
                private int genre;
                private int id;
                private int index_album;
                private int index_cd;
                private int interval;
                private int isonly;
                private KsongBean ksong;
                private int language;
                private String lyric;
                private String lyric_hilight;
                private String mid;
                private MvBean mv;
                private String name;
                private int newStatus;
                private PayBean pay;
                private int pure;
                private int status;
                private String subtitle;
                private int t;
                private int tag;
                private String time_public;
                private String title;
                private String title_hilight;
                private int type;
                private String url;
                private int ver;
                private VolumeBean volume;
                private List<?> grp;
                private List<SingerBean> singer;

                public ActionBean getAction() {
                    return action;
                }

                public void setAction(ActionBean action) {
                    this.action = action;
                }

                public AlbumBean getAlbum() {
                    return album;
                }

                public void setAlbum(AlbumBean album) {
                    this.album = album;
                }

                public int getChinesesinger() {
                    return chinesesinger;
                }

                public void setChinesesinger(int chinesesinger) {
                    this.chinesesinger = chinesesinger;
                }

                public String getDocid() {
                    return docid;
                }

                public void setDocid(String docid) {
                    this.docid = docid;
                }

                public FileBean getFile() {
                    return file;
                }

                public void setFile(FileBean file) {
                    this.file = file;
                }

                public int getFnote() {
                    return fnote;
                }

                public void setFnote(int fnote) {
                    this.fnote = fnote;
                }

                public int getGenre() {
                    return genre;
                }

                public void setGenre(int genre) {
                    this.genre = genre;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getIndex_album() {
                    return index_album;
                }

                public void setIndex_album(int index_album) {
                    this.index_album = index_album;
                }

                public int getIndex_cd() {
                    return index_cd;
                }

                public void setIndex_cd(int index_cd) {
                    this.index_cd = index_cd;
                }

                public int getInterval() {
                    return interval;
                }

                public void setInterval(int interval) {
                    this.interval = interval;
                }

                public int getIsonly() {
                    return isonly;
                }

                public void setIsonly(int isonly) {
                    this.isonly = isonly;
                }

                public KsongBean getKsong() {
                    return ksong;
                }

                public void setKsong(KsongBean ksong) {
                    this.ksong = ksong;
                }

                public int getLanguage() {
                    return language;
                }

                public void setLanguage(int language) {
                    this.language = language;
                }

                public String getLyric() {
                    return lyric;
                }

                public void setLyric(String lyric) {
                    this.lyric = lyric;
                }

                public String getLyric_hilight() {
                    return lyric_hilight;
                }

                public void setLyric_hilight(String lyric_hilight) {
                    this.lyric_hilight = lyric_hilight;
                }

                public String getMid() {
                    return mid;
                }

                public void setMid(String mid) {
                    this.mid = mid;
                }

                public MvBean getMv() {
                    return mv;
                }

                public void setMv(MvBean mv) {
                    this.mv = mv;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getNewStatus() {
                    return newStatus;
                }

                public void setNewStatus(int newStatus) {
                    this.newStatus = newStatus;
                }

                public PayBean getPay() {
                    return pay;
                }

                public void setPay(PayBean pay) {
                    this.pay = pay;
                }

                public int getPure() {
                    return pure;
                }

                public void setPure(int pure) {
                    this.pure = pure;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getSubtitle() {
                    return subtitle;
                }

                public void setSubtitle(String subtitle) {
                    this.subtitle = subtitle;
                }

                public int getT() {
                    return t;
                }

                public void setT(int t) {
                    this.t = t;
                }

                public int getTag() {
                    return tag;
                }

                public void setTag(int tag) {
                    this.tag = tag;
                }

                public String getTime_public() {
                    return time_public;
                }

                public void setTime_public(String time_public) {
                    this.time_public = time_public;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getTitle_hilight() {
                    return title_hilight;
                }

                public void setTitle_hilight(String title_hilight) {
                    this.title_hilight = title_hilight;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public int getVer() {
                    return ver;
                }

                public void setVer(int ver) {
                    this.ver = ver;
                }

                public VolumeBean getVolume() {
                    return volume;
                }

                public void setVolume(VolumeBean volume) {
                    this.volume = volume;
                }

                public List<?> getGrp() {
                    return grp;
                }

                public void setGrp(List<?> grp) {
                    this.grp = grp;
                }

                public List<SingerBean> getSinger() {
                    return singer;
                }

                public void setSinger(List<SingerBean> singer) {
                    this.singer = singer;
                }

                public static class ActionBean {
                    /**
                     * alert : 100002
                     * icons : 8060
                     * msg : 14
                     * switch : 17413891
                     */

                    private int alert;
                    private int icons;
                    private int msg;
                    @SerializedName("switch")
                    private int switchX;

                    public int getAlert() {
                        return alert;
                    }

                    public void setAlert(int alert) {
                        this.alert = alert;
                    }

                    public int getIcons() {
                        return icons;
                    }

                    public void setIcons(int icons) {
                        this.icons = icons;
                    }

                    public int getMsg() {
                        return msg;
                    }

                    public void setMsg(int msg) {
                        this.msg = msg;
                    }

                    public int getSwitchX() {
                        return switchX;
                    }

                    public void setSwitchX(int switchX) {
                        this.switchX = switchX;
                    }
                }

                public static class AlbumBean {
                    /**
                     * id : 8268
                     * mid : 000fCODN0c3YPn
                     * name : 笨小孩 国语精选[1993-1998]
                     * subtitle :
                     * title : 笨小孩 国语精选[1993-1998]
                     * title_hilight : 笨小孩 国语精选[1993-1998]
                     */

                    private int id;
                    private String mid;
                    private String name;
                    private String subtitle;
                    private String title;
                    private String title_hilight;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getMid() {
                        return mid;
                    }

                    public void setMid(String mid) {
                        this.mid = mid;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getSubtitle() {
                        return subtitle;
                    }

                    public void setSubtitle(String subtitle) {
                        this.subtitle = subtitle;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getTitle_hilight() {
                        return title_hilight;
                    }

                    public void setTitle_hilight(String title_hilight) {
                        this.title_hilight = title_hilight;
                    }
                }

                public static class FileBean {
                    /**
                     * media_mid : 002D0bHt3zZrIr
                     * size_128 : 3867152
                     * size_320 : 9667590
                     * size_aac : 5419524
                     * size_ape : 24056589
                     * size_dts : 0
                     * size_flac : 24761954
                     * size_ogg : 5382013
                     * size_try : 0
                     * strMediaMid : 002D0bHt3zZrIr
                     * try_begin : 0
                     * try_end : 0
                     */

                    private String media_mid;
                    private int size_128;
                    private int size_320;
                    private int size_aac;
                    private int size_ape;
                    private int size_dts;
                    private int size_flac;
                    private int size_ogg;
                    private int size_try;
                    private String strMediaMid;
                    private int try_begin;
                    private int try_end;

                    public String getMedia_mid() {
                        return media_mid;
                    }

                    public void setMedia_mid(String media_mid) {
                        this.media_mid = media_mid;
                    }

                    public int getSize_128() {
                        return size_128;
                    }

                    public void setSize_128(int size_128) {
                        this.size_128 = size_128;
                    }

                    public int getSize_320() {
                        return size_320;
                    }

                    public void setSize_320(int size_320) {
                        this.size_320 = size_320;
                    }

                    public int getSize_aac() {
                        return size_aac;
                    }

                    public void setSize_aac(int size_aac) {
                        this.size_aac = size_aac;
                    }

                    public int getSize_ape() {
                        return size_ape;
                    }

                    public void setSize_ape(int size_ape) {
                        this.size_ape = size_ape;
                    }

                    public int getSize_dts() {
                        return size_dts;
                    }

                    public void setSize_dts(int size_dts) {
                        this.size_dts = size_dts;
                    }

                    public int getSize_flac() {
                        return size_flac;
                    }

                    public void setSize_flac(int size_flac) {
                        this.size_flac = size_flac;
                    }

                    public int getSize_ogg() {
                        return size_ogg;
                    }

                    public void setSize_ogg(int size_ogg) {
                        this.size_ogg = size_ogg;
                    }

                    public int getSize_try() {
                        return size_try;
                    }

                    public void setSize_try(int size_try) {
                        this.size_try = size_try;
                    }

                    public String getStrMediaMid() {
                        return strMediaMid;
                    }

                    public void setStrMediaMid(String strMediaMid) {
                        this.strMediaMid = strMediaMid;
                    }

                    public int getTry_begin() {
                        return try_begin;
                    }

                    public void setTry_begin(int try_begin) {
                        this.try_begin = try_begin;
                    }

                    public int getTry_end() {
                        return try_end;
                    }

                    public void setTry_end(int try_end) {
                        this.try_end = try_end;
                    }
                }

                public static class KsongBean {
                    /**
                     * id : 2432842
                     * mid : 000oo5pR1B6RCT
                     */

                    private int id;
                    private String mid;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getMid() {
                        return mid;
                    }

                    public void setMid(String mid) {
                        this.mid = mid;
                    }
                }

                public static class MvBean {
                    /**
                     * id : 207654
                     * vid : q0012qy4ljb
                     */

                    private int id;
                    private String vid;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getVid() {
                        return vid;
                    }

                    public void setVid(String vid) {
                        this.vid = vid;
                    }
                }

                public static class PayBean {
                    /**
                     * pay_down : 1
                     * pay_month : 1
                     * pay_play : 0
                     * pay_status : 0
                     * price_album : 0
                     * price_track : 200
                     * time_free : 0
                     */

                    private int pay_down;
                    private int pay_month;
                    private int pay_play;
                    private int pay_status;
                    private int price_album;
                    private int price_track;
                    private int time_free;

                    public int getPay_down() {
                        return pay_down;
                    }

                    public void setPay_down(int pay_down) {
                        this.pay_down = pay_down;
                    }

                    public int getPay_month() {
                        return pay_month;
                    }

                    public void setPay_month(int pay_month) {
                        this.pay_month = pay_month;
                    }

                    public int getPay_play() {
                        return pay_play;
                    }

                    public void setPay_play(int pay_play) {
                        this.pay_play = pay_play;
                    }

                    public int getPay_status() {
                        return pay_status;
                    }

                    public void setPay_status(int pay_status) {
                        this.pay_status = pay_status;
                    }

                    public int getPrice_album() {
                        return price_album;
                    }

                    public void setPrice_album(int price_album) {
                        this.price_album = price_album;
                    }

                    public int getPrice_track() {
                        return price_track;
                    }

                    public void setPrice_track(int price_track) {
                        this.price_track = price_track;
                    }

                    public int getTime_free() {
                        return time_free;
                    }

                    public void setTime_free(int time_free) {
                        this.time_free = time_free;
                    }
                }

                public static class VolumeBean {
                    /**
                     * gain : -5.64900016784668
                     * lra : 10.14599990844727
                     * peak : 0.9890000224113464
                     */

                    private double gain;
                    private double lra;
                    private double peak;

                    public double getGain() {
                        return gain;
                    }

                    public void setGain(double gain) {
                        this.gain = gain;
                    }

                    public double getLra() {
                        return lra;
                    }

                    public void setLra(double lra) {
                        this.lra = lra;
                    }

                    public double getPeak() {
                        return peak;
                    }

                    public void setPeak(double peak) {
                        this.peak = peak;
                    }
                }

                public static class SingerBean {
                    /**
                     * id : 163
                     * mid : 003aQYLo2x8izP
                     * name : 刘德华
                     * title : 刘德华
                     * title_hilight : <em>刘德华</em>
                     */

                    private int id;
                    private String mid;
                    private String name;
                    private String title;
                    private String title_hilight;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getMid() {
                        return mid;
                    }

                    public void setMid(String mid) {
                        this.mid = mid;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getTitle_hilight() {
                        return title_hilight;
                    }

                    public void setTitle_hilight(String title_hilight) {
                        this.title_hilight = title_hilight;
                    }
                }
            }
        }

        public static class ZhidaBean {
            /**
             * chinesesinger : 0
             * type : 1
             * zhida_singer : {"albumNum":117,"hotalbum":[{"albumID":33846,"albumMID":"00045jMv2hcbmO","albumName":"Wonderful World 2007香港演唱会","albumname_hilight":"Wonderful World 2007香港演唱会"},{"albumID":36187,"albumMID":"001jDc1M0WAthx","albumName":"刘德华中国巡回演唱会·上海","albumname_hilight":"刘德华中国巡回演唱会·上海"},{"albumID":13627,"albumMID":"001MYVwe23zYvz","albumName":"一起走过的日子","albumname_hilight":"一起走过的日子"},{"albumID":22331,"albumMID":"000QP4Le0eiYFO","albumName":"Melody Andy","albumname_hilight":"Melody Andy"},{"albumID":61554,"albumMID":"0016xifY0Z0TEo","albumName":"Unforgettable","albumname_hilight":"Unforgettable"},{"albumID":8267,"albumMID":"003V9RQC25xddw","albumName":"爱在刻骨铭心时","albumname_hilight":"爱在刻骨铭心时"},{"albumID":13628,"albumMID":"0037KtUw0RDrLy","albumName":"谢谢你的爱","albumname_hilight":"谢谢你的爱"},{"albumID":8268,"albumMID":"000fCODN0c3YPn","albumName":"笨小孩 国语精选[1993-1998]","albumname_hilight":"笨小孩 国语精选[1993-1998]"},{"albumID":8269,"albumMID":"004A6KAD4ZoIub","albumName":"来生缘","albumname_hilight":"来生缘"},{"albumID":56862,"albumMID":"004CthGu1ZFWp6","albumName":"醉暖情声·爱与真","albumname_hilight":"醉暖情声·爱与真"}],"hotsong":[{"f":"153811|一起走过的日子|163|刘德华|13627|一起走过的日子|1913461|236|8|1|0|9495503|3777224|320000|0|23297862|23931671|5157425|5632042|0|004FvJ4U0Ipopf|003aQYLo2x8izP|001MYVwe23zYvz|0|8013","songID":153811,"songMID":"004FvJ4U0Ipopf","songName":"一起走过的日子","songname_hilight":"一起走过的日子"},{"f":"98538|来生缘|163|刘德华|8269|来生缘|1918961|236|8|1|0|9479490|3790854|320000|0|23433887|24081807|5080128|5520999|0|0032qfIn1Tzdbq|003aQYLo2x8izP|004A6KAD4ZoIub|0|4009","songID":98538,"songMID":"0032qfIn1Tzdbq","songName":"来生缘","songname_hilight":"来生缘"},{"f":"8151482|忘情水|163|刘德华|20093|忘情水|2278970|264|3|1|0|10576651|4230776|320000|0|25158084|26807087|5769409|6202284|0|001VNZ7u2BWZhs|003aQYLo2x8izP|004PDB6S0DGTmZ|0|4009","songID":8151482,"songMID":"001VNZ7u2BWZhs","songName":"忘情水","songname_hilight":"忘情水"},{"f":"413859|兄弟|163|刘德华|33445|Everyone Is No.1|1978603|243|10|1|0|9719891|3896676|320000|0|30987179|31723597|6265948|6156220|0|002TrbOP1iPSDf|003aQYLo2x8izP|003H8fyC2COWJ4|0|4009","songID":413859,"songMID":"002TrbOP1iPSDf","songName":"兄弟","songname_hilight":"兄弟"},{"f":"7091652|冰雨|163|刘德华|8267|爱在刻骨铭心时|2390976|277|7|1|0|11100151|4440180|320000|0|28768958|29392348|6419588|6612203|0|0041Ce4o4UPUmu|003aQYLo2x8izP|003V9RQC25xddw|0|4009","songID":7091652,"songMID":"0041Ce4o4UPUmu","songName":"冰雨","songname_hilight":"冰雨"},{"f":"153828|谢谢你的爱|163|刘德华|13628|谢谢你的爱|2267933|280|5|1|0|11199418|4481903|320000|0|28965548|29213004|6245882|6680636|0|002dOuqi1jL6DW|003aQYLo2x8izP|0037KtUw0RDrLy|0|8013","songID":153828,"songMID":"002dOuqi1jL6DW","songName":"谢谢你的爱","songname_hilight":"谢谢你的爱"},{"f":"1136758|冰雨|163|刘德华|96781|Unforgettable 中国巡回演唱会2011|3084075|379|1|1|0|15181429|6074098|320000|0|35513387|35862771|7858798|8701217|0|003P29H23ClvTt|003aQYLo2x8izP|000b79wf3pGa96|0|8013","songID":1136758,"songMID":"003P29H23ClvTt","songName":"冰雨","songname_hilight":"冰雨"},{"f":"874881|暗里着迷|163|刘德华|33846|Wonderful World 2007香港演唱会|1849431|226|9|1|0|9058397|3630018|320000|0|25033038|25341655|5160898|5601005|0|003dIM7m02Fpo9|003aQYLo2x8izP|00045jMv2hcbmO|0|8013","songID":874881,"songMID":"003dIM7m02Fpo9","songName":"暗里着迷","songname_hilight":"暗里着迷"},{"f":"153541|练习|163|刘德华|13604|美丽的一天|2114931|261|8|1|0|10418855|4177629|320000|0|25501357|26906455|5951775|6075090|0|002Q4Jgw0dxWxt|003aQYLo2x8izP|004Dhl9z3VsEHs|0|4009","songID":153541,"songMID":"002Q4Jgw0dxWxt","songName":"练习","songname_hilight":"练习"},{"f":"153691|如果你是我的传说|163|刘德华|13619|如果你是我的传说|2470990|286|8|1|0|11475283|4590241|811000|0|28953831|28997860|6389693|6772911|0|000odSDn1syxEu|003aQYLo2x8izP|000HKYHZ0tzMb8|0|8013","songID":153691,"songMID":"000odSDn1syxEu","songName":"如果你是我的传说","songname_hilight":"如果你是我的传说"}],"mvNum":1088,"singerID":163,"singerMID":"003aQYLo2x8izP","singerName":"刘德华","singerPic":"http://i.gtimg.cn/music/photo/mid_singer_180/z/P/003aQYLo2x8izP.jpg","singername_hilight":"刘德华","songNum":1065}
             */

            private int chinesesinger;
            private int type;
            private ZhidaSingerBean zhida_singer;

            public int getChinesesinger() {
                return chinesesinger;
            }

            public void setChinesesinger(int chinesesinger) {
                this.chinesesinger = chinesesinger;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public ZhidaSingerBean getZhida_singer() {
                return zhida_singer;
            }

            public void setZhida_singer(ZhidaSingerBean zhida_singer) {
                this.zhida_singer = zhida_singer;
            }

            public static class ZhidaSingerBean {
                /**
                 * albumNum : 117
                 * hotalbum : [{"albumID":33846,"albumMID":"00045jMv2hcbmO","albumName":"Wonderful World 2007香港演唱会","albumname_hilight":"Wonderful World 2007香港演唱会"},{"albumID":36187,"albumMID":"001jDc1M0WAthx","albumName":"刘德华中国巡回演唱会·上海","albumname_hilight":"刘德华中国巡回演唱会·上海"},{"albumID":13627,"albumMID":"001MYVwe23zYvz","albumName":"一起走过的日子","albumname_hilight":"一起走过的日子"},{"albumID":22331,"albumMID":"000QP4Le0eiYFO","albumName":"Melody Andy","albumname_hilight":"Melody Andy"},{"albumID":61554,"albumMID":"0016xifY0Z0TEo","albumName":"Unforgettable","albumname_hilight":"Unforgettable"},{"albumID":8267,"albumMID":"003V9RQC25xddw","albumName":"爱在刻骨铭心时","albumname_hilight":"爱在刻骨铭心时"},{"albumID":13628,"albumMID":"0037KtUw0RDrLy","albumName":"谢谢你的爱","albumname_hilight":"谢谢你的爱"},{"albumID":8268,"albumMID":"000fCODN0c3YPn","albumName":"笨小孩 国语精选[1993-1998]","albumname_hilight":"笨小孩 国语精选[1993-1998]"},{"albumID":8269,"albumMID":"004A6KAD4ZoIub","albumName":"来生缘","albumname_hilight":"来生缘"},{"albumID":56862,"albumMID":"004CthGu1ZFWp6","albumName":"醉暖情声·爱与真","albumname_hilight":"醉暖情声·爱与真"}]
                 * hotsong : [{"f":"153811|一起走过的日子|163|刘德华|13627|一起走过的日子|1913461|236|8|1|0|9495503|3777224|320000|0|23297862|23931671|5157425|5632042|0|004FvJ4U0Ipopf|003aQYLo2x8izP|001MYVwe23zYvz|0|8013","songID":153811,"songMID":"004FvJ4U0Ipopf","songName":"一起走过的日子","songname_hilight":"一起走过的日子"},{"f":"98538|来生缘|163|刘德华|8269|来生缘|1918961|236|8|1|0|9479490|3790854|320000|0|23433887|24081807|5080128|5520999|0|0032qfIn1Tzdbq|003aQYLo2x8izP|004A6KAD4ZoIub|0|4009","songID":98538,"songMID":"0032qfIn1Tzdbq","songName":"来生缘","songname_hilight":"来生缘"},{"f":"8151482|忘情水|163|刘德华|20093|忘情水|2278970|264|3|1|0|10576651|4230776|320000|0|25158084|26807087|5769409|6202284|0|001VNZ7u2BWZhs|003aQYLo2x8izP|004PDB6S0DGTmZ|0|4009","songID":8151482,"songMID":"001VNZ7u2BWZhs","songName":"忘情水","songname_hilight":"忘情水"},{"f":"413859|兄弟|163|刘德华|33445|Everyone Is No.1|1978603|243|10|1|0|9719891|3896676|320000|0|30987179|31723597|6265948|6156220|0|002TrbOP1iPSDf|003aQYLo2x8izP|003H8fyC2COWJ4|0|4009","songID":413859,"songMID":"002TrbOP1iPSDf","songName":"兄弟","songname_hilight":"兄弟"},{"f":"7091652|冰雨|163|刘德华|8267|爱在刻骨铭心时|2390976|277|7|1|0|11100151|4440180|320000|0|28768958|29392348|6419588|6612203|0|0041Ce4o4UPUmu|003aQYLo2x8izP|003V9RQC25xddw|0|4009","songID":7091652,"songMID":"0041Ce4o4UPUmu","songName":"冰雨","songname_hilight":"冰雨"},{"f":"153828|谢谢你的爱|163|刘德华|13628|谢谢你的爱|2267933|280|5|1|0|11199418|4481903|320000|0|28965548|29213004|6245882|6680636|0|002dOuqi1jL6DW|003aQYLo2x8izP|0037KtUw0RDrLy|0|8013","songID":153828,"songMID":"002dOuqi1jL6DW","songName":"谢谢你的爱","songname_hilight":"谢谢你的爱"},{"f":"1136758|冰雨|163|刘德华|96781|Unforgettable 中国巡回演唱会2011|3084075|379|1|1|0|15181429|6074098|320000|0|35513387|35862771|7858798|8701217|0|003P29H23ClvTt|003aQYLo2x8izP|000b79wf3pGa96|0|8013","songID":1136758,"songMID":"003P29H23ClvTt","songName":"冰雨","songname_hilight":"冰雨"},{"f":"874881|暗里着迷|163|刘德华|33846|Wonderful World 2007香港演唱会|1849431|226|9|1|0|9058397|3630018|320000|0|25033038|25341655|5160898|5601005|0|003dIM7m02Fpo9|003aQYLo2x8izP|00045jMv2hcbmO|0|8013","songID":874881,"songMID":"003dIM7m02Fpo9","songName":"暗里着迷","songname_hilight":"暗里着迷"},{"f":"153541|练习|163|刘德华|13604|美丽的一天|2114931|261|8|1|0|10418855|4177629|320000|0|25501357|26906455|5951775|6075090|0|002Q4Jgw0dxWxt|003aQYLo2x8izP|004Dhl9z3VsEHs|0|4009","songID":153541,"songMID":"002Q4Jgw0dxWxt","songName":"练习","songname_hilight":"练习"},{"f":"153691|如果你是我的传说|163|刘德华|13619|如果你是我的传说|2470990|286|8|1|0|11475283|4590241|811000|0|28953831|28997860|6389693|6772911|0|000odSDn1syxEu|003aQYLo2x8izP|000HKYHZ0tzMb8|0|8013","songID":153691,"songMID":"000odSDn1syxEu","songName":"如果你是我的传说","songname_hilight":"如果你是我的传说"}]
                 * mvNum : 1088
                 * singerID : 163
                 * singerMID : 003aQYLo2x8izP
                 * singerName : 刘德华
                 * singerPic : http://i.gtimg.cn/music/photo/mid_singer_180/z/P/003aQYLo2x8izP.jpg
                 * singername_hilight : 刘德华
                 * songNum : 1065
                 */

                private int albumNum;
                private int mvNum;
                private int singerID;
                private String singerMID;
                private String singerName;
                private String singerPic;
                private String singername_hilight;
                private int songNum;
                private List<HotalbumBean> hotalbum;
                private List<HotsongBean> hotsong;

                public int getAlbumNum() {
                    return albumNum;
                }

                public void setAlbumNum(int albumNum) {
                    this.albumNum = albumNum;
                }

                public int getMvNum() {
                    return mvNum;
                }

                public void setMvNum(int mvNum) {
                    this.mvNum = mvNum;
                }

                public int getSingerID() {
                    return singerID;
                }

                public void setSingerID(int singerID) {
                    this.singerID = singerID;
                }

                public String getSingerMID() {
                    return singerMID;
                }

                public void setSingerMID(String singerMID) {
                    this.singerMID = singerMID;
                }

                public String getSingerName() {
                    return singerName;
                }

                public void setSingerName(String singerName) {
                    this.singerName = singerName;
                }

                public String getSingerPic() {
                    return singerPic;
                }

                public void setSingerPic(String singerPic) {
                    this.singerPic = singerPic;
                }

                public String getSingername_hilight() {
                    return singername_hilight;
                }

                public void setSingername_hilight(String singername_hilight) {
                    this.singername_hilight = singername_hilight;
                }

                public int getSongNum() {
                    return songNum;
                }

                public void setSongNum(int songNum) {
                    this.songNum = songNum;
                }

                public List<HotalbumBean> getHotalbum() {
                    return hotalbum;
                }

                public void setHotalbum(List<HotalbumBean> hotalbum) {
                    this.hotalbum = hotalbum;
                }

                public List<HotsongBean> getHotsong() {
                    return hotsong;
                }

                public void setHotsong(List<HotsongBean> hotsong) {
                    this.hotsong = hotsong;
                }

                public static class HotalbumBean {
                    /**
                     * albumID : 33846
                     * albumMID : 00045jMv2hcbmO
                     * albumName : Wonderful World 2007香港演唱会
                     * albumname_hilight : Wonderful World 2007香港演唱会
                     */

                    private int albumID;
                    private String albumMID;
                    private String albumName;
                    private String albumname_hilight;

                    public int getAlbumID() {
                        return albumID;
                    }

                    public void setAlbumID(int albumID) {
                        this.albumID = albumID;
                    }

                    public String getAlbumMID() {
                        return albumMID;
                    }

                    public void setAlbumMID(String albumMID) {
                        this.albumMID = albumMID;
                    }

                    public String getAlbumName() {
                        return albumName;
                    }

                    public void setAlbumName(String albumName) {
                        this.albumName = albumName;
                    }

                    public String getAlbumname_hilight() {
                        return albumname_hilight;
                    }

                    public void setAlbumname_hilight(String albumname_hilight) {
                        this.albumname_hilight = albumname_hilight;
                    }
                }

                public static class HotsongBean {
                    /**
                     * f : 153811|一起走过的日子|163|刘德华|13627|一起走过的日子|1913461|236|8|1|0|9495503|3777224|320000|0|23297862|23931671|5157425|5632042|0|004FvJ4U0Ipopf|003aQYLo2x8izP|001MYVwe23zYvz|0|8013
                     * songID : 153811
                     * songMID : 004FvJ4U0Ipopf
                     * songName : 一起走过的日子
                     * songname_hilight : 一起走过的日子
                     */

                    private String f;
                    private int songID;
                    private String songMID;
                    private String songName;
                    private String songname_hilight;

                    public String getF() {
                        return f;
                    }

                    public void setF(String f) {
                        this.f = f;
                    }

                    public int getSongID() {
                        return songID;
                    }

                    public void setSongID(int songID) {
                        this.songID = songID;
                    }

                    public String getSongMID() {
                        return songMID;
                    }

                    public void setSongMID(String songMID) {
                        this.songMID = songMID;
                    }

                    public String getSongName() {
                        return songName;
                    }

                    public void setSongName(String songName) {
                        this.songName = songName;
                    }

                    public String getSongname_hilight() {
                        return songname_hilight;
                    }

                    public void setSongname_hilight(String songname_hilight) {
                        this.songname_hilight = songname_hilight;
                    }
                }
            }
        }
    }
}
