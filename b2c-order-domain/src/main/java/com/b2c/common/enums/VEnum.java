package com.b2c.common.enums;

public enum VEnum{

    first(1),second(2),third(3);

    private int num;

    public int getNum() {
        return num;
    }

    VEnum() {
    }

    VEnum(int num) {
        this.num = num;
    }
}
