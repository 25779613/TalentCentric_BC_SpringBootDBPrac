package com.example.db.demo.controller;

import com.example.db.demo.model.Subject;
import com.example.db.demo.repository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Subject")
public class SubjectController{

    @Autowired
    SubjectRepo subjectRepo;

    @PostMapping("/add")
    public String saveSubject(@RequestParam String subjectName, @RequestParam String subjectDescription) {

        Subject subject = new Subject();
        subject.setSubjectName(subjectName);
        subject.setSubjectDescription(subjectDescription);
        subjectRepo.save(subject);
        return "subject saved";


    }

}


