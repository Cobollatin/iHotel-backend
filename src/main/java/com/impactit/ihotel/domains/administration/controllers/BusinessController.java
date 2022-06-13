package com.impactit.ihotel.domains.administration.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/businesses")
public class BusinessController {
    @Autowired
    private BusinessServiceImpl businessService;

    public BusinessController() {}

    @GetMapping
    public List<Business> getAll() {
        return businessService.getAll();
    }

    @GetMapping("/{id}")
    public Business getById(@PathVariable Long id) {
        return businessService.getById(id);
    }

    @PostMapping
    public Business create(@PathVariable Business business) {
        return businessService.create(business);
    }

}
