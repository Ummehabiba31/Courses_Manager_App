package com.backend.backend.services;

import java.util.List;



import com.backend.backend.entites.Course;



public interface CourseService {
// this interface will contain all class interfaces
	//this class helps loose coupling 
	
	
	public List<Course> getCourses();
	
	public Course getCourse (long courseId);
	
	public Course addCourse (Course course);
	
	public Course updateCourse (Course course);
	
	public void deleteCourse (Long parseLong);
}
