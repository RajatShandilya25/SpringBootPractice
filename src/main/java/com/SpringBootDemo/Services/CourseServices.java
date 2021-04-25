package com.SpringBootDemo.Services;

import com.SpringBootDemo.Entities.Courses;
import java.util.List;

/**
 * @author Rajat Shandilya
 * @time 25/04/21 12:36 AM
 */
public interface CourseServices
{
     public List<Courses> getAllCourses();
     public Courses getCourse(int courseId);
     public Courses addCourse(Courses course);
}
