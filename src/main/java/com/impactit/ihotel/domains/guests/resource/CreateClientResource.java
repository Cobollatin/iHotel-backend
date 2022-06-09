package com.impactit.ihotel.domains.guests.resource;

import lombok.*;

import java.util.Date;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CreateClientResource {

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
