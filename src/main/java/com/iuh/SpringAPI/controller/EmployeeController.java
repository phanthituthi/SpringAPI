package com.iuh.SpringAPI.controller;


import com.iuh.SpringAPI.entity.Employee;
import com.iuh.SpringAPI.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/list-employee")
    public List<Employee> getAllEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("/getEmployeeById/{id}")
    public Employee getEmployeeById(@PathVariable("id") int id) {
        return employeeService.getEmployee(id);
    }

    @PostMapping("/addEmployee")
    public void addEmployee(Employee employee){
        employee = new Employee("vu","dang","vudang@gmail.com");
        employeeService.createEmployee(employee);
    }
    @GetMapping("/deleteEmployeeById/{id}")
    public void deleteEmployeeById(@PathVariable("id") long id){
        employeeService.deleteById(id);
    }
}
