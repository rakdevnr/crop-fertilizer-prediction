package com.example.demo.dto;

public class FertilizerResponse {

    private String recommendedFertilizer;

    public FertilizerResponse(String recommendedFertilizer) {
        this.recommendedFertilizer = recommendedFertilizer;
    }

    public String getRecommendedFertilizer() {
        return recommendedFertilizer;
    }

    public void setRecommendedFertilizer(String recommendedFertilizer) {
        this.recommendedFertilizer = recommendedFertilizer;
    }
}
