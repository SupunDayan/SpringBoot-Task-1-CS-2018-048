package com.example.demo.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long id;

    @NotBlank
    @Size(max=50)
    private String studentNumber;

    @NotBlank
    private String studentName;

    @Email
    @Size(max=50)
    private String email;

    @Size(max=15)
    private String telephoneNumber;
    @NotBlank
    private String city;

    public Student() {
    }

    public Student(String studentNumber, String studentName, String city) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.city = city;
    }

    public Student(Long id, String studentNumber, String studentName, String email, String telephoneNumber, String city) {
        this.id = id;
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.city = city;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}
