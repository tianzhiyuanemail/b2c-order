package com.b2c.common;

import java.io.Serializable;

public class ServiceResult<T> implements Serializable{



    private boolean sec;

    private transient T code;

    private String mes;

    public void setSec(boolean seccess) {
        this.sec = seccess;
    }

    public boolean getSec() {
        return sec;
    }

    public void setError(String message){
        this.sec = false;
        this.mes = message;
    }

    public T getCode() {
        return code;
    }

    public void setCode(T code) {
        this.sec = true;
        this.code = code;
        this.mes = "调用成功";
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String message) {
        this.mes = message;
    }

    public ServiceResult(boolean seccess, T code, String message) {
        this.sec = seccess;
        this.code = code;
        this.mes = message;
    }

    public ServiceResult() {
    }
}
