package com.example.myApp.service;

import com.example.myApp.entity.Employee;
import com.example.myApp.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepo;
    @Override
    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return employeeRepo.findById(id);
    }
    @Transactional
    @Override
    public Employee save(Employee employee) {
        return employeeRepo.save(employee);
    }
    @Transactional
    @Override
    public void deleteById(Long id) {
         employeeRepo.deleteById(id);
    }

    @Override
    public List<Employee> findByDepartmentId(Long id) {
        return employeeRepo.findByDepartmentId(id);
    }

    @Override
    public Page<Employee> getAllEmployeesPageable(Pageable pageable) {
        return employeeRepo.findAll(pageable);
    }

}
