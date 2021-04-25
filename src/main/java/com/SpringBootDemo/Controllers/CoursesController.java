package com.SpringBootDemo.Controllers;

import com.SpringBootDemo.Entities.Courses;
import com.SpringBootDemo.Services.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Rajat Shandilya
 * @time 25/04/21 12:26 AM
 */

@RestController
public class CoursesController
{
    @Autowired
    private CourseServices courseServices;

    @GetMapping("/courses")
    public List<Courses> get_Courses()
    {
        return this.courseServices.getAllCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Courses get_Course(@PathVariable int courseId)
    {
        return this.courseServices.getCourse(courseId);
    }

    @PostMapping("/courses")
    public Courses add_Course(@RequestBody Courses course)
    {
        return this.courseServices.addCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public List<Courses> delete_Cousre(@PathVariable int courseId)
    {
        return this.courseServices.deleteCourse(courseId);
    }


}
