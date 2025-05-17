package com.ritikhedau.kisan.repository;

import com.ritikhedau.kisan.entity.MandiPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface MandiPriceRepository extends JpaRepository<MandiPrice, Long> {
    List<MandiPrice> findByState(String state);
    Optional<MandiPrice> findByCropNameAndStateAndDistrict(String cropName, String state, String district);
}

// minor tweak: update verification rules and configs

// minor tweak: update verification rules and configs at 8981
