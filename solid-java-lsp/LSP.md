[Index](../README.md#index) > [START](../solid-java-start/START.md) > [SRP](../solid-java-srp/SRP.md) > [OCP](../solid-java-ocp/OCP.md) > [LSP](../solid-java-lsp/LSP.md)

# Liskov Substitution Principle (LSP)

The Liskov Substitution Principle (LSP) is a principle in object-oriented programming that states that objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program. 

In simpler terms, if a program is using a base class, it should be able to use any of its derived classes without unexpected behavior. 

LSP ensures that inheritance is used in a way that enhances rather than breaks the functionality of the program. 

Following LSP leads to more robust and predictable software, where subclasses can be seamlessly substituted for their parent classes.

## Steps:

- First: Change behavior Position enum for get the next position;
- Second: Create PersonalData class for receive some fields that it will extract of the Employee class;
- Thirdy: Change employee class to include PersonalData object and replace getters and setters for to use new object;
- Fourth: Create a third-party class similar to the employee class, but include the company field and without the promote field;
- Fiveth: Create new service of promotion and validate position and goal target;

## Out of Scope:

This project will not have unit tests, because the aim is just to explain the principles of SOLID.

**`Attention:` Always run unit tests, it's great practice and guarantees the quality of your projects.**

## Explanations: 
- Here we changed the behavior the position enum for know the next position of the employee;
- We separate data that are commons between employee and third-party, without that need change other point of the code;
- So far, we have complied with three more rules stated in the index;

---

Let's to apply the fourth principle: **Interface Segregation Principle** [(ISP)](../solid-java-isp/ISP.md)