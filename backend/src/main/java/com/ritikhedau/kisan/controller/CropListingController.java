package com.ritikhedau.kisan.controller;

import com.ritikhedau.kisan.entity.CropListing;
import com.ritikhedau.kisan.repository.CropListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/crops")
public class CropListingController {
    @Autowired
    private CropListingRepository repository;

    @GetMapping
    public ResponseEntity<List<CropListing>> list() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    public ResponseEntity<CropListing> create(@RequestBody CropListing crop) {
        return ResponseEntity.ok(repository.save(crop));
    }
}