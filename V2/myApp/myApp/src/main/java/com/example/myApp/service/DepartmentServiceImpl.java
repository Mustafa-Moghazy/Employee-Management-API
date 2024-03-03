package com.example.myApp.service;

import com.example.myApp.entity.Department;
import com.example.myApp.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepo;
    @Override
    public List<Department> findAll() {
        return departmentRepo.findAll();
    }
    @Override
    public Optional<Department> findByID(Long id) {
        return departmentRepo.findById(id);
    }

    @Override
    public Department save(Department department) {
        return departmentRepo.save(department);
    }

    @Override
    public void deleteByID(Long id) {
        departmentRepo.deleteById(id);
    }

}
