package com.example.myApp.service;

import com.example.myApp.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface EmployeeService {
    List<Employee> findAll();
    Optional<Employee> findById(Long id);
    Employee save(Employee employee);
    void deleteById(Long id);
    List<Employee> findByDepartmentId(Long id);
    Page<Employee> getAllEmployeesPageable(Pageable pageable);
}
