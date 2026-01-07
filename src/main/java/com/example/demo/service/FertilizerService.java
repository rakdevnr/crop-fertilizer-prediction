package com.example.demo.service;

import com.example.demo.dto.FertilizerRequest;
import com.example.demo.entity.FertilizerPrediction;
import com.example.demo.repository.FertilizerPredictionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FertilizerService {

    private final FertilizerPredictionRepository repository;

    public FertilizerService(FertilizerPredictionRepository repository) {
        this.repository = repository;
    }

    // 🔹 Predict fertilizer AND save to DB
    public String predictAndSave(FertilizerRequest request) {

        String fertilizer;

        if (request.getNitrogen() < 50) {
            fertilizer = "Urea";
        } else if (request.getPhosphorus() < 40) {
            fertilizer = "DAP";
        } else if (request.getPotassium() < 40) {
            fertilizer = "MOP";
        } else {
            fertilizer = "NPK 20-20-20";
        }

        FertilizerPrediction prediction = new FertilizerPrediction();
        prediction.setCrop(request.getCrop());
        prediction.setSoilType(request.getSoilType());
        prediction.setNitrogen(request.getNitrogen());
        prediction.setPhosphorus(request.getPhosphorus());
        prediction.setPotassium(request.getPotassium());
        prediction.setPh(request.getPh());
        prediction.setRecommendedFertilizer(fertilizer);

        repository.save(prediction);

        return fertilizer;
    }

    // 🔹 FETCH ALL PREDICTIONS (THIS FIXES 500 ERROR)
    public List<FertilizerPrediction> getAllPredictions() {
        return repository.findAll();
    }
}
