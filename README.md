Crop Fertilizer Prediction System (Backend)
Project Overview

The Crop Fertilizer Prediction System is a backend application designed to help farmers and agricultural stakeholders determine the most suitable fertilizer for a given 
crop based on soil nutrients and soil properties. The system uses rule-based logic (extendable to ML models) and persists prediction history for analysis and future 
improvement.

This project demonstrates real-world backend development using Spring Boot, REST APIs, and PostgreSQL, following industry-standard practices.

Problem Statement
Farmers often apply fertilizers based on experience or generic recommendations, which can lead to:
Overuse or underuse of fertilizers
Reduced crop yield
Soil degradation
Increased production cost

There is a need for a data-driven, scalable system that can recommend appropriate fertilizers based on soil nutrient values and crop type, while also maintaining a history
of predictions for future optimization.

Solution

This backend system:
Accepts soil nutrient values (N, P, K, pH)
Considers crop type and soil type
Predicts a suitable fertilizer
Stores every prediction in a PostgreSQL database
Exposes REST APIs for frontend or third-party integration
The architecture is designed so that rule-based logic can later be replaced with Machine Learning models and enriched with external APIs like weather data.

Tech Stack

Java 17

Spring Boot

Spring Data JPA (Hibernate)

PostgreSQL

Maven

RESTful APIs

Git & GitHub

Project Architecture
Controller Layer → Handles HTTP requests
Service Layer → Business logic & prediction rules
Repository Layer → Database access using JPA
Entity Layer → Database models
DTO Layer → Request/Response objects

API Endpoints
1️. Predict Fertilizer

POST /api/fertilizer/predict

Request Body (JSON):
{
"crop": "Wheat",
"soilType": "Loamy",
"nitrogen": 34,
"phosphorus": 78,
"potassium": 70,
"ph": 6.7
}
Response:
{
"recommendedFertilizer": "Urea"
}
Saves prediction to database automatically.

Get Prediction History
GET /api/fertilizer/history
Response:
[
{
"id": 1,
"crop": "Maize",
"soilType": "Black",
"nitrogen": 20,
"phosphorus": 70,
"potassium": 50,
"ph": 5.0,
"recommendedFertilizer": "Urea",
"createdAt": "2026-01-06T12:51:10"
}
]

Database Design

Table: fertilizer_prediction

Fields:

id (Primary Key)

crop

soil_type

nitrogen

phosphorus

potassium

ph

recommended_fertilizer

created_at

How to Run Locally

Clone the repository

Create a PostgreSQL database: crop_fertilizer_db

Update application.properties with DB credentials

Run the Spring Boot application

Access APIs via http://localhost:8081

Future Enhancements

Integrate Machine Learning models for smarter predictions

Add Weather API (rainfall, temperature, humidity)

Crop-specific fertilizer datasets

Frontend dashboard (React)

Cloud deployment (AWS / Render)

 Author

Rakshith Devang NR
Backend Developer | Java | Spring Boot | PostgreSQL

⭐ If you find this project useful, feel free to star the repository!











