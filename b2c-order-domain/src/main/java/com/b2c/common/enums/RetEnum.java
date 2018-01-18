package com.b2c.common.enums;

import java.util.HashMap;
import java.util.Map;

public enum RetEnum{
    SUCCESS(0,"SUCCESS::调用成功"),

    ERROR(1,"ERROR::调用调用失败");

    private static Map<String,String> map = new HashMap<String,String>(){};

    private Integer num ;

    private String message;


    public static Map<String, String> getMap(Integer num) {

        for (RetEnum retEnum :RetEnum.values()){
            if (retEnum.getNum()==num){
                map.clear();
                map.put(retEnum.getNum().toString(),retEnum.getMessage());
            }
        }

        return map;
    }


    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    RetEnum(Integer num, String message) {
        this.num = num;
        this.message = message;
    }
}