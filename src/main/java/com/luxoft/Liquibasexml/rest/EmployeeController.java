package com.luxoft.Liquibasexml.rest;

import com.luxoft.Liquibasexml.entity.Employee;
import com.luxoft.Liquibasexml.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private EmployeeRepository repository;

    public EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){

        List<Employee> emps = repository.findAll();
        return emps;
    }
}
