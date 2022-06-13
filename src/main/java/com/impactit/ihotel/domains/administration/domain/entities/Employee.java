package com.impactit.ihotel.domains.administration.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.impactit.ihotel.domains.hotels.domain.entities.Hotel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String   id;
    @NotEmpty(message = "Name cannot be empty")
    @Size(min = 2, max = 64, message = "Name must be between 2 and 64 characters")
    @Column(name = "name", nullable = false, length = 64)
    private String   name;
    @NotEmpty(message = "Surname cannot be empty")
    @Size(min = 2, max = 64, message = "Surname must be between 2 and 64 characters")
    @Column(name = "surname", nullable = false, length = 64)
    private String   surname;
    @NotEmpty(message = "DNI cannot be empty")
    @Size(min = 8, max = 8, message = "DNI must have 8 characters")
    @Column(name = "dni", nullable = true, unique = true, length = 8)
    private String dni;
    @Temporal(TemporalType.DATE)
    @Column(name = "born_date", nullable = true)
    private Date     bornDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "hiring_date", nullable = false)
    private Date     hiringDate;
    @NotEmpty(message = "Phone cannot be empty")
    @Size(min = 9, max = 9, message = "Phone must have 9 characters")
    @Column(name = "phone_number", nullable = true, length = 9)
    private String   phoneNumber;
    @NotEmpty(message = "Email cannot be empty")
    @Email(message = "Invalid email.")
    @Column(name = "email", nullable = true, unique = false)
    private String   email;
    @NotEmpty(message = "Address cannot be empty")
    @Size(min = 2, max = 64, message = "Address must have between 2 and 128 characters")
    @Column(name = "address", nullable = true, length = 128)
    private String   address;
    @NotEmpty(message = "Type cannot be empty")
    @Size(min = 2, max = 64, message = "Type must have between 2 and 64 characters")
    @Column(name = "type", nullable = false, length = 64)
    private String   type;
    @NotEmpty(message = "Status cannot be empty")
    @Size(min = 2, max = 64, message = "Status must have between 2 and 64 characters")
    @Column(name = "status", nullable = false, length = 64)
    private String   status;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "boss_id", nullable = true)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ToString.Exclude
    private Employee boss;
    @NotNull(message = "Hotel cannot be null")
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_id", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ToString.Exclude
    private Hotel hotel;
}

