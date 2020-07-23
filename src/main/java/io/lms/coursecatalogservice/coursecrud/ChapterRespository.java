package io.lms.coursecatalogservice.coursecrud;

import io.lms.coursecatalogservice.model.Chapter;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ChapterRespository extends CrudRepository <Chapter, Long>
{
    public List<Chapter> findByCourseId(long courseId);
} 