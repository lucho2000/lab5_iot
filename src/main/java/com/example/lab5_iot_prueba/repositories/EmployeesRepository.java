package com.example.lab5_iot_prueba.repositories;


import com.example.lab5_iot_prueba.entitys.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepository extends JpaRepository<Employees, Integer> {
}