package me.colewagner.datasystem.service;

import me.colewagner.datasystem.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

}
