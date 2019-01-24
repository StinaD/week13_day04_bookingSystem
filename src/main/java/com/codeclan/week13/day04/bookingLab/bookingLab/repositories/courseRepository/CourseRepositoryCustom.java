package com.codeclan.week13.day04.bookingLab.bookingLab.repositories.courseRepository;

import com.codeclan.week13.day04.bookingLab.bookingLab.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> getCoursesByCustomer(Long customerId);
}
