package com.ritikhedau.kisan.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "crop_listings")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class CropListing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long farmerId;

    private String farmerName;

    private String cropName; // Wheat, Rice, Cotton, Onion, etc.

    private String quantityDescription; // e.g. "10 Tons", "500 Kg"

    private Double basePrice; // per Ton or Kg

    private String status; // AVAILABLE, SOLD

    private String qualityRating; // Grade A, Grade B, Grade C

    @Column(columnDefinition = "TEXT")
    private String qualityDetails; // AI Extracted specifics

    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        if (status == null) status = "AVAILABLE";
    }
}

// minor tweak: update verification rules and configs

// minor tweak: update verification rules and configs at 4357

// minor tweak: update verification rules and configs at 8581
