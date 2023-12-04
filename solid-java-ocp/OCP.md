[Index](../README.md#index) > [START](../solid-java-start/START.md) > [SRP](../solid-java-srp/SRP.md) > [OCP](../solid-java-ocp/OCP.md)

# Open/Closed Principle (OCP)

The Open/Closed Principle (OCP) is a guiding principle in software design that encourages systems to be designed in a way that allows for easy extension without modifying existing code. 

In simpler terms, it suggests that classes or modules should be open for extension but closed for modification. 

This means you should be able to add new features or functionality without altering the existing, working code. 

OCP promotes a more flexible and scalable codebase, making it easier to adapt to changing requirements and add new features without risking the stability of the existing system.

## Steps:

 - First: By conversion we'll rename the LimitReadjustException class to ValidationException;
 - Second: Create a new package called rule and with ReadjustValidation interface;
 - Thirdy: Create within rule package the PercentRuleValidation class;
 - Fourth: Create within rule package the PeriodicityRuleValidation class;
 - Sixth: Change readjustSalaryEmployee method for validate rules;

## Out of Scope:

This project will not have unit tests, because the aim is just to explain the principles of SOLID.

**`Attention:` Always run unit tests, it's great practice and guarantees the quality of your projects.**

## Explanations: 
- Extract the percent rule for to use interfaces, we gives for service the possibility create more rules validation in the future.
- Until in this point we attend two rules business important (Percent and Periodicity);