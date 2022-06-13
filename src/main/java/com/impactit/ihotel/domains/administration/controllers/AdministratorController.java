package com.impactit.ihotel.domains.administration.controllers;

import com.impactit.ihotel.domains.administration.domain.entities.Hotel;
import com.impactit.ihotel.domains.administration.services.HotelServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/administrators")
public class AdministratorController {
	@Autowired
	private HotelServiceImpl administratorService;

	public AdministratorController() {}

	@GetMapping
	public List<Hotel> getAll() {
		return administratorService.getAll();
	}

	@GetMapping("/{id}")
	public Hotel getById(@PathVariable Long id) {
		return administratorService.getById(id);
	}

	@PostMapping
	public Hotel create(@PathVariable Hotel administrator) {
		return administratorService.create(administrator);
	}

}
