package com.impactit.ihotel.domains.hotels.controllers;

import com.impactit.ihotel.domains.hotels.domain.entities.Room;
import com.impactit.ihotel.domains.hotels.services.RoomServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/rooms")
public class RoomController {
    @Autowired
    private RoomServiceImpl roomService;

    public RoomController() {}

    @GetMapping
    public List<Room> getAll() {
        return roomService.getAll();
    }

    @GetMapping("/{id}")
    public Room getById(@PathVariable Long id) {
        return roomService.getById(id);
    }

    @PostMapping
    public Room create(@RequestBody Room room) {
        return roomService.create(room);
    }
}
