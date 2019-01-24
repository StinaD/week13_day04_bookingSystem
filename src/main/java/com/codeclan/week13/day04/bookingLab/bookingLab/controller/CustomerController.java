package com.codeclan.week13.day04.bookingLab.bookingLab.controller;

import com.codeclan.week13.day04.bookingLab.bookingLab.models.Customer;
import com.codeclan.week13.day04.bookingLab.bookingLab.repositories.customerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @RequestMapping("course/{courseId}")
    public List<Customer> getCustomersByCourse(@PathVariable Long courseId) {
        return customerRepository.getCustomersByCourse(courseId);
    }

    @RequestMapping("course/{courseId}/town/{town}")
    public List<Customer> getCustomersByTownByCourse(@PathVariable String town, @PathVariable Long courseId) {
        return customerRepository.getCustomersByTownByCourse(town, courseId);
    }

    @RequestMapping("course/{courseId}/town/{town}/age/{age}")
    List<Customer> getCustomersByTownByCourseByAge(@PathVariable String town, @PathVariable Long courseId, @PathVariable int age) {
        return customerRepository.getCustomersByTownByCourseByAge(town, courseId, age);
    }

}
