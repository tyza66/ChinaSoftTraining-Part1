package com.mypack.dao;

import com.mypack.pojo.Student;

import java.util.List;

public interface StudentDao {


    public List<Student> queryAllStudents();

    public Student queryStudentById(int id);

    public int deleteStudentById(int id);

    //模糊查询
    public List<Student> queryStudentByMohu(String mohu);

    public int insertStudent(Student student);
}
