package com.codeclan.week13.day04.bookingLab.bookingLab.repositories.bookingRepository;

import com.codeclan.week13.day04.bookingLab.bookingLab.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {

    List<Booking> findBookingsByDate(String date);
}
