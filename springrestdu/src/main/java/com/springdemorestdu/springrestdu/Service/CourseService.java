package com.springdemorestdu.springrestdu.Service;

import java.util.List;

import com.springdemorestdu.springrestdu.Entity.Course;

public interface CourseService {
	
	public List<Course> getAllCourses();
	public Course getParticularCourse(Long courseId);

}
