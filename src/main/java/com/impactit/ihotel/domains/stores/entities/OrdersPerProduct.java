package com.impactit.ihotel.domains.stores.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import java.io.Serializable;

class OrdersPerProductPrimaryKey implements Serializable {
	private Product  product;
	private Purchase purchase;
}

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@IdClass(OrdersPerProductPrimaryKey.class)
@Table(name = "orders_per_product")
public class OrdersPerProduct {
	@Id
	@ManyToOne
	@JoinColumn(name = "purchase_id", referencedColumnName = "id")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ToString.Exclude
	private Purchase purchase;
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id", referencedColumnName = "id")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ToString.Exclude
	private Product  product;
	@Min(value = 1, message = "Quantity must be greater than 0")
	@Column(name = "quantity", nullable = false)
	private int      quantity;
	@Min(value = 0, message = "Discount must be greater than 0")
	@Digits(integer = 10, fraction = 2, message = "Discount must be a number")
	@Column(name = "discount", nullable = false)
	private Float    discount = 0f;
}
