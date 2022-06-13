package com.impactit.ihotel.domains.hotels.repository;


import com.impactit.ihotel.domains.hotels.domain.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HotelRepository extends JpaRepository<Hotel, Long> {

}

