package com.codeclan.week13.day04.bookingLab.bookingLab.repositories.customerRepository;

import com.codeclan.week13.day04.bookingLab.bookingLab.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
}
