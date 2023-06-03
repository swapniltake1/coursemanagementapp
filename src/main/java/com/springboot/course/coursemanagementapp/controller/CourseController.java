package com.springboot.course.coursemanagementapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.springboot.course.coursemanagementapp.entities.Course;
import com.springboot.course.coursemanagementapp.services.CourseService;

import java.util.List;


//Root URL: http://localhost:8093
@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    // STarting an app
    @RequestMapping("/welcome")
    public String home(){
        return "Welcome to Course Management Application";
    }


    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseID}")
    public Course getCourseFromID(@PathVariable String courseID){
        return this.courseService.getCourse(Long.parseLong(courseID));
    }

    @PostMapping ("/courses")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseID}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseID){

        try{
            this.courseService.deleteCourse(Long.parseLong(courseID));
         return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}