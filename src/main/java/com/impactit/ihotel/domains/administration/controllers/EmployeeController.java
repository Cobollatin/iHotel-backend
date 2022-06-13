package com.impactit.ihotel.domains.administration.controllers;

import com.impactit.ihotel.domains.administration.domain.entities.Employee;
import com.impactit.ihotel.domains.administration.services.EmployeeServiceImpl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeService;

    public EmployeeController() {}

    @GetMapping
    public List<Employee> getAll() {
        return employeeService.getAll();
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable Long id) {
        return employeeService.getById(id);
    }

    @PostMapping
    public Employee create(@PathVariable Employee employee) {
        return employeeService.create(employee);
    }
}
