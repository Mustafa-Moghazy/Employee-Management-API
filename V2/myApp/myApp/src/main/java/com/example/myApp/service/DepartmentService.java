package com.example.myApp.service;

import com.example.myApp.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
public interface DepartmentService {
    List<Department> findAll();
    Optional<Department> findByID(Long id);
    Department save(Department department);

    void deleteByID(Long id);
}
