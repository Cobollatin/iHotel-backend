package com.impactit.ihotel.domains.guests.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "clients")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	@NonNull
	@Column(name = "name", nullable = false)
	private String name;

	@NonNull
	@Column(name = "surname", nullable = false)
	private String surname;

	@NonNull
	@Column(name = "email", nullable = false)
	private String email;

	@NonNull
	@Column(name = "phone_number", nullable = false)
	private String phoneNumber;

	@NonNull
	@Column(name = "address", nullable = false)
	private String address;
}
