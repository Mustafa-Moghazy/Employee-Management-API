package com.example.myApp.rest;
import com.example.myApp.entity.Employee;
import com.example.myApp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/")
    public String welcome(){
        return "Welcome To My API ^-^";
    }
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.findAll();
    }
    @GetMapping("/employees/{id}")
    public Optional<Employee> findById(@PathVariable Long id){
        return employeeService.findById(id);
    }
    @GetMapping("/department/{id}/employees")
    public List<Employee> findByDepartmentId(@PathVariable Long id){
        return employeeService.findByDepartmentId(id);
    }
    @GetMapping("employees/pageable")
    public Page<Employee> getAllEmployeesPageable(Pageable pageable){
        return employeeService.getAllEmployeesPageable(pageable);
    }
    @DeleteMapping("employees/{id}")
    public void deleteById(@PathVariable Long id){
        employeeService.deleteById(id);
    }
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);
    }
    @PutMapping("employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);
    }
}
