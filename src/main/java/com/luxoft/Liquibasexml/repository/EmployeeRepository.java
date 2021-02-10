package com.luxoft.Liquibasexml.repository;

import com.luxoft.Liquibasexml.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
