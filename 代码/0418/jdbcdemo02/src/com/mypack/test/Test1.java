package com.mypack.test;

import com.mypack.dao.StudentDao;
import com.mypack.dao.impl.StudentDaoImpl;
import com.mypack.pojo.Student;

import com.mypack.util.DateUtil;
import org.junit.Test;

import java.util.List;

public class Test1 {

    private StudentDao dao = new StudentDaoImpl();

    @Test
    public void testQueryAll() {
        List<Student> students = dao.queryAllStudents();
        System.out.println(students);
    }


    @Test
    public void testQueryOne() {
        Student student = dao.queryStudentById(2);
        System.out.println(student);
    }

    @Test
    public void testDeleteOne() {
        int row = dao.deleteStudentById(4);
        System.out.println("删除了" + row + "行");
    }

    @Test
    public void testQueryByMohu() {
        List<Student> list = dao.queryStudentByMohu("张");
        System.out.println(list);
    }

    @Test
    public void testInsertOne() {
        Student student = new Student(4, "马超", 33, DateUtil.strToUtilDate("2019-10-12"), "北京", "aaa");
        dao.insertStudent(student);
    }

}
