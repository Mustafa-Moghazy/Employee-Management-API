package com.example.myApp.service;

import com.example.myApp.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> findAll();
    public Employee findById( Long id);
    public Employee save(Employee employee);
    public void deleteById(Long id);
}
