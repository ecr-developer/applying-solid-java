[Index](../README.md#index) > [START](../solid-java-start/START.md) > [SRP](../solid-java-srp/SRP.md) > [OCP](../solid-java-ocp/OCP.md) > [LSP](../solid-java-lsp/LSP.md) > [ISP](../solid-java-isp/ISP.md) > [DIP](../solid-java-dip/DIP.md)

# Dependency Inversion Principle (DIP)

The Dependency Inversion Principle (DIP) is a fundamental concept in object-oriented design that encourages high-level modules to depend on abstractions rather than on low-level modules. 

In simpler terms, it suggests that details should depend on abstractions, not the other way around. 

DIP promotes a more flexible and scalable system by decoupling high-level components from specific implementations, allowing for easier adaptation to changes. 

By depending on abstractions, DIP enables the substitution of different implementations without affecting the overall structure of the system. 

In essence, DIP contributes to building more modular and maintainable software architectures.

## New Scenario

Consider an Employee Training Management system within a Human Resources department. This system is responsible for tracking employee training progress and managing training resources.<br>

**High-Level Module:** TrainingManagerService<br>
**Responsibility:** Manages the overall training program, schedules training sessions, and monitors employee progress.

**Low-Level Module:** CourseMaterialProvider<br>
**Responsibility:** Provides course materials for training sessions.

**`Without DIP:`**<br>
In a traditional setup, the `TrainingManagerService` might directly depend on the `CourseMaterialProvider`. This tight coupling means that any changes in the `CourseMaterialProvider`, such as a switch to a new content delivery system or updates to the training materials format, could directly impact the `TrainingManagerService`.

**`Applying DIP:`**<br>
To adhere to the Dependency Inversion Principle, an abstraction is introduced. This could be an `CourseMaterialProvider` interface outlining the methods required for providing training materials. Both the `TrainingManagerService` and the `CourseMaterialProvider` now depend on this abstraction.

**Benefit:** The CourseMaterialProvider focuses solely on the details of providing training materials without being directly tied to the `TrainingManagerService`. Changes in content delivery systems or material formats won't impact the training program's management logic.

### Advantages:

**Flexibility:** If there's a need to switch to a different course material provider or update the delivery method, the HR department can do so without modifying the `TrainingManagerService`.<br>
**Isolation of Changes:** Changes in how course materials are provided or formatted can be implemented independently in the `CourseMaterialProvider` without affecting the `TrainingManagerService`.

## Explanations: 
By applying the Dependency Inversion Principle, the HR department creates a more modular and adaptable system, fostering independence between the high-level training management and low-level material provision components.

- The `CourseMaterialProvider` interface represents the abstraction for providing course material;
- The `CourseMaterialProviderImpl` class provides a concrete implementation of fetching on site course material;
- The `OnlineCourseMaterialProviderImpl` class provides a concrete implementation of fetching online course material;

The `TrainingManagerService` class is the high-level module in the HR department that depends on the `CourseMaterialProvider` abstraction.<br>
By adhering to the Dependency Inversion Principle, the high-level `TrainingManagerService` module is decoupled from the low-level details of course material provision. It depends on the abstraction (`CourseMaterialProvider`), allowing for flexibility and easy substitution of different material provider implementations without directly impacting the `TrainingManagerService` logic.

**Usage:**
```
// Applying Dependency Inversion Principle
CourseMaterialProvider materialProvider = new OnlineCourseMaterialProvider();
TrainingManagerService trainingManager = new TrainingManagerService(materialProvider);

// Now, if the logic for fetching course material changes, it won't directly affect the TrainingManagerService.
```