package com.b2c.common;

import java.io.Serializable;

public class UploadResult<T extends Object> implements Serializable {


    //每页记录数
    private int code = 0;
    //
    private String msg = "";

    //列表数据
    private String data;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public UploadResult() {
    }
}
