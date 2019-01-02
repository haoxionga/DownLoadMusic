package com.demo.entity;

import java.util.List;

public class SongDetailResult {

    /**
     * cid : 205361747
     * code : 0
     * data : {"expiration":80400,"items":[{"filename":"C400001eToTU4JMVKF.m4a","songmid":"001eToTU4JMVKF","subcode":0,"vkey":"9EE470D3DC5EA05BD5119AE0012353A348ECC70E73317484BDFEC6EB5826F2291DE9CC49A640169E39978DD2B366975F623EE46AE94542CF"}]}
     * userip : 118.116.104.226
     */

    private int cid;
    private int code;
    private DataBean data;
    private String userip;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

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

    public String getUserip() {
        return userip;
    }

    public void setUserip(String userip) {
        this.userip = userip;
    }

    public static class DataBean {
        /**
         * expiration : 80400
         * items : [{"filename":"C400001eToTU4JMVKF.m4a","songmid":"001eToTU4JMVKF","subcode":0,"vkey":"9EE470D3DC5EA05BD5119AE0012353A348ECC70E73317484BDFEC6EB5826F2291DE9CC49A640169E39978DD2B366975F623EE46AE94542CF"}]
         */

        private int expiration;
        private List<ItemsBean> items;

        public int getExpiration() {
            return expiration;
        }

        public void setExpiration(int expiration) {
            this.expiration = expiration;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class ItemsBean {
            /**
             * filename : C400001eToTU4JMVKF.m4a
             * songmid : 001eToTU4JMVKF
             * subcode : 0
             * vkey : 9EE470D3DC5EA05BD5119AE0012353A348ECC70E73317484BDFEC6EB5826F2291DE9CC49A640169E39978DD2B366975F623EE46AE94542CF
             */

            private String filename;
            private String songmid;
            private int subcode;
            private String vkey;

            public String getFilename() {
                return filename;
            }

            public void setFilename(String filename) {
                this.filename = filename;
            }

            public String getSongmid() {
                return songmid;
            }

            public void setSongmid(String songmid) {
                this.songmid = songmid;
            }

            public int getSubcode() {
                return subcode;
            }

            public void setSubcode(int subcode) {
                this.subcode = subcode;
            }

            public String getVkey() {
                return vkey;
            }

            public void setVkey(String vkey) {
                this.vkey = vkey;
            }
        }
    }
}
