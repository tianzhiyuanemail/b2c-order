package com.b2c.common;

import java.io.Serializable;

/***
 * code 0 调用成功 1 调用失败
 * msg set方法默认使调用方法失败
 * data 返回数据
 * @param <T>
 */
public class HttpJsonResult<T extends Object> implements Serializable{


    //每页记录数
    private int code = 0;
    //
    private String msg = "";

    //列表数据
    private T data;

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
        this.code = 1;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;

        this.msg  = "调用成功";
    }
}
