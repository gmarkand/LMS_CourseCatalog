package io.lms.coursecatalogservice.services;

import io.lms.coursecatalogservice.coursecrud.CourseRepository;
import io.lms.coursecatalogservice.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService
{
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourse()
    {
        List<Course> courses = new ArrayList<>();
        courseRepository.findAll().forEach( courses::add );
        return courses;
    }

    public void addCourse(Course course)
    {
        courseRepository.save( course );
    }

    public void deleteCourse(long id)
    {
        courseRepository.deleteById( id );
    }

    public Optional<Course> getCourseById(long id)
    {
        return courseRepository.findById( id );
    }
}