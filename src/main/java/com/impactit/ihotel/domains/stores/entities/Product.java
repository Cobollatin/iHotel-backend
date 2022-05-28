package com.impactit.ihotel.domains.stores.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	@NotEmpty(message = "Name cannot be empty")
	@Size(min = 2, max = 64, message = "Name must be between 2 and 64 characters")
	@Column(name = "name", nullable = false, length = 64)
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
