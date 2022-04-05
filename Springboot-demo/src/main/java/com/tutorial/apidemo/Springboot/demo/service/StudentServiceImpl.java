package com.tutorial.apidemo.Springboot.demo.service;

import com.tutorial.apidemo.Springboot.demo.model.Student;
import com.tutorial.apidemo.Springboot.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class StudentServiceImpl implements  StudentService{

    private JdbcTemplate jdbcTemplate;

    public StudentServiceImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        //insert database
        return studentRepository.save(student);
    }
    @Override
    public Iterable<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}
