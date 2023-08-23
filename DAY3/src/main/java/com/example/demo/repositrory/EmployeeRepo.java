package com.example.demo.repositrory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.EmployeeModal;


@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeModal, Integer> {

}
