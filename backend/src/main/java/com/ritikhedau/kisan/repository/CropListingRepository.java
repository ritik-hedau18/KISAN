package com.ritikhedau.kisan.repository;

import com.ritikhedau.kisan.entity.CropListing;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CropListingRepository extends JpaRepository<CropListing, Long> {
    List<CropListing> findByFarmerId(Long farmerId);
    List<CropListing> findByStatus(String status);
}

// minor tweak: update verification rules and configs
