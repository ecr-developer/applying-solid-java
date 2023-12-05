package io.github.ecrdeveloper.service;

import io.github.ecrdeveloper.provider.CourseMaterialProvider;

// High-level module depending on CourseMaterialProvider
public class TrainingManagerService {

    private CourseMaterialProvider materialProvider;

    // Constructor injection of CourseMaterialProvider
    public TrainingManagerService(CourseMaterialProvider materialProvider) {
        this.materialProvider = materialProvider;
    }

    public String getTrainingMaterial(String courseId) {
        // Logic for fetching training material using materialProvider
        // ...
        return "trainingMaterial";
    }
    
}
