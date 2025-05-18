package com.ritikhedau.kisan.controller;

import com.ritikhedau.kisan.entity.TradeOffer;
import com.ritikhedau.kisan.repository.TradeOfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/trades")
public class TradeOfferController {
    @Autowired
    private TradeOfferRepository repository;

    @GetMapping
    public ResponseEntity<List<TradeOffer>> list() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    public ResponseEntity<TradeOffer> create(@RequestBody TradeOffer trade) {
        return ResponseEntity.ok(repository.save(trade));
    }
}