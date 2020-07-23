package io.lms.coursecatalogservice.coursecrud;

import io.lms.coursecatalogservice.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long>
{
} 