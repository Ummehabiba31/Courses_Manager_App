package com.backend.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.backend.entites.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

}
