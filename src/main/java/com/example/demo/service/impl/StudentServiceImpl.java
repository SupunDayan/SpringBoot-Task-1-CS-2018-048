package com.example.demo.service.impl;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

//    @Override
//    public List<Student> getStudentByCity(String city) {
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student("CS/2018/004","Ashaka","Colombo"));
//        studentList.add(new Student("CS/2018/006","harshika","Colombo"));
//        studentList.add(new Student("CS/2018/010","Nadun perera","kalutara"));
//        studentList.add(new Student("CS/2018/001","Nadun hirushan","Gampaha"));
//
//        return studentList.stream().filter(student -> student.getCity().equals(city)).collect(Collectors.toList());
//    }


    @Override
    public List<Student> getStudentByCity(String city) {
        return studentRepository.findStudentByCity(city);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }
}
