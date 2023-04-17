package dao;

import pojo.Student;

import java.util.List;

/**
 * Author: tyza66
 * Date: 2023/04/17 14:45
 * Github: https://github.com/tyza66
 */
public interface StudentDao {
    public List<Student> queryStudent();
    public Student queryStudentById(int id);
    public int deleteStudentById(int id);
    //模糊查询
    public List<Student> queryStudentByMohu(String mohu);
    public int addStudent(Student student);
    public int updateStudent(Student student);
}
