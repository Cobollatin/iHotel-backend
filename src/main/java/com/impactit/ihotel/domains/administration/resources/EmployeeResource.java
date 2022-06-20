package com.impactit.ihotel.domains.administration.resources;

import com.impactit.ihotel.domains.administration.domain.entities.Employee;
import com.impactit.ihotel.domains.hotels.domain.entities.Hotel;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeResource {
    private Long   id;
    private String   name;
    private String dni;
    private String   phoneNumber;
    private String   type;

}
