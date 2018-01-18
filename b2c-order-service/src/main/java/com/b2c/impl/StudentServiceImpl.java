package com.b2c.impl;

import com.b2c.IStudentService;
import com.b2c.tests.Student;
import com.b2c.dao.testDao.IStudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/20 0020.
 */
@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentDao studentDao;


    @Override
    public Student selectByName(String name) {
        return studentDao.selectByName(name);
    }
}
