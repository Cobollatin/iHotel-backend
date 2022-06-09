package com.impactit.ihotel.domains.guests.resource;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
public class UpdateClientResource {

    private Long id;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String name;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String surname;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String email;

    @Size(max = 9)
    private String phoneNumber;

    @Size(max = 100)
    private String address;

    private Date bornDate;

    @Size(max = 8)
    private String dni;
}
