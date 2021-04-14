package com.example.db.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer subjectCode;
    private String subjectName;
    private String subjectDescription;

    @OneToMany(targetEntity = Student.class,cascade = CascadeType.ALL)
    List<Student> student;



    public Subject() {

    }

    public Subject(String subjectName ,String subjectDescription) {

        this.subjectName = subjectName;
        this.subjectDescription = subjectDescription;
    }

    public Integer getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(Integer subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectDescription() { return subjectDescription; }

    public void setSubjectDescription(String subjectDescription) { this.subjectDescription = subjectDescription; }


}
