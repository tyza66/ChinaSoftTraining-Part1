package test;

import dao.StudentDao;
import dao.impl.StudentDaoImpl;
import org.junit.Test;
import pojo.Student;

import java.util.List;

/**
 * Author: tyza66
 * Date: 2023/04/17 15:00
 * Github: https://github.com/tyza66
 */
public class Test5 {

    @Test
    public void testStudentDao() {
        StudentDao studentDao = new StudentDaoImpl();
        List<Student> students = studentDao.queryStudent();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void testStudentDao2() {
        StudentDao studentDao = new StudentDaoImpl();
        Student student = studentDao.queryStudentById(1);
        System.out.println(student);
    }

    @Test
    public void testStudentDao3() {
        StudentDao studentDao = new StudentDaoImpl();
        int student = studentDao.deleteStudentById(1);
        System.out.println(student);
    }

    @Test
    public void testStudentDao4() {
        StudentDao studentDao = new StudentDaoImpl();
        List<Student> students = studentDao.queryStudentByMohu("三");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
