package com.impactit.ihotel.domains.administration.repository;

import com.impactit.ihotel.domains.administration.domain.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
