package io.lms.coursecatalogservice.services;

import io.lms.coursecatalogservice.coursecrud.ChapterRespository;
import io.lms.coursecatalogservice.model.Chapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ChapterService
{
    @Autowired
    private ChapterRespository chapterRespository;

    /*public List<Chapter> getAllChapter()
    {
        List<Chapter> chapterList = new ArrayList<>();
        chapterRespository.findAll().forEach( chapterList :: add );
        return chapterList;
    }*/


    public void addChapter(Chapter chapter)
    {
        chapterRespository.save( chapter );
    }

    public void deleteChapter(long id)
    {
        chapterRespository.deleteById( id );
    }

    public Optional<Chapter> getChapterById(long id)
    {
        return chapterRespository.findById( id );
    }

    public List<Chapter> getAllChaptersInCourse(long courseId)
    {
        List<Chapter> chaptersInCourse = new ArrayList<>();
        chapterRespository.findByCourseId(courseId).forEach( chaptersInCourse :: add);
        return chaptersInCourse;
    }
}