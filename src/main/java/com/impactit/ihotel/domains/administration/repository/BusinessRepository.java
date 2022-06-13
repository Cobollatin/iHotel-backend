package com.impactit.ihotel.domains.administration.repository;

import com.impactit.ihotel.domains.administration.domain.entities.Business;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessRepository extends JpaRepository<Business, Long> {
}
