package com.Course.Management.CourseManagement.dao;

import org.springframework.data.repository.CrudRepository;

import com.Course.Management.CourseManagement.models.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
