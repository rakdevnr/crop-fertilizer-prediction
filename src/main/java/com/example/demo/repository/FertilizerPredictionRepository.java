package com.example.demo.repository;

import com.example.demo.entity.FertilizerPrediction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FertilizerPredictionRepository
        extends JpaRepository<FertilizerPrediction, Long> {
}
