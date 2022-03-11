package com.springdemorestdu.springrestdu.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springdemorestdu.springrestdu.Entity.Course;
import com.springdemorestdu.springrestdu.Service.CourseService;
import com.springdemorestdu.springrestdu.Service.CourseServiceImpl;

@RestController
public class MyController {

	@Autowired
	private CourseService courseService;
	@GetMapping("/home")
	public String home()
	{
		return "welcome to my home";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourse()
	{
		return this.courseService.getAllCourses();
		
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getParticularCourse(@PathVariable String courseId)
	{
		return this.courseService.getParticularCourse(Long.parseLong(courseId));
		
	}
}
