# **Classes in Java**

## **1. What is a Class?**

A **class** in Java is a blueprint or template that defines the properties (fields/attributes) and behaviors (methods/functions) of objects. It serves as a design for creating objects that share similar characteristics.

### **Components of a Class:**

1. **Fields (Attributes)**: Variables that hold the data or state of an object. Example: `color`, `brand`, `speed` in a `Car` class.
2. **Methods**: Functions defined in a class that describe the actions or behaviors of an object. Example: `accelerate()`, `brake()`, `turn()` in a `Car` class.

### **Syntax of a Class:**

```java
class Car {
    // Fields
    String color;
    String model;
    int year;

    // Constructor
    Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Car Model: " + model + ", Color: " + color + ", Year: " + year);
    }
}

```

### **Explanation:**

1. **Fields**: color, model, and year represent the state of a Car object.

2. **Constructor**: nitializes the fields when an object is created.

3. **Methods**: `displayDetails()` prints the car's details.
