package com.impactit.ihotel.domains.reservations.service;

import com.impactit.ihotel.domains.reservations.domain.entities.Reservation;
import com.impactit.ihotel.domains.reservations.domain.persistence.ReservationRepository;
import com.impactit.ihotel.domains.reservations.domain.service.ReservationService;
import com.impactit.ihotel.shared.exception.ResourceNotFoundException;
import com.impactit.ihotel.shared.exception.ResourceValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.List;
import java.util.Set;

@Service
public class ReservationServiceImpl implements ReservationService {
    private static final String ENTITY = "reservations";

    @Autowired
    private final ReservationRepository reservationRepository;

    private final Validator validator;

    public ReservationServiceImpl(ReservationRepository reservationRepository, Validator validator) {
        this.reservationRepository = reservationRepository;
        this.validator = validator;
    }

    @Override
    public List<Reservation> getAll() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation create(Reservation reservation) {
        Set<ConstraintViolation<Reservation>> violations = validator.validate(reservation);

        if (!violations.isEmpty())
            throw new ResourceValidationException(ENTITY, violations);

        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation update(Long reservationId, Reservation request) {
        Set<ConstraintViolation<Reservation>> violations = validator.validate(request);

        if (!violations.isEmpty())
            throw new ResourceValidationException(ENTITY, violations);

        return reservationRepository.findById(reservationId).map(reservation -> reservationRepository.save(reservation.withStatus(request.getStatus()).withClientId(request.getClientId()).withReservationDate(request.getReservationDate()).withCheckInDate(request.getCheckInDate())))
                .orElseThrow(() -> new ResourceNotFoundException(ENTITY, reservationId));
    }

    @Override
    public ResponseEntity<?> delete(Long reservationId) {
        return reservationRepository.findById(reservationId).map(reservation -> {
            reservationRepository.delete(reservation);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException(ENTITY, reservationId));
    }
}

