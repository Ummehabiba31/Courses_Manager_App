package com.backend.backend.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backend.dao.CourseDao;
import com.backend.backend.entites.Course;


@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	//temporary list
	//add constructor
	
	public CourseServiceImpl(){
		

	}
	
	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
//		Course c = null;
//		for(Course course: list) {
//			if(course.getId()== courseId) {
//				c = course;
//				break;
//			}
//		}
		
		
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		
//        list.forEach(e -> {
//    		if(e.getId() == course.getId()) {
//    			e.setTitle(course.getTitle());
//    			e.setDescription(course.getDescription());
//    		}
//        });
		
		courseDao.save(course);
		
		return course;
	}

	@Override
	public void deleteCourse(Long parseLong) {
		//list = this.list.stream().filter(e -> e.getId() != parseLong).collect(Collectors.toList());	
		
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
		
	}

	
	
	
	
	

	
	
}
