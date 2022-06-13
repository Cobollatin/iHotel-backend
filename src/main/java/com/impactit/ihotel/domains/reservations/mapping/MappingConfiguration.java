package com.impactit.ihotel.domains.reservations.mapping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("ReservationMappingConfiguration")
public class MappingConfiguration {
    @Bean
    public ReservationMapper reservationMapper(){return new ReservationMapper();}
}
