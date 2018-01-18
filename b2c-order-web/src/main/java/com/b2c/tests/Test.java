package com.b2c.tests;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.b2c.IStudentService;
import org.springframework.web.multipart.MultipartRequest;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/7/15 0015.
 */

@RestController
@Slf4j
public class Test {

    @Autowired
    private IStudentService studentService;
    private Logger log = LoggerFactory.getLogger(Test.class);

    @RequestMapping("/aaa")
    public Student select(String name, HttpServletRequest request, MultipartRequest requests){

        ;
        Student student = studentService.selectByName(name);

        log.info("ssssssssssssssssssssssssssssssssssssssssssssssssss");
        log.error("wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
        return student;
    }


}
