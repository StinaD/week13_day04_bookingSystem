package com.codeclan.week13.day04.bookingLab.bookingLab.repositories.customerRepository;

import com.codeclan.week13.day04.bookingLab.bookingLab.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> getCustomersByCourse(Long courseId);
    List<Customer> getCustomersByTownByCourse(String town, Long courseId);
    List<Customer> getCustomersByTownByCourseByAge(String town, Long courseId, int age);
}
