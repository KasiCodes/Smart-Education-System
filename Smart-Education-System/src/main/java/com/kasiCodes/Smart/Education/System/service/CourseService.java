package com.kasiCodes.Smart.Education.System.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kasiCodes.Smart.Education.System.model.Course;
import com.kasiCodes.Smart.Education.System.repository.CourseRepository;

@Service
public class CourseService {

    private CourseRepository courseRepository;

    public List<Course> getAllCourses() {

        return courseRepository.findAll();
       
    }

    public Course getCourseById(Long id) {
       Optional<Course> course = courseRepository.findById(id);
       return course.orElse(null);
    }

    public Course saveCourse(Course course) {

        return courseRepository.save(course);
       
    }

    public Course updateCourse(Long id, Course course) {

        Optional<Course> optionalCourse = courseRepository.findById(id);
        if(optionalCourse.isPresent()) {
            Course existingCourse = optionalCourse.get();
            existingCourse.setCourseName(course.getCourseName());
            return courseRepository.save(existingCourse);
        }
        return null;
    }

    public boolean deleteCourse(Long id) {
        if (courseRepository.existsById(id)) {
            courseRepository.deleteById(id);
            return true;
        }
        return false;
    }
    
}
