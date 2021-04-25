package com.SpringBootDemo.Services;

import com.SpringBootDemo.Entities.Courses;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rajat Shandilya
 * @time 25/04/21 12:37 AM
 */

@Service
public class CourseServicesImpl implements CourseServices
{
    /**
     * Creating a course list
     */
    List<Courses> coursesList;
    CourseServicesImpl()
    {
        coursesList = new ArrayList<>();
        coursesList.add(new Courses(1, "Spring boot",
                "Rest api development using Spring boot"));
        coursesList.add(new Courses(2, "Selenium",
                "Selenium course"));
        coursesList.add(new Courses(3, "Appium",
                "Appium course"));
    }

    /**
     * Get all courses
     * @return list of all courses
     */
    @Override
    public List<Courses> getAllCourses()
     {
        return coursesList;
     }

    /**
     * Get a single course
     * @param courseId
     * @return a course with given id
     */
    @Override
    public Courses getCourse(int courseId)
    {
        Courses courseObj = null;
        for(Courses it: coursesList)
        {
            if(it.getId() == courseId)
            {
                courseObj = it;
                break;
            }
        }
        return courseObj;
    }

    /**
     * Add a new course to the course list
     * @param course
     * @return updated course list
     */
    @Override
    public Courses addCourse(Courses course)
    {
        coursesList.add(course);
        return course;
    }

    /**
     * Delete the course with id
     * @param courseId
     * @return updated course list
     */
    @Override
    public List<Courses> deleteCourse(int courseId)
    {
        Courses coursesObj = null;

        for(Courses it: coursesList)
        {
            if(it.getId() == courseId)
            {
                coursesList.remove(courseId -1);
                break;
            }
        }
        return coursesList;
    }


}
