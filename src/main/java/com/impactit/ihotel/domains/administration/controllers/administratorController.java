package com.impactit.ihotel.domains.administration.controllers;

import com.impactit.ihotel.domains.administration.services.AdministratorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/administrator")
public class administratorController {
	@Autowired
	private AdministratorService administratorService;
}
