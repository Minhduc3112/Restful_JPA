package com.example.restful_jpa.Respository;

import com.example.restful_jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentCrud extends JpaRepository<Student,String> {

}
