package com.impactit.ihotel.domains.administration.domain.persistence;

import com.impactit.ihotel.domains.administration.domain.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Override
    List<Employee> findAll();

    @Override
    Employee getById(Long id);
}
