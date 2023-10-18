package com.example.repository;

import com.example.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployableRepository extends JpaRepository<Empleado, Integer> {
}
