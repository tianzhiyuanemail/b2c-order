package com.b2c.common;

import java.io.Serializable;

public class Page<T extends Object> implements Serializable {


    //每页记录数
    private int code = 0;
    //
    private String msg = "";


    //总记录数
    private int count;
    //列表数据
    private T data;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Page(int count, T data) {
        this.count = count;
        this.data = data;
    }

    public Page() {
    }
}
