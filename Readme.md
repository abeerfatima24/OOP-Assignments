**Object-Oriented Programming** 
================================

                                 **Week 1 Lab**
===============================================

**Student:** Abeer Fatima 

**Seat No:** BS25110006007 

**Section:** B

**Course:** Object-Oriented Programming (4 Cr. Hrs 3 Theory + 1 Lab) 

**Semester:** July–November 2026 

**Course Supervisor:** Dr. Humera Tariq

**Overview**
------------

This repository contains my Week 1 Lab submission for the **"Thinking in Objects: From Everyday Things to Java Classes"** lab. The lab focuses on the design-first workflow observing real-world objects, drawing UML class diagrams, and translating them into working Java classes.

It includes:

*  Activity 1
    
*    Car class demo (Part A of the assignment)
    
*    Calculator class demo (Part B of the assignment)
    
*    UML diagrams for both classes
    
*   Stack/Heap diagram (Exercise 2)
    
*   Sample outputs for both programs
    

**Folder Structure**
--------------------
week01_AbeerFatima_007/

├── Readme.md

├── Activity 1.png                     # Five favourite objects worksheet

├── Activity 2.png                     # Exercise 2: stack/heap illustration for Car demo

│

├── Car/

│   ├── Car.java                       # Car class: attributes, constructor, behaviours

│   ├── Main.java                      # Driver: creates & tests two Car objects

│   ├── Car UML.png                    # UML class diagram for Car

│   └── sample output.txt              # Program output

│

└── Calculator/

    ├── Calculator.java                # Calculator class: arithmetic operations

    ├── Main.java                      # Driver: tests every operation (normal + edge cases)

    ├── Calculator UML.png             # UML class diagram for Calculator

    └── sampleouput.txt                # Program output

**How to Compile & Run**
------------------------
cd Car
javac Car.java Main.java
java Main

cd Calculator
javac Calculator.java Main.java
java Main

Requires **JDK 17 or later**.

**Car Class Features**
----------------------

**Category**

**Details**

**Attributes**

brand, color, speed, engineOn, fuelLevel _(added)_, turboMode _(added)_

**Behaviours**

setDetails(), startEngine(), stopEngine(), accelerate(), brake(), enableTurbo() _(creative feature)_, displayState()

**Rules enforced**

Cannot accelerate while engine is off · Speed never goes negative · stopEngine() resets speed and turbo to a safe state · Turbo only activates if engine is on and speed > 30 km/h

**Demonstration**

Main.java creates two independent Car objects (bmw, tesla), gives them different states, and shows they don't affect each other

 **Calculator Class Features**
------------------------------

**Category**

**Details**

**Base operations**

add(), subtract(), multiply(), divide()

**Added operations**

modulus(), power()

**Optional (varargs)**

add(double... numbers) accepts any number of operands

**Error handling**

divide() and modulus() detect division/modulus by zero and print an error instead of returning an incorrect result

**Demonstration**

Main.java calls every operation with at least one normal case and one edge case (e.g. divide(10, 0), power(9, 0.5))

**Activity 1 Five Favourite Object**
------------------------------------

A worksheet identifying five everyday objects, along with their relevant **attributes** (what they have) and **behaviours** (what they can do) see Activity1.png.

**Exercise 2 Stack vs Heap**
----------------------------

A diagram showing how bmw and tesla (reference variables) live on the **stack**, while the actual Car objects they point to live on the **heap** see Activity 2.png. This illustrates that two references can point to two completely independent objects in memory.

**Notes**

*   All source files compile without errors on JDK 17+.
    
*   UML diagrams match the code exactly (attributes, method signatures, return types).
    
*   Comments are included in the code to explain purpose, constructor logic, and rule enforcement.