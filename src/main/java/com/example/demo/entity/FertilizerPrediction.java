package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "fertilizer_prediction")
public class FertilizerPrediction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String crop;
    private String soilType;
    private int nitrogen;
    private int phosphorus;
    private int potassium;
    private double ph;
    private String recommendedFertilizer;

    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }

    public Long getId() { return id; }

    public String getCrop() { return crop; }
    public void setCrop(String crop) { this.crop = crop; }

    public String getSoilType() { return soilType; }
    public void setSoilType(String soilType) { this.soilType = soilType; }

    public int getNitrogen() { return nitrogen; }
    public void setNitrogen(int nitrogen) { this.nitrogen = nitrogen; }

    public int getPhosphorus() { return phosphorus; }
    public void setPhosphorus(int phosphorus) { this.phosphorus = phosphorus; }

    public int getPotassium() { return potassium; }
    public void setPotassium(int potassium) { this.potassium = potassium; }

    public double getPh() { return ph; }
    public void setPh(double ph) { this.ph = ph; }

    public String getRecommendedFertilizer() { return recommendedFertilizer; }
    public void setRecommendedFertilizer(String recommendedFertilizer) {
        this.recommendedFertilizer = recommendedFertilizer;
    }

    public LocalDateTime getCreatedAt() { return createdAt; }
}
