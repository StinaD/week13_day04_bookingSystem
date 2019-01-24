package com.codeclan.week13.day04.bookingLab.bookingLab.components;

import com.codeclan.week13.day04.bookingLab.bookingLab.models.Booking;
import com.codeclan.week13.day04.bookingLab.bookingLab.models.Course;
import com.codeclan.week13.day04.bookingLab.bookingLab.models.Customer;
import com.codeclan.week13.day04.bookingLab.bookingLab.repositories.bookingRepository.BookingRepository;
import com.codeclan.week13.day04.bookingLab.bookingLab.repositories.courseRepository.CourseRepository;
import com.codeclan.week13.day04.bookingLab.bookingLab.repositories.customerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {}

    public void run(ApplicationArguments args) {
        Course course = new Course("Intro to Python", "Edinburgh", 4);
        courseRepository.save(course);

        Customer customer = new Customer("Graeme", "Dundee", 48);
        customerRepository.save(customer);

        Booking booking = new Booking("01-02-2009", course, customer);
        bookingRepository.save(booking);

        Course course2 = new Course("Intro to Ruby", "Glasgow", 3);
        courseRepository.save(course2);

        Customer customer2 = new Customer("Chris", "Dundee", 30);
        customerRepository.save(customer2);

        Booking booking2 = new Booking("22-02-2013", course, customer2);
        bookingRepository.save(booking2);

    }

}
