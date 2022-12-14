package com.example.block7crudvalidation.student.infrastructure.repository;

import com.example.block7crudvalidation.student.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {
}
