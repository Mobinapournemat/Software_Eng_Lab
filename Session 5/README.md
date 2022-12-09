# Abstract Factory 

First, we implement the test for the Iranian/Japanese garden project: 
![](screenshots/testabs.png)

Then, we implement the Abstract Factory pattern and run the tests (All of them passed): 
![](screenshots/chenartest.png)
![](screenshots/khatmitest.png)
![](screenshots/irgardencreator.png)
![](screenshots/japgardencreator.png)
![](screenshots/japftest.png)
![](screenshots/japtreetest.png)

# Prototype

# Builder

# Questions

## Q1:
1. Creational design patterns: Creational patterns are used to create objects for a suitable class that serves as a solution for a problem. Generally when instances of several different classes are available. They are particularly useful when you are taking advantage of polymorphism and need to choose between different classes at runtime rather than compile time.

2. Structural design patterns: Structural patterns form larger structures from individual parts, generally of different classes.Structural patterns vary a great deal depending on what sort of structure is being created for what purpose. Structural patterns are concerned with how classes and objects are composed to form larger structures. Structural class patterns use inheritance to compose interfaces or implementations. 

3. Behavioral design patterns: Behavioral patterns describe interactions between objects and focus on how objects communicate with each other. They can reduce complex flow charts to mere interconnections between objects of various classes. Behavioral patterns are also used to make the algorithm that a class uses simply another parameter that is adjustable at runtime. Behavioral patterns are concerned with algorithms and the assignment of responsibilities between objects.


## Q2:
Both design patterns which we used in this experiment are in the category of Creational design patterns. Creational design patterns include factory method, abstract factory, builder, prototype, and singleton.

## Q3: 
GOF are patterns i.e. proven design solutions to recurring problems. SOLID are principles and are not tied to any specific problem domain hence true in any scenario

## Q4: 
Singleton design pattern violates the Single Responsibility Principle since the objects control how they are created and manage their life-cycle. This clearly contradicts the Single Responsibility Principle which states that a class should have one and only one reason for change. In order to limit the ability of creating instances of a class, a better alternative is in leveraging the factory or builder design patterns and then encapsulating the object creation logic. Another problem with the Singleton design pattern is that you can't extend them easily. You would want to take advantage of the Decorator design pattern to change the behavior.
