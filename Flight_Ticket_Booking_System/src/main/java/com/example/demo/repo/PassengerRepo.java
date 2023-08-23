package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Passenger;

public interface PassengerRepo extends JpaRepository<Passenger, Integer> {

}
