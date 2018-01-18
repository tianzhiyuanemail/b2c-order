package com.b2c.common.enums;


/***
 * OSS  文件夹设置
 */

public enum OSSEnums {

    PRODUCT("proudct/");

    private String  name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    OSSEnums(String name) {
        this.name = name;
    }
}
