package com.codeclan.week13.day04.bookingLab.bookingLab.repositories.courseRepository;

import com.codeclan.week13.day04.bookingLab.bookingLab.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

    List<Course> findCoursesByStarRating(int starRating);
    List<Course> getCoursesByCustomer(Long customer_id);
}
