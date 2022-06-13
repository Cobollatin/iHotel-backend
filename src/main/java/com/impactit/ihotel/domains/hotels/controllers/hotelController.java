package com.impactit.ihotel.domains.hotels.controllers;

import com.impactit.ihotel.domains.hotels.domain.entities.Hotel;
import com.impactit.ihotel.domains.hotels.services.HotelServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/hotels")
public class HotelController {
	@Autowired
	private HotelServiceImpl hotelService;

	public HotelController() {}

	@GetMapping
	public List<Hotel> getAll() {
		return hotelService.getAll();
	}

	@GetMapping("/{id}")
	public Hotel getById(@PathVariable Long id) {
		return hotelService.getById(id);
	}

	@PostMapping
	public Hotel create(@PathVariable Hotel hotel) {
		return hotelService.create(hotel);
	}

}
