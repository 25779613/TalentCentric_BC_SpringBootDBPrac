package com.example.db.demo.controller;

import com.example.db.demo.model.Student;
import com.example.db.demo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/Student")

public class StudentController {
    Model model;

    @Autowired
    StudentRepo studentRepo;

    @PostMapping("/add")
    public String saveStudent(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int age, @RequestParam String gender, @RequestParam String studentDetails) {

        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setAge(age);
        student.setGender(gender);
        student.setStudentDescription(studentDetails);
        studentRepo.save(student);
        return "displayStudent";
    }

    @GetMapping("/getAll")
    public String getStudents() {

        Iterable<Student> student = studentRepo.findAll();
        model.addAttribute("students", student);

      /*  for(Student stud : student)
        {
            System.out.println(stud.getFirstName());
        }*/


        return "displayStudent";
    }

    @DeleteMapping("/delete")
    public String deleteStudent(@RequestParam Integer studentID) {

        studentRepo.deleteById(studentID);

        return "displayStudent";
    }
}
