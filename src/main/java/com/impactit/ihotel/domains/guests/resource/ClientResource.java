package com.impactit.ihotel.domains.guests.resource;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class ClientResource {

    private Long id;

    private String name;

    private String surname;

    private String email;

    private String phoneNumber;

    private String address;

    private Date bornDate;

    private String dni;
}
