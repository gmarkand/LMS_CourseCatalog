package io.lms.coursecatalogservice.controller;

import io.lms.coursecatalogservice.model.Chapter;
import io.lms.coursecatalogservice.services.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/chapter")
public class ChapterController
{

    @Autowired
    private ChapterService chapterService;

    @RequestMapping(method = RequestMethod.POST)
    public void addChapter(@RequestBody Chapter chapter)
    {
        chapterService.addChapter(chapter);
    }

   /* @RequestMapping(method = RequestMethod.GET)
    public List<Chapter> getAllChapter()
    {
        return chapterService.getAllChapter();
    }*/

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteChapter(@PathVariable long id)
    {
        chapterService.deleteChapter(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "course/{courseId}/chapter/{id}")
    public Optional<Chapter> getChapterById(@PathVariable long id)
    {
        return chapterService.getChapterById(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "course/{courseId}/chapter")
    public List<Chapter> getChaptersInCourse(@PathVariable long courseId)
    {
        return chapterService.getAllChaptersInCourse(courseId);
    }

} 