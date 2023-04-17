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
}
