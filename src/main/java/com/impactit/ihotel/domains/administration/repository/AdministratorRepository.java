package com.impactit.ihotel.domains.administration.repository;

import com.impactit.ihotel.domains.administration.domain.entities.Administrator;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AdministratorRepository extends JpaRepository<Administrator, Long> {

}

