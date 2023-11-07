package com.example.hospitalmanagement.repository;

import com.example.hospitalmanagement.model.SlotBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ISlotBookingRepository extends JpaRepository<SlotBooking,Long> {
}
