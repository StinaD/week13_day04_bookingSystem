package com.codeclan.week13.day04.bookingLab.bookingLab.controller;

import com.codeclan.week13.day04.bookingLab.bookingLab.models.Booking;
import com.codeclan.week13.day04.bookingLab.bookingLab.repositories.bookingRepository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @RequestMapping("date/{date}")
    public List<Booking> findBookingsByDate(@PathVariable String date) {
        return bookingRepository.findBookingsByDate(date);
    }

}
