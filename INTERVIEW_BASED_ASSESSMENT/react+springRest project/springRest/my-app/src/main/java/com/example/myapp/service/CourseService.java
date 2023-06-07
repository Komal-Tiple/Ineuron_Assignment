package com.example.myapp.service;

import java.util.List;


import com.example.myapp.entity.Course;

public interface CourseService {

	public List<Course> getAllCourse();

	public Course getCourse(int id);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public void deleteCourse(int parseLong); 
}
