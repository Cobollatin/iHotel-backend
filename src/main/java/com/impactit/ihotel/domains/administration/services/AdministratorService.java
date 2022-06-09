package com.impactit.ihotel.domains.administration.services;

import com.impactit.ihotel.domains.administration.repository.AdministratorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service("administratorService")
public class AdministratorService {
	@Autowired
	AdministratorRepository administrationRepository;
}
