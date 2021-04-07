package com.example.db.demo.repository;

import com.example.db.demo.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student,Integer>{
}
