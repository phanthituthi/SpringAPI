package com.iuh.SpringAPI.repository;

import com.iuh.SpringAPI.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
