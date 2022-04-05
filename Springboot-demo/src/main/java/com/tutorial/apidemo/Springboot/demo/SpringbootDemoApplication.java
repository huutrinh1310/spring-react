package com.tutorial.apidemo.Springboot.demo;

import com.tutorial.apidemo.Springboot.demo.model.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringbootDemoApplication{


    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }



}
