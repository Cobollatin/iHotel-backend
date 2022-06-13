package com.impactit.ihotel.domains.administration.resources;

import com.impactit.ihotel.domains.administration.domain.entities.Employee;
import com.impactit.ihotel.domains.hotels.domain.entities.Hotel;

import java.util.Date;

public class EmployeeResource {
    private String   id;

    private String   name;

    private String   surname;

    private String dni;

    private Date bornDate;

    private Date     hiringDate;

    private String   phoneNumber;

    private String   email;

    private String   address;

    private String   type;

    private String   status;

    private Employee boss;

    private Hotel hotel;
}
