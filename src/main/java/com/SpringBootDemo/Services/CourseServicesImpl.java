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

    @Override
    public List<Courses> getAllCourses()
     {
        return coursesList;
     }

    @Override
    public Courses getCourse(int courseId)
    {
        Courses course_Id = null;
        for(Courses it: coursesList)
        {
            if(it.getId() == courseId)
            {
                course_Id = it;
                break;
            }
        }
        return course_Id;
    }

    @Override
    public Courses addCourse(Courses course)
    {
        coursesList.add(course);
        return course;
    }


}
