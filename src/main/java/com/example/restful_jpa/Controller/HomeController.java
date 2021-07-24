package com.example.restful_jpa.Controller;

import com.example.restful_jpa.Respository.StudentCrud;
import com.example.restful_jpa.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class HomeController {
    @Autowired
    StudentCrud studentCrud;
    @GetMapping("rest/students")
    public List<Student> getAll(Model model){
        return studentCrud.findAll();
        }
//    @GetMapping("rest/students/{id}")
//    public Student getOne(@PathVariable("id") String id) {
//       return studentCrud.findAllById(id);
//    }
//    @PostMapping("rest/students")
//    public Student createOne(@ModelAttribute("Student") Student student){
//        studentCrud.save(student);
//       return student;
//    }
//    @PutMapping("rest/students/{id}")
//    public Student putOne(@PathVariable("id") Integer id ,@ModelAttribute("Student") Student student ) {
//         studentCrud.save(student);
//         return student;
//    }
//    @DeleteMapping("rest/students/{id}")
//    public Student putOne(@PathVariable("id") Integer id  ) {
//      return   studentCrud.deleteById(id);
//
//    }

}
