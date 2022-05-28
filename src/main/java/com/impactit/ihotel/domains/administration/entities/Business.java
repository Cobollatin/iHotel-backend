package com.impactit.ihotel.domains.administration.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "businesses")
public class Business {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long    id;
	@NotEmpty(message = "Name cannot be empty")
	@Size(min = 2, max = 64, message = "Name must have between 2 and 64 characters")
	@Column(name = "name", nullable = false, unique = true, length = 64)
	private String  name;
	@NotEmpty(message = "RUC cannot be empty")
	@Size(min = 11, max = 11, message = "RUC must have 11 characters")
	@Column(name = "ruc", nullable = true, unique = true, length = 11)
	private String ruc;
}
