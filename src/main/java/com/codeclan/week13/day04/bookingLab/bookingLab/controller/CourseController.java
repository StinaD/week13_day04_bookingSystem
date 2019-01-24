package com.codeclan.week13.day04.bookingLab.bookingLab.controller;

import com.codeclan.week13.day04.bookingLab.bookingLab.models.Course;
import com.codeclan.week13.day04.bookingLab.bookingLab.repositories.courseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping("rating/{starRating}")
    public List<Course> findCoursesByStarRating(@PathVariable int starRating){
        return courseRepository.findCoursesByStarRating(starRating);
    }

    @GetMapping("customer/{customerId}")
    public List<Course> getCoursesByCustomer(@PathVariable Long customerId){
        return courseRepository.getCoursesByCustomer(customerId);

    }
}
