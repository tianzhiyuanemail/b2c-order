package com.b2c.common.utils;

import com.github.pagehelper.PageHelper;

import java.util.Map;

public class PageUtil {

    public static void page(Map map){

        Object currPage = map.get("page");
        Object pageSize = map.get("limit");

        if (currPage!=null && pageSize != null){
            PageHelper.startPage(Integer.valueOf(currPage.toString()), Integer.valueOf(pageSize.toString()));
        }
    }

}
