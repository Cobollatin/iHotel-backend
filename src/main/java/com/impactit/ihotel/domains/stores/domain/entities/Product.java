package com.impactit.ihotel.domains.stores.domain.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
@With
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotEmpty(message = "Name cannot be empty")
	@Size(min = 2, max = 64, message = "Name must be between 2 and 64 characters")
	@Column(name = "name", nullable = false, length = 64, unique = true)
	private String name;

	@NotEmpty(message = "Type cannot be empty")
	@Size(min = 2, max = 64, message = "Type must be between 2 and 64 characters")
	@Column(name = "type", nullable = false, length = 64)
	private String type;

	@DecimalMin(value = "0.01", message = "Price must be greater than 0")
	@Digits(integer = 10, fraction = 2, message = "Price must be a number")
	@Column(name = "price", nullable = false)
	private Float price;
}
