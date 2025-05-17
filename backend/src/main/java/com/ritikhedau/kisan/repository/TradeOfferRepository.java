package com.ritikhedau.kisan.repository;

import com.ritikhedau.kisan.entity.TradeOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TradeOfferRepository extends JpaRepository<TradeOffer, Long> {
    List<TradeOffer> findByListingId(Long listingId);
    List<TradeOffer> findByBuyerId(Long buyerId);
}

// minor tweak: update verification rules and configs

// minor tweak: update verification rules and configs at 1531
