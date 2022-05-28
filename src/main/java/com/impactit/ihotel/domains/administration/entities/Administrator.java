package com.impactit.ihotel.domains.administration.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "administrators")
public class Administrator {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long   id;
	@NotEmpty(message = "Nickname cannot be empty")
	@Size(min = 4, max = 20, message = "Nickname must have between 4 and 20 characters")
	@Column(name = "nickname", nullable = false, unique = true, length = 20)
	private String nickname;
	@NotEmpty(message = "Email cannot be empty")
	@Email(message = "Invalid email.")
	@Column(name = "email", nullable = false, unique = true)
	private String email;
	@NotEmpty(message = "Password hash cannot be empty")
	@Size(min = 128, max = 128, message = "Invalid password hash")
	@Column(name = "password_hash", nullable = false, length = 128)
	private String passwordHash;
	@NotEmpty(message = "Name cannot be empty")
	@Size(min = 2, max = 64, message = "Name must have between 2 and 64 characters")
	@Column(name = "name", nullable = false, length = 64)
	private String name;
	@NotEmpty(message = "Surname cannot be empty")
	@Size(min = 2, max = 64, message = "Surname must have between 2 and 64 characters")
	@Column(name = "surname", nullable = false, length = 64)
	private String surname;
	@Temporal(TemporalType.DATE)
	@Column(name = "born_date", nullable = true)
	private Date   bornDate;
	@NotEmpty(message = "Phone cannot be empty")
	@Size(min = 9, max = 9, message = "Phone must have 9 characters")
	@Column(name = "phone_number", nullable = true, length = 9)
	private String phoneNumber;
	@NotEmpty(message = "Address cannot be empty")
	@Size(min = 2, max = 128, message = "Address must have between 2 and 128 characters")
	@Column(name = "address", nullable = true, length = 128)
	private String address;
}
