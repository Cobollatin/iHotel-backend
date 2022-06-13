package com.impactit.ihotel.domains.hotels.domain.persistence;

import com.impactit.ihotel.domains.hotels.domain.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
    @Override
    List<Hotel> findAll();

    Hotel findByNickname(String nickName);

    @Override
    Hotel getById(Long id);
}
