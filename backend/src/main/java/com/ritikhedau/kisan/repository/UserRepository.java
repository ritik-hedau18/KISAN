package com.ritikhedau.kisan.repository;

import com.ritikhedau.kisan.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    Boolean existsByEmail(String email);
}

// minor tweak: update verification rules and configs
