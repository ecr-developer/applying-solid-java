[Index](../README.md#index) > [START](../solid-java-start/START.md) > [SRP](../solid-java-srp/SRP.md) > [OCP](../solid-java-ocp/OCP.md) > [LSP](../solid-java-lsp/LSP.md) > [ISP](../solid-java-isp/ISP.md)

# Interface Segregation Principle (ISP)

The Interface Segregation Principle (ISP) is a concept in object-oriented design that emphasizes creating small, client-specific interfaces rather than large, one-size-fits-all interfaces.

In simpler terms, a class should not be forced to implement interfaces it does not use.

ISP suggests breaking down interfaces into smaller, focused parts so that clients (classes or modules) are only required to implement the specific methods that are relevant to them.

This promotes a more modular and flexible design, preventing classes from being burdened with unnecessary methods. 

Essentially, ISP encourages interfaces to be tailored to the needs of the classes that implement them, enhancing code clarity and maintainability.

## New Scenario

For this scenario be showed, I'll to create a new business rule about taxation over employee.<br>
We know that there are different taxes for a professional who has a contract as an employee of the company and for an outsourced professional.<br>
These taxes can be levied at different times, for an employee it's an annual charge and for an outsourcer it's a monthly charge.<br>
So this case we have readjustment that are charge but not all situations, in this case the professional.

## Steps:

- First: Create Readjust interface with taxValue and taxDate fields;
- Second: Create Yearly class and implements Readjust interface;
- Thirdy: Create TaxableReadjustment interface and extends Readjust interface, in this interface will have incomeTaxAmount method;
- Fourth: Create Promotion class and implements TaxableReadjustment interface;

## Out of Scope:

This project will not have unit tests, because the aim is just to explain the principles of SOLID.

**`Attention:` Always run unit tests, it's great practice and guarantees the quality of your projects.**

## Explanations: 

As defined above, we have followed the interface segregation principle and have broken down our Readjust interface into two interfaces each representing a single tax operation.

---
