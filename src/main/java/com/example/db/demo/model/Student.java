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
    private boolean Gender;
    private String userDescription;


    public Student() {

    }

    public Student(String firstName, String lastName, int age, boolean Gender, String userDescription) {

        this.firstName =firstName;
        this.lastName =lastName;
        this.age =age;
        this.Gender = Gender;
        this.userDescription =userDescription;

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

    public boolean isGender() {
        return Gender;
    }

    public void setGender(boolean gender) {
        Gender = gender;
    }

    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }




}
