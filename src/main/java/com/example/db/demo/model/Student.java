package com.example.db.demo.model;


import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer studentID;
    private String firstName;
    private String lastName;
    private int age;
    private Character gender;
    private String studentDescription;


    public Student() {

    }

    public Student(String firstName, String lastName, int age, Character Gender, String studentDescription) {

        this.firstName =firstName;
        this.lastName =lastName;
        this.age =age;
        this.gender = Gender;
        this.studentDescription = studentDescription;

    }


    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer userId) {
        this.studentID = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public String getStudentDescription() {
        return studentDescription;
    }

    public void setStudentDescription(String userDescription) {
        this.studentDescription = userDescription;
    }




}
