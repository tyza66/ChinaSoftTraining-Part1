package com.mypack.dao;

import com.mypack.pojo.Student;

import java.util.List;

public interface StudentDao {


    public List<Student> queryAllStudents();

    public Student queryStudentById(int id);
}
