package com.example.demo.controller;

import com.example.demo.dto.FertilizerRequest;
import com.example.demo.dto.FertilizerResponse;
import com.example.demo.entity.FertilizerPrediction;
import com.example.demo.service.FertilizerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fertilizer")
@CrossOrigin(origins = "http://localhost:5173")
public class FertilizerController {

    private final FertilizerService fertilizerService;

    public FertilizerController(FertilizerService fertilizerService) {
        this.fertilizerService = fertilizerService;
    }

    // 🔹 Predict fertilizer (POST)
    @PostMapping("/predict")
    public FertilizerResponse predict(@RequestBody FertilizerRequest request) {
        String result = fertilizerService.predictAndSave(request);
        return new FertilizerResponse(result);
    }

    // 🔹 Get prediction history (GET)
    @GetMapping("/history")
    public List<FertilizerPrediction> getPredictionHistory() {
        return fertilizerService.getAllPredictions();
    }
}
