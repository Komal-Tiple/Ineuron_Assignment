package com.example.myapp.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myapp.dao.CourseDao;
import com.example.myapp.entity.Course;
import com.example.myapp.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	CourseDao courseDao;
	
	List<Course> list;
	
	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Course(1,"Java","this course contains basics of java"));
		list.add(new Course(2,"Spring Boot","this course contains basics of spring"));
		list.add(new Course(3,"DataBase","this course contains basics of DataBase"));
	}
	
	@Override
	public List<Course> getAllCourse() {		
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(int id) {
		
		/*
		 * for(Course course:list) { if(course.getId()==id) { return course; } }
		 */
		return courseDao.findById(id).get();
	}

	@Override
	public Course addCourse(Course course) {
		/* list.add(course); */
		return courseDao.save(course);
	}

	@Override
	public Course updateCourse(Course course) {
		
		/*
		 * list.forEach(e->{ if(e.getId()==course.getId()) {
		 * e.setTitle(course.getTitle()); e.setDesc(course.getDesc()); } });
		 */
		
		courseDao.save(course);
		
		return course;
	}

	@Override
	public void deleteCourse(int id) {
		/*
		 * list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.
		 * toList());
		 */
		Course entity = courseDao.findById(id).get();
		courseDao.delete(entity);
	}
 
}
