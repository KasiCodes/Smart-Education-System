package com.kasiCodes.Smart.Education.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kasiCodes.Smart.Education.System.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

    
}