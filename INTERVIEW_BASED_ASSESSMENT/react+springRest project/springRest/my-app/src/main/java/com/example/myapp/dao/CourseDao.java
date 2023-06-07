package com.example.myapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myapp.entity.Course;

public interface CourseDao extends JpaRepository<Course, Integer> {


}
