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

## What's SOLID?

S.O.L.I.D is an acronym that represents a set of five design principles in object-oriented programming. These principles, when followed, aim to make software systems more maintainable, scalable, and adaptable. Here's a brief overview of each principle: [[SRP](#single-responsibility-principle-srp), [OCP](#openclosed-principle-ocp), [LSP](#liskov-substitution-principle-lsp), [ISP](#interface-segregation-principle-isp), [DIP](#dependency-inversion-principle-dip)].

## Scenery to resolve, start:

We have a small company with a human resources department and a very old system. Due to accelerated growth in recent years, HR needs to apply salary adjustments, obeying a few rules, which are: 
> - Manager is the last position in the company, so the employee in this position doesn't receive a promotion adjustment;
> - There are two ways in which an employee can receive a raise: by hitting targets or by promotion;
> - The employee can only receive a new adjustment after 6 months;
> - The adjustment has a limit of up to 40% of the salary, and cannot exceed this percentage;
> - Now, the company also has outsourced professionals and needs to differentiate employee data;

### [Legacy project, current state](solid-java-start/START.md)

## Single Responsibility Principle (SRP):

```
- Idea: A class should have only one reason to change, meaning it should have only one job or responsibility.
- In a nutshell: Do one thing, and do it well.
```

## Open/Closed Principle (OCP):

```
- Idea: Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification. You should be able to add new features without changing existing code.
- In a nutshell: Extend, don't modify.
```

## Liskov Substitution Principle (LSP):

```
- Idea: Subtypes must be substitutable for their base types without altering the correctness of the program.
- In a nutshell: If it looks like a duck, quacks like a duck, it should behave like a duck.
```

## Interface Segregation Principle (ISP):

```
- Idea: A class should not be forced to implement interfaces it does not use. Clients should not be forced to depend on interfaces they do not use.
- In a nutshell: No client should be forced to depend on methods it does not use.
```

## Dependency Inversion Principle (DIP):

```
- Idea: High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details; details should depend on abstractions.
- In a nutshell: Depend on abstractions, not on concretions.
```