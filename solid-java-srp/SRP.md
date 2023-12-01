[Back to Index](../README.md#index) << | >> [Back to Project START](../solid-java-start/START.md)

# Single Responsibility Principle (SRP)

The Single Responsibility Principle (SRP) is a fundamental concept in software design that suggests a class should have only one reason to change. 

In simpler terms, it means that a class should have one specific job or responsibility and should excel at doing just that. By adhering to SRP, code becomes more modular and maintainable, making it easier to understand, modify, and extend.

---

Based on the above overview, we have a problem in the Employee class, which is doing more than it needs to:
```
public void readjustSalary(BigDecimal increase) {
    BigDecimal percentageReadjust = increase.divide(salary, RoundingMode.HALF_UP);
    if (percentageReadjust.compareTo(new BigDecimal("0.4")) > 0) {
        throw new LimitReadjustException("The increase cannot exceed 40% of the salary!");
    }
    this.salary = this.salary.add(increase);
    this.dateOfLastAdjustment = LocalDate.now();
}
```
For resolve this issue applying SRP principle, we'll to extract that method and to include it in a service class.

## Steps:

- First: Create the ReadjustService class that will receive readjustSalary method extraction;
- Second: change the Employee class by replacing the extracted method and adding a method that only receives the new readjusted salary.

## Out of Scope:

This project will not have unit tests, because the aim is just to explain the principles of SOLID.

**`Attention:` Always run unit tests, it's great practice and guarantees the quality of your projects.**
