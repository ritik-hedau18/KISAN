package com.ritikhedau.kisan.controller;

import com.ritikhedau.kisan.entity.MandiPrice;
import com.ritikhedau.kisan.repository.MandiPriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/mandi-prices")
public class MandiPriceController {
    @Autowired
    private MandiPriceRepository repository;

    @GetMapping
    public ResponseEntity<List<MandiPrice>> list() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    public ResponseEntity<MandiPrice> create(@RequestBody MandiPrice price) {
        return ResponseEntity.ok(repository.save(price));
    }
}