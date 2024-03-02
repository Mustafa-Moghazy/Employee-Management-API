package com.example.myApp.dao;

import com.example.myApp.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> findAll();
    public Employee findById( Long id);
    public Employee save(Employee employee);
    public void deleteById(Long id);
}
