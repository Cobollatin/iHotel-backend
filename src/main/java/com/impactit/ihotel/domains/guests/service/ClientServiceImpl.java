package com.impactit.ihotel.domains.guests.service;

import com.impactit.ihotel.domains.guests.domain.entities.Client;
import com.impactit.ihotel.domains.guests.domain.persistence.ClientRepository;
import com.impactit.ihotel.domains.guests.domain.service.ClientService;
import com.impactit.ihotel.shared.exception.ResourceNotFoundException;
import com.impactit.ihotel.shared.exception.ResourceValidationException;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.List;
import java.util.Set;

public class ClientServiceImpl implements ClientService {

    private static final String ENTITY = "Client";

    private final ClientRepository clientRepository;

    private final Validator validator;

    public ClientServiceImpl(ClientRepository clientRepository, Validator validator) {
        this.clientRepository = clientRepository;
        this.validator = validator;
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public Page<Client> getAll(Pageable pageable) {
        return clientRepository.findAll(pageable);
    }

    @Override
    public Client getById(Long clientId) {
        return clientRepository.findById(clientId)
                .orElseThrow(()-> new ResourceNotFoundException(ENTITY, clientId));
    }

    @Override
    public Client create(Client client) {
        Set<ConstraintViolation<Client>> violations = validator.validate(client);

        if(!violations.isEmpty())
            throw new ResourceValidationException(ENTITY, violations);

        //Name Uniqueness validation
        Client clientWithName = clientRepository.findByName(client.getName());

        if(clientWithName != null)
            throw new ResourceValidationException(ENTITY, "An client with the same name already");

        return clientRepository.save(client);
    }

    @Override
    public Client update(Long studentId, Client student) {
        return null;
    }

    @Override
    public ResponseEntity<?> delete(Long studentId) {
        return null;
    }
}
