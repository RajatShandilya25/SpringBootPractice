package com.SpringBootDemo.Entities;

/**
 * @author Rajat Shandilya
 * @time 25/04/21 12:25 AM
 */
public class Courses
{
    private int id;
    private String title;
    private String description;

    public Courses(int Id, String Title, String Description)
    {
        this.id = Id;
        this.title = Title;
        this.description = Description;
    }

    public long getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
}
