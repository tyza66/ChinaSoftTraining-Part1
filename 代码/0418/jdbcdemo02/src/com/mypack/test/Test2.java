package com.mypack.test;

import com.mypack.dao.StudentDao;
import com.mypack.dao.impl.StudentDaoImpl;
import com.mypack.pojo.Student;
import com.mypack.util.DateUtil;
import org.junit.Test;

public class Test2 {

    StudentDao dao=new StudentDaoImpl();

    @Test
    public void testInsertOne() {
        Student student = new Student(4, "马超", 33, DateUtil.strToUtilDate("2019-10-12"), "北京", "aaa");
        dao.insertStudent(student);
    }
}
