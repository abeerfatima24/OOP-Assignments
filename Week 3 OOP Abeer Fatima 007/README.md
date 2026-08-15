# Object-Oriented Programming — Week 3 Assignment

## Student Information
- **Name:** Abeer Fatima
- **Seat No.:** BS25110006007
- **Course:** Object-Oriented Programming
- **Program:** BSCS

## Assignment Overview

This submission contains practice and implementation of the OOP concepts listed for Week 3 / Module 2.

## 1. Point and Triangle

Folder: `Point Triangle Demo`

### Point.java
The Point class includes:
- Private `x` and `y` attributes
- No-argument constructor
- Parameterized constructor
- Copy constructor
- Getters and setters
- Point addition
- Point subtraction
- Distance calculation
- `toString()`

### Triangle.java
The Triangle class is also included and demonstrates:
- Three Point attributes (`p1`, `p2`, `p3`)
- Default constructor
- Parameterized constructor
- Copying Point objects inside the constructor
- Getters and setters
- Perimeter calculation
- Area calculation
- Triangle type detection
- `toString()`

### MainDemo.java
The driver demonstrates:
- Creating Point objects
- Point addition
- Point subtraction
- Copy constructor
- `toString()`
- Proving that a copied Point is a separate object
- Creating a Triangle
- Displaying Triangle perimeter, area, and type

## 2. Stack and Heap Visualization

Folder: `Stack Heap Visuals`

The folder contains the **Point Addition Python Tutor screenshot** required for visualizing object references and objects during Point addition.

The visualization demonstrates the relationship between the main stack frame and Point objects stored in the heap.

## 3. ComplexNumber

Folder: `Complex Rational Demo`

`ComplexNumber.java` includes:
- Private real and imaginary attributes
- Default constructor
- Parameterized constructor
- Copy constructor
- Getters and setters
- Addition
- Subtraction
- Multiplication
- `toString()`

`MainDemo.java` demonstrates normal operations, the copy constructor, modification of the copied object, and an edge case with zero imaginary part.

## 4. RationalNumber

`RationalNumber.java` includes:
- Numerator and denominator attributes
- Default constructor
- Parameterized constructor
- Copy constructor
- Private `gcd()` helper method
- Getters and setters
- Fraction simplification
- Addition
- Subtraction
- `toString()`
- Handling of a zero denominator

`MainDemo.java` demonstrates:
- Normal fraction operations
- Simplification such as `4/8`
- Copy constructor
- Zero-denominator handling
- Zero numerator case

## Folder Structure

```text
Week 3 OOP Abeer Fatima BS25110006007/
│
├── Point Triangle Demo/
│   ├── Main.java
│   ├── Point.java
│   ├── Triangle.java
│   └── SampleOutput main.java.png
│
├── Complex Rational Demo/
│   ├── ComplexNumber UML.png
│   ├── ComplexNumber.java
│   ├── MainDemo.java
│   ├── RationalNumber UML.png
│   ├── RationalNumber.java
│   └── SAMPLE OUTPUT main.java.png
│
└── Stack Heap Visuals/
    └── Point Addition Python Tutor screenshot.png
```

## Important Note About the Driver Files

The current Point/Triangle driver source is saved as `Main.java`, while the public class inside it is named `MainDemo`.

The Complex/Rational driver is named `MainDemo.java` and contains `public class MainDemo`.

If compiling the Point/Triangle demo, the public class/file name should be made consistent before compilation.

## Concepts Covered

- Classes and objects
- Encapsulation
- Private attributes
- Constructors
- Default constructors
- Parameterized constructors
- Copy constructors
- Getters and setters
- `this`
- Object references
- Method calls using the dot operator
- Method overloading through constructors
- Object-to-object operations
- `toString()`
- Arithmetic methods
- Helper methods
- Object independence
- Stack and heap visualization
- Basic validation and edge-case handling
