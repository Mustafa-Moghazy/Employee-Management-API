package com.example.myApp.rest;

import com.example.myApp.entity.Department;
import com.example.myApp.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("")
    public List<Department> findAll(){
        return departmentService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Department> findById(@PathVariable Long id){
        return departmentService.findByID(id);
    }

    @PostMapping("")
    public Department addNewDepartment(@RequestBody Department department){
        return departmentService.save(department);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable Long id){
        departmentService.deleteByID(id);
    }
}
