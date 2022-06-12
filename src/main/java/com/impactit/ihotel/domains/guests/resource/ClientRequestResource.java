package com.impactit.ihotel.domains.guests.resource;

import lombok.*;

import javax.validation.constraints.Size;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class ClientRequestResource {

    @Size(max = 64)
    private String name;

    @Size(max = 64)
    private String surname;

    private String email;

    @Size(max = 9)
    private String phoneNumber;

    @Size(max = 128)
    private String address;

    @Size(max = 8)
    private String dni;

}
