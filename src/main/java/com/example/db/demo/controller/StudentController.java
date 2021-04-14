package com.example.db.demo.controller;

import com.example.db.demo.model.Student;
import com.example.db.demo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/Student")

public class StudentController {
    //Model model;


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
        return "displayAllStudent";
    }

    @GetMapping("/getAll")
    public String getStudents(Model model) {

        Iterable<Student> student = studentRepo.findAll();
        model.addAttribute("students", student);

        for(Student stud : student)
        {
            System.out.println(stud.getFirstName());
        }

        return "displayAllStudent";
    }

    @PostMapping("/delete")
    public String deleteStudent(@RequestParam Integer studentID) {

        try{
            studentRepo.deleteById(studentID);
        }
        catch(Exception e)
        {
            System.out.println("User to be delete not found by id");
        }
        return "displayAllStudent";
    }

    @GetMapping("/getStudent")
    public ModelAndView getStudent(@RequestParam Integer studentID) {

        ModelAndView mv = new ModelAndView("displayCurrentStudent");
        Student student = studentRepo.findById(studentID).orElse(new Student());
        mv.addObject("singleStudent", student);
        return mv;
    }

    @GetMapping("/getSpecificStudent")
    public ModelAndView getSpecificStudent(@RequestParam String studentName) {
        List<Student> foundStudent = new <Student>ArrayList();
        ModelAndView mv = new ModelAndView("displayCurrentStudent");
        List<Student> student = (List<Student>) studentRepo.findAll();
        for (Student stud:student)
        {
            if(stud.getFirstName().compareToIgnoreCase(studentName) == 0)
                foundStudent.add(stud);
        }
        mv.addObject("foundStudent",foundStudent);
        return mv;
    }
}
