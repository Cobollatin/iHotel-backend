package com.impactit.ihotel.domains.administration.resources;

import com.impactit.ihotel.domains.administration.domain.entities.Employee;
import com.impactit.ihotel.domains.hotels.domain.entities.Hotel;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class SaveEmployeeResource {

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String   name;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String   surname;

    @NotNull
    @NotBlank
    @Size(max = 9)
    private String dni;

    @NotNull
    @NotBlank
    private Date bornDate;

    @NotNull
    @NotBlank
    private Date     hiringDate;

    @NotNull
    @NotBlank
    @Size(max = 9)
    private String   phoneNumber;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String   email;

    @NotNull
    @NotBlank
    private String   address;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String   type;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String   status;

    @NotNull
    @NotBlank
    private Employee boss;

    @NotNull
    @NotBlank
    private Hotel hotel;
}
