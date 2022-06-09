package com.impactit.ihotel.domains.guests.domain.persistence;

import com.impactit.ihotel.domains.guests.domain.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {
    @Override
    List<Client> findAll();

    Client findByName(String Name); //Select * from tabla Where name = ?

}
