## **What is an Object?**

An **object** in Java is an instance of a class. It represents a real-world entity and has a state (attributes) and behavior (methods). Objects are created using the class blueprint and can store data and perform actions defined by the class.

### **Characteristics of an Object:**

1. **State**: Represented by the fields (attributes) of the object. It reflects the properties of the object, such as color, model, or year for a `Car` object.
2. **Behavior**: Represented by the methods of the object. It defines what the object can do, like `start()`, `stop()`, or `accelerate()` for a `Car` object.
3. **Identity**: A unique identifier that distinguishes one object from another, typically represented by the memory address in Java.

### **How to Create an Object in Java:**

Objects are created using the `new` keyword, which calls the class constructor to initialize the object.

### **Syntax for Creating an Object:**

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

public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Red", "Toyota Camry", 2020);

        // Accessing the method of the Car object
        myCar.displayDetails(); // Output: Car Model: Toyota Camry, Color: Red, Year: 2020
    }
}

```

### **Explanation:**

- `Car myCar = new Car("Red", "Toyota Camry", 2020);` creates an object named `myCar` using the `Car` class. The object is initialized with specific values for `color`, `model`, and `year`.
- `myCar.displayDetails();` calls the `displayDetails()` method to print the car's details.

### **Key Points About Objects:**

1. **Multiple Objects**: You can create multiple objects from a single class, each with its own unique state.

   ```java
   Car car1 = new Car("Blue", "Honda Civic", 2018);
   Car car2 = new Car("Black", "Ford Mustang", 2021);

   car1.displayDetails(); // Output: Car Model: Honda Civic, Color: Blue, Year: 2018
   car2.displayDetails(); // Output: Car Model: Ford Mustang, Color: Black, Year: 2021
   ```

2. **Memory Allocation**: When an object is created, memory is allocated for its fields. Each object has a unique memory location.

3. **Objects Interact**: Objects can interact with each other, invoking each other’s methods and exchanging data.
