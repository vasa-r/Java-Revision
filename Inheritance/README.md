# **Inheritance in Java**

## **1. What is Inheritance?**

**Inheritance** is a fundamental concept in Object-Oriented Programming (OOP) that allows one class to inherit or acquire the properties (fields) and behaviors (methods) of another class. It enables code reusability and establishes a parent-child relationship between classes.

- The class that is **inherited from** is called the **parent class** or **superclass**.
- The class that **inherits** is called the **child class** or **subclass**.

### **Purpose of Inheritance:**

1. **Code Reusability**: Allows sharing of common code across multiple classes, reducing redundancy.
2. **Method Overriding**: Enables a subclass to provide a specific implementation of a method that is already defined in the superclass.
3. **Establishing a Hierarchy**: Helps to organize classes into a hierarchical structure.

---

## **2. How to Implement Inheritance in Java**

Inheritance is implemented using the `extends` keyword.

### **Syntax of Inheritance:**

```java
class Superclass {
    // Fields and methods
}

class Subclass extends Superclass {
    // Additional fields and methods
}
```

## **3. Example of Inheritance**

Let's look at an example where a `Vehicle` class is the superclass, and `Car` is the subclass that inherits from `Vehicle`.

```java
// Superclass
class Vehicle {
    String brand;
    int speed;

    // Method in the superclass
    void start() {
        System.out.println("Vehicle is starting...");
    }

    void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

// Subclass
class Car extends Vehicle {
    int numberOfDoors;

    // Constructor for the Car class
    Car(String brand, int speed, int numberOfDoors) {
        this.brand = brand;
        this.speed = speed;
        this.numberOfDoors = numberOfDoors;
    }

    // Method in the subclass
    void displayDetails() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h, Doors: " + numberOfDoors);
    }

    // Overriding the start method
    @Override
    void start() {
        System.out.println("Car is starting...");
    }
}

// Main class to demonstrate inheritance
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", 180, 4);

        // Accessing inherited methods
        myCar.start(); // Output: Car is starting...
        myCar.stop();  // Output: Vehicle is stopping...

        // Accessing the method of the Car class
        myCar.displayDetails(); // Output: Brand: Toyota, Speed: 180 km/h, Doors: 4
    }
}
```

### **Explanation:**

1. The `Vehicle` class is the **superclass** that contains common fields like `brand` and `speed`, and methods like `start()` and `stop()`.
2. The `Car` class is the **subclass** that extends `Vehicle` and inherits its properties and methods.
3. The `Car` class adds additional attributes like `numberOfDoors` and overrides the `start()` method to provide a custom implementation.

---

## **4. Key Concepts in Inheritance**

### **1. Method Overriding**

- When a subclass provides its own version of a method that is already defined in the superclass, it is called **method overriding**.
- The overridden method must have the same name, return type, and parameters as the method in the superclass.
- The `@Override` annotation is used to indicate that a method is being overridden.

### **Example of Method Overriding:**

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound(); // Output: Dog barks
    }
}
```

### **2. The `super` Keyword**

- The `super` keyword is used to refer to the immediate parent class object.
- It can be used to:
  1. **Call the superclass constructor**.
  2. **Access superclass methods**.
  3. **Refer to superclass fields**.

### **Example Using `super`:**

```java
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Animal name: " + name);
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name); // Calling the superclass constructor
        this.breed = breed;
    }

    void display() {
        super.display(); // Calling the superclass method
        System.out.println("Breed: " + breed);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");
        myDog.display();
        // Output:
        // Animal name: Buddy
        // Breed: Golden Retriever
    }
}
```

## **5. Types of Inheritance in Java**

### **1. Single Inheritance**

- A subclass inherits from one superclass.
- **Example**:

  ```java
  class Animal {
      // Fields and methods
  }

  class Dog extends Animal {
      // Additional fields and methods
  }
  ```

### **2. Multilevel Inheritance**

- A class is derived from a subclass, making a multi-level hierarchy.
- **Example**:

  ```java
  class Animal {
    // Fields and methods
  }

    class Dog extends Animal {
    // Additional fields and methods
    }

    class Puppy extends Dog {
    // Additional fields and methods
    }
  ```

### **3. Hierarchical Inheritance**

- Multiple subclasses inherit from one superclass.
- **Example**:

  ```java
  class Animal {
    // Fields and methods
  }

    class Dog extends Animal {
        // Additional fields and methods
    }

    class Cat extends Animal {
        // Additional fields and methods
    }
  ```

### **Note**:

- **Java does not support multiple inheritance** (a class cannot extend more than one class) to avoid complexity and ambiguity. However, multiple inheritance can be achieved using interfaces.

---

## **6. Advantages of Inheritance**

1. **Code Reusability**: Common code is shared among multiple classes, reducing redundancy and making maintenance easier.
2. **Extensibility**: Inheritance allows for extending and enhancing existing classes without modifying their source code.
3. **Polymorphism**: Inheritance enables polymorphism, which allows for dynamic method resolution and the ability to write flexible and reusable code.
4. **Organized Structure**: It simplifies modeling and creating a hierarchical structure of classes, making the system design more organized.

---

## **7. Disadvantages of Inheritance**

1. **Tight Coupling**: A subclass is tightly coupled to the superclass, making changes to the superclass potentially affect the subclass, which can complicate maintenance.
2. **Increased Complexity**: Complex inheritance hierarchies can be difficult to understand and manage, especially in large systems.
3. **Potential for Errors**: Improper use of inheritance, such as incorrectly overriding methods, can lead to errors and unexpected behavior.
