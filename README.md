<p align="center">
  <h1 align="center">Introduction about the principles S.O.L.I.D</h1>
</p>

This project is to explain in a simple way how to apply the principles of SOLID.

## Index

- [What's SOLID?](#whats-solid)
- [Scenery to resolve, start](#scenery-to-resolve-start)
- [Single Responsibility Principle](#single-responsibility-principle-srp)
- [Open/Closed Principle](#openclosed-principle-ocp)
- [Liskov Substitution Principle](#liskov-substitution-principle-lsp)
- [Interface Segregation Principle](#interface-segregation-principle-isp)
- [Dependency Inversion Principle](#dependency-inversion-principle-dip)
- [Create your project](#create-your-project)

## What's SOLID?

S.O.L.I.D is an acronym that represents a set of five design principles in object-oriented programming. These principles, when followed, aim to make software systems more maintainable, scalable, and adaptable. Here's a brief overview of each principle: [[SRP](#single-responsibility-principle-srp), [OCP](#openclosed-principle-ocp), [LSP](#liskov-substitution-principle-lsp), [ISP](#interface-segregation-principle-isp), [DIP](#dependency-inversion-principle-dip)].

By adhering to these principles, developers can create more modular, flexible, and maintainable code, reducing the impact of changes and facilitating the evolution of software systems over time.

## Scenery to resolve, start:

We have a small company with a human resources department and a very old system. Due to accelerated growth in recent years, HR needs to apply salary adjustments, obeying a few rules, which are: 
> - Manager is the last position in the company, so the employee in this position doesn't receive a promotion adjustment;
> - There are two ways in which an employee can receive a raise: by hitting targets or by promotion;
> - The employee can only receive a new adjustment after 6 months;
> - The adjustment has a limit of up to 40% of the salary, and cannot exceed this percentage;
> - Now, the company also has third-party professionals and needs to differentiate employee data;

*[Legacy project, current state](./solid-java-start/START.md)*

## Single Responsibility Principle (SRP):

> - **Idea:** A class should have only one reason to change, meaning it should have only one job or responsibility.
> - **In a nutshell:** Do one thing, and do it well.

*[SRP project](./solid-java-srp/SRP.md)*

## Open/Closed Principle (OCP):

> - **Idea:** Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification. You should be able to add new features without changing existing code.
> - **In a nutshell:** Extend, don't modify.

*[OCP project](./solid-java-ocp/OCP.md)*

## Liskov Substitution Principle (LSP):

> - **Idea:** Subtypes must be substitutable for their base types without altering the correctness of the program.
> - **In a nutshell:** If it looks like a duck, quacks like a duck, it should behave like a duck.

*[LSP project](./solid-java-lsp/LSP.md)*

## Interface Segregation Principle (ISP):

> - **Idea:** A class should not be forced to implement interfaces it does not use. Clients should not be forced to depend on interfaces they do not use.
> - **In a nutshell:** No client should be forced to depend on methods it does not use.

## Dependency Inversion Principle (DIP):

> - **Idea:** High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details; details should depend on abstractions.
> - **In a nutshell:** Depend on abstractions, not on concretions.

## Create your project:

### - Create Parent Project:
If you don't have a parent project, create one. It's a Maven project that will act as the container for your sub-modules.

```
mvn archetype:generate -DgroupId=com.example -DartifactId=parent-project -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```
Replace **`com.example`** with your desired group ID and **`parent-project`** with the name you want for your parent project.

### - Navigate to the Parent Project:
```
cd parent-project
```

### - Create Sub-Module:
Use the following Maven command to create a new sub-module under the parent project:
```
mvn archetype:generate -DgroupId=com.example -DartifactId=submodule -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```
Replace **`com.example`** with the same group ID used for the parent project and **`submodule`** with the name you want for your sub-module.

### - Update Parent Project's POM:
Open the **`pom.xml`** file of the parent project and add a **`<modules>`** section to include the sub-module:
```
<modules>
    <module>submodule</module>
</modules>
```
This informs Maven that the parent project has a sub-module.

### - Build the Projects:
Go back to the parent project directory and build both the parent and sub-module:
```
cd ..
mvn clean install
```
This will build the parent project and its sub-modules.

Now you have a Maven parent project with a sub-module. You can add more sub-modules by repeating steps 3-5. Each sub-module will have its own **`pom.xml`** file, and the parent project's **`pom.xml`** will reference them in the **`<modules>`** section.