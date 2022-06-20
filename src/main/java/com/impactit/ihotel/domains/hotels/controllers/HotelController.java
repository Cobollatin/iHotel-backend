package com.impactit.ihotel.domains.hotels.controllers;


import com.impactit.ihotel.domains.hotels.domain.entities.Hotel;
import com.impactit.ihotel.domains.hotels.domain.service.HotelService;
import com.impactit.ihotel.domains.hotels.mapping.HotelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/hotels")
public class HotelController {
	@Autowired
	private final HotelService hotelService;

	private final HotelMapper mapper;
	public HotelController(HotelService hotelService, HotelMapper mapper) {
		this.hotelService = hotelService;
		this.mapper = mapper;
	}

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
