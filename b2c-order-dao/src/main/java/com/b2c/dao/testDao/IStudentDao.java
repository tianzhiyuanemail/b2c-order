package com.b2c.dao.testDao;

import com.b2c.tests.Student;

/**
 * Created by Administrator on 2017/7/19 0019.
 */
public interface IStudentDao {


     Student selectByName(String name);
}
