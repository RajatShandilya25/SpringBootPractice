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
    }

    @Override
    public List<Courses> getAllCourses()
     {
        return coursesList;
     }
}
