package com.tutorial.apidemo.Springboot.demo.service;

import com.tutorial.apidemo.Springboot.demo.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    public Iterable<Student> getAllStudent();
}
