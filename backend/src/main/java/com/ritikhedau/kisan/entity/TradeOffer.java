package com.ritikhedau.kisan.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "trade_offers")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class TradeOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long listingId;

    private Long buyerId;

    private String buyerName;

    private Double offerPrice;

    private String status; // PENDING, ACCEPTED, REJECTED

    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        if (status == null) status = "PENDING";
    }
}
