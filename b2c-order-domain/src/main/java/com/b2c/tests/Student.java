package com.b2c.tests;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
public class Student implements Serializable{

    private Integer id;
    private String  name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
