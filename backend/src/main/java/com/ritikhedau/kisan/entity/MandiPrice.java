package com.ritikhedau.kisan.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "mandi_prices")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class MandiPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cropName;

    private String state;

    private String district;

    private Double price; // per Quintal (100 Kg)

    private LocalDateTime updatedTime;

    @PrePersist
    protected void onCreate() {
        updatedTime = LocalDateTime.now();
    }
}

// minor tweak: update verification rules and configs
