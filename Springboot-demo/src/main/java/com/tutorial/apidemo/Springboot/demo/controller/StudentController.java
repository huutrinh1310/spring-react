package com.tutorial.apidemo.Springboot.demo.controller;

import com.tutorial.apidemo.Springboot.demo.model.Student;
import com.tutorial.apidemo.Springboot.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;
    
    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student is added";
    }
    @GetMapping("/getAll")
    public List<Student> getAllStudent(){
        return (List<Student>) studentService.getAllStudent();
    }
}
