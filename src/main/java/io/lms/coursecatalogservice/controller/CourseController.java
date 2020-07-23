package io.lms.coursecatalogservice.controller;

import io.lms.coursecatalogservice.model.Course;
import io.lms.coursecatalogservice.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/course")
public class CourseController
{
    @Autowired
    private CourseService courseService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Course> getAllCourse()
    {
        return courseService.getAllCourse();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addCourse(@RequestBody Course course)
    {
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteCourse(@PathVariable long id)
    {
        courseService.deleteCourse(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Optional<Course> getCourseById(@PathVariable long id)
    {
        return courseService.getCourseById(id);
    }

} 