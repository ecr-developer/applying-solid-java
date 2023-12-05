package io.github.ecrdeveloper.provider;

// Concrete implementation of CourseMaterialProvider
public class OnlineCourseMaterialProviderImpl implements CourseMaterialProvider{
    
    @Override
    public String getCourseMaterial(String courseId) {
        // Implementation of fetching course material
        // ...
        return "courseMaterial";
    }

}
