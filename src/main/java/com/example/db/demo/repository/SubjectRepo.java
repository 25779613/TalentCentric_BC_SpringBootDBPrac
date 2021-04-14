package com.example.db.demo.repository;

import com.example.db.demo.model.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepo extends CrudRepository<Subject,Integer> {
}
