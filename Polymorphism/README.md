# **Polymorphism in Java**

Polymorphism is one of the core concepts of Object-Oriented Programming (OOP) in Java. The term "polymorphism" is derived from the Greek words "poly" (meaning many) and "morph" (meaning forms). In simple terms, polymorphism allows objects to take on multiple forms. In Java, polymorphism can be achieved in two main ways:

1. **Compile-time Polymorphism (Method Overloading)**
2. **Runtime Polymorphism (Method Overriding)**

---

## **1. Types of Polymorphism**

### **1.1 Compile-time Polymorphism (Method Overloading)**

Compile-time polymorphism is achieved through **method overloading**, where multiple methods have the same name but different parameter lists (different signatures). The compiler determines which method to execute based on the method signature.

#### **Method Overloading Example:**

```java
class MathUtils {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathUtils math = new MathUtils();
        System.out.println(math.add(2, 3)); // Output: 5
        System.out.println(math.add(2, 3, 4)); // Output: 9
        System.out.println(math.add(2.5, 3.5)); // Output: 6.0
    }
}
```

### **Explanation of Method Overloading:**

- The `MathUtils` class has three `add()` methods with the same name but different parameter lists.
- The Java compiler determines which `add()` method to call based on the arguments passed.
- This form of polymorphism is resolved at **compile-time**, hence the name.

---

### **1.2 Runtime Polymorphism (Method Overriding)**

Runtime polymorphism is achieved through **method overriding**, where a subclass provides a specific implementation of a method that is already defined in its superclass. The method to be executed is determined at runtime, based on the object's actual type.

#### **Method Overriding Example:**

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

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Animal reference, Dog object
        myAnimal.sound(); // Output: Dog barks

        myAnimal = new Cat(); // Animal reference, Cat object
        myAnimal.sound(); // Output: Cat meows
    }
}
```

### **Explanation of Method Overriding:**

- The `sound()` method in the `Animal` class is overridden by the `Dog` and `Cat` classes.
- At runtime, the JVM decides which `sound()` method to call based on the actual object (`Dog` or `Cat`).
- This form of polymorphism is resolved at **runtime**, hence the name.

---

## **2. Rules for Method Overloading and Overriding**

### **2.1 Rules for Method Overloading:**

1. Methods must have the **same name** but different parameter lists (either in number, type, or order of parameters).
2. The return type of the methods can be the same or different.
3. Overloading is not affected by the **return type** or **access modifiers**.
4. Methods can have different access modifiers (like `public`, `private`, etc.).

### **2.2 Rules for Method Overriding:**

1. The method in the subclass must have the **same name, return type, and parameter list** as the method in the superclass.
2. The overriding method **cannot have a more restrictive access modifier** than the method in the superclass. For example, if the superclass method is `public`, the overriding method cannot be `protected` or `private`.
3. The overriding method can **throw fewer, narrower, or no exceptions**, but it cannot throw new or broader exceptions.
4. **Static methods cannot be overridden**. They can be hidden, but this is not polymorphism.
5. The method in the subclass should use the `@Override` annotation (optional but recommended) to indicate it is overriding a method from the superclass.

---

## **3. Polymorphism and Casting**

### **3.1 Upcasting**

- **Upcasting** is when a subclass object is referred to by a superclass reference. This is done automatically by the compiler.
- **Example:**
  ```java
  Animal myAnimal = new Dog(); // Upcasting
  ```

### **3.2 Downcasting**

- **Downcasting** is when a superclass reference is explicitly converted to a subclass type. This requires an explicit cast.
- **Example:**
  ```java
  Animal myAnimal = new Dog(); // Upcasting
  Dog myDog = (Dog) myAnimal; // Downcasting
  ```
- If you attempt to downcast and the object being referenced is not of the subclass type, it will throw a `ClassCastException`.

---

## **4. Advantages of Polymorphism**

1. **Code Reusability**: Using polymorphism, you can write code that works on the superclass level, which reduces redundancy.
2. **Flexibility and Maintainability**: Easier to add new functionalities by simply adding new classes and methods.
3. **Scalability**: Makes it easier to scale and extend applications since you can easily add new classes that implement existing methods.
4. **Dynamic Method Resolution**: In the case of method overriding, the method to be invoked is determined at runtime, providing a flexible way to handle different object behaviors.

---

## **5. Real-world Example of Polymorphism**

Consider a payment system where different payment methods (Credit Card, PayPal, Bank Transfer) are implemented:

```java
abstract class Payment {
    abstract void makePayment();
}

class CreditCardPayment extends Payment {
    @Override
    void makePayment() {
        System.out.println("Payment made using Credit Card");
    }
}

class PayPalPayment extends Payment {
    @Override
    void makePayment() {
        System.out.println("Payment made using PayPal");
    }
}

public class Main {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        payment.makePayment(); // Output: Payment made using Credit Card

        payment = new PayPalPayment();
        payment.makePayment(); // Output: Payment made using PayPal
    }
}
```

### **Explanation:**

- The `Payment` class is an abstract class with an abstract method `makePayment()`.
- `CreditCardPayment` and `PayPalPayment` classes provide their specific implementations of `makePayment()`.
- The `Main` class demonstrates polymorphism by assigning different `Payment` objects to the `payment` variable and invoking the `makePayment()` method.

---

## **6. Key Points to Remember**

1. **Polymorphism** allows one interface to be used for a general class of actions, promoting flexibility and the ability to add new functionality with minimal changes to existing code.
2. **Compile-time Polymorphism** is achieved using method overloading, while **Runtime Polymorphism** is achieved using method overriding.
3. Use **method overloading** to add more behavior for methods with the same name but different parameters, and **method overriding** to provide specific implementations for inherited methods.
