package io.lms.coursecatalogservice.model;

import javax.persistence.*;
import java.time.Instant;

@Entity
public class Chapter
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;
    private String url;
    private String author;
    private Instant createDate;
    private int likeCount;
    private int dislikeCount;
    private int shareCount;

    /*@ManyToOne
    private Course course;
*/

    @PrePersist
    public void prePersist()
    {
        createDate = Instant.now();
    }

    public Chapter()
    {

    }

    public Chapter(String name, String description, String url, String author, Instant createDate, int likeCount, int dislikeCount, int shareCount)
    {
        this.name = name;
        this.description = description;
        this.author = author;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public Instant getCreateDate()
    {
        return createDate;
    }

    public int getLikeCount()
    {
        return likeCount;
    }

    public void setLikeCount(int likeCount)
    {
        this.likeCount = likeCount;
    }

    public int getDislikeCount()
    {
        return dislikeCount;
    }

    public void setDislikeCount(int dislikeCount)
    {
        this.dislikeCount = dislikeCount;
    }

    public int getShareCount()
    {
        return shareCount;
    }

    public void setShareCount(int shareCount)
    {
        this.shareCount = shareCount;
    }

/*    public Course getCourse()
    {
        return course;
    }

    public void setCourse(Course course)
    {
        this.course = course;
    }*/
}
