package com.springdemorestdu.springrestdu.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springdemorestdu.springrestdu.Entity.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List< Course> list ;
	public CourseServiceImpl()
	{
		list=new ArrayList<>();
		list.add(new Course(1,"java","java is hard "));
		list.add(new Course(2,"pyth","pyth i dnt knw "));
	}
	
	
	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return list;
	}


	@Override
	public Course getParticularCourse(Long courseId) {
		// TODO Auto-generated method stub
		Course c=null;
		for(Course course:list)
		{
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
		}
		
		
		return c;
	}

}
