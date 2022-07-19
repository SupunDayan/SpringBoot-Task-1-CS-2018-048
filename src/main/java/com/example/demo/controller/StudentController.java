package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("/student-details")
    public ResponseEntity<List<Student>> studentDetails(@RequestParam String city){

        List<Student> studentList = studentService.getStudentByCity(city);

        if(studentList.isEmpty()){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(studentList,HttpStatus.OK);

    }

    @RequestMapping(value = "/student-list",method = RequestMethod.GET)
    public ResponseEntity<List<Student>> studentList(){
        return new ResponseEntity<>(studentService.getAllStudents(),HttpStatus.OK);
    }

    @PostMapping("/create-student")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        return new ResponseEntity<>(studentService.createStudent(student),HttpStatus.OK);
    }
}
