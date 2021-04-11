package com.example.db.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer subjectCode;
    private String subjectName;
    private String subjectDescription;

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
