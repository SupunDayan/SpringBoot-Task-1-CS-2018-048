package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getStudentByCity(String city);
    List<Student> getAllStudents();
    Student createStudent(Student student);

}
