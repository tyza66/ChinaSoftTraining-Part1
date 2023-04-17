package com.mypack.test;

import com.mypack.dao.StudentDao;
import com.mypack.dao.impl.StudentDaoImpl;
import com.mypack.pojo.Student;
import org.junit.Test;

import java.util.List;

public class Test1 {

    private StudentDao dao=new StudentDaoImpl();

    @Test
    public void testQueryAll(){
        List<Student> students = dao.queryAllStudents();
        System.out.println(students);
    }


    @Test
    public void testQueryOne(){
        Student student = dao.queryStudentById(2);
        System.out.println(student);
    }
}
