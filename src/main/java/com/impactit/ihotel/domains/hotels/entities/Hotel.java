package com.impactit.ihotel.domains.hotels.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.impactit.ihotel.domains.administration.entities.Administrator;
import com.impactit.ihotel.domains.administration.entities.Business;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "hotels")
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long   id;
	@NotEmpty(message = "Name cannot be empty")
	@Size(min = 2, max = 64, message = "Name must have between 2 and 64 characters")
	@Column(name = "name", nullable = false, unique = true, length = 64)
	private String name;
	@NotEmpty(message = "Address cannot be empty")
	@Size(min = 2, max = 128, message = "Address must have between 2 and 128 characters")
	@Column(name = "address", nullable = true, length = 128)
	private String address;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "business_id", nullable = false)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ToString.Exclude
	private Business business;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "administrator_id", nullable = false)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ToString.Exclude
	private Administrator administrator;
}
