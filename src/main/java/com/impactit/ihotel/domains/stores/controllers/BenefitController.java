package com.impactit.ihotel.domains.stores.controllers;

import com.impactit.ihotel.domains.stores.domain.entities.Benefit;
import com.impactit.ihotel.domains.stores.domain.service.BenefitService;
import com.impactit.ihotel.domains.stores.mapping.BenefitMapper;
import com.impactit.ihotel.domains.stores.resource.BenefitRequestResource;
import com.impactit.ihotel.domains.stores.resource.BenefitResource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/benefits")
public class BenefitController {

    @Autowired
    private final BenefitService benefitService;

    private final BenefitMapper mapper;

    public BenefitController(BenefitService benefitService, BenefitMapper mapper) {
        this.benefitService = benefitService;
        this.mapper = mapper;
    }

    @GetMapping
    public List<Benefit> getAllBenefits(Pageable pageable) {
        return benefitService.getAll();
    }

    @PostMapping
    public ResponseEntity<BenefitResource> createBenefit(@RequestBody BenefitRequestResource resource) {
        return new ResponseEntity<>(mapper.toResource(benefitService.create(
                mapper.toModel(resource))), HttpStatus.CREATED);
    }

    @PutMapping("{benefitId}")
    public BenefitResource updateBenefit(@PathVariable Long benefitId, @RequestBody BenefitRequestResource resource) {
        return  mapper.toResource(benefitService.update(benefitId, mapper.toModel(resource)));
    }

    @DeleteMapping("{benefitId}")
    public ResponseEntity<?> deleteBenefit (@PathVariable Long benefitId) {
        return benefitService.delete(benefitId);
    }

}





