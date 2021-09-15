package com.iuh.SpringAPI.service;

import com.iuh.SpringAPI.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> findAll();

    Employee getEmployee(long id);

    void createEmployee(Employee employee);

    void deleteById(long id);

    void updateById(Employee employee);
}
