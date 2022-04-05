package com.tutorial.apidemo.Springboot.demo.repository;
import com.tutorial.apidemo.Springboot.demo.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
