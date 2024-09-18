package com.kasiCodes.Smart.Education.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kasiCodes.Smart.Education.System.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    
}