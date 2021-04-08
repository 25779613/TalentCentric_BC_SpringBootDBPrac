package com.example.db.demo.controller;

import com.example.db.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Student")

public class UserController {

    @PostMapping("/add")
    public String saveStudent(@RequestParam String firstName,@RequestParam String lastName,@RequestParam int age,@RequestParam Character gender,@RequestParam String studentDetails) {

        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setAge(age);
        student.setGender(gender);
        student.setStudentDescription(studentDetails);
        return "<<Student saved>>";
    }

    @GetMapping("/getAll")
    public String getStudents() {

        return "<<All Students>>";
    }
}
