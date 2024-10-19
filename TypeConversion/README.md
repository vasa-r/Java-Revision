# Type Conversion, Type Casting, and Type Promotion in Java

In Java, type conversion, type casting, and type promotion are concepts that deal with converting between data types. Below are detailed explanations with examples for each.

### 1. Type Conversion (Implicit Casting / Widening)

This occurs when Java automatically converts a smaller data type into a larger one. It happens during assignments or calculations when the result can safely fit into the larger type without losing data.

```java
public class TypeConversionExample {
    public static void main(String[] args) {
        int intValue = 100;
        long longValue = intValue;  // Automatic conversion from int to long
        double doubleValue = longValue;  // Automatic conversion from long to double

        System.out.println("Integer Value: " + intValue);
        System.out.println("Long Value (after conversion): " + longValue);
        System.out.println("Double Value (after conversion): " + doubleValue);
    }
}
```

Output:

```output
    Integer Value: 100
    Long Value (after conversion): 100
    Double Value (after conversion): 100.0
```

### 2. Type Casting (Explicit Casting / Narrowing)

This is required when converting a larger data type to a smaller one. Since this could lead to loss of information, Java forces you to explicitly cast the type.

```java
public class TypeCastingExample {
    public static void main(String[] args) {
        double doubleValue = 10.5;
        int intValue = (int) doubleValue;  // Explicit casting from double to int

        System.out.println("Double Value: " + doubleValue);
        System.out.println("Integer Value (after casting): " + intValue);
    }
}
```

Output:

```output
   Double Value: 10.5
   Integer Value (after casting): 10
```

### 3. Type Promotion (Automatic in Expressions)

Type promotion occurs when the operands in an arithmetic operation are of different types. Java automatically promotes the smaller type to the larger type during the operation to avoid loss of precision.

```java
public class TypePromotionExample {
    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = 20;
        double doubleValue = 30.5;

        // byteValue is promoted to int, and then the result is promoted to double
        double result = byteValue + intValue + doubleValue;

        System.out.println("Result after type promotion: " + result);
    }
}
```

Output:

```output
   Result after type promotion: 60.5
```

### Summary of Type Conversion, Type Casting, and Type Promotion in Java

1. **Type Conversion (Implicit/Widening)**:  
   Java automatically converts smaller data types to larger ones when needed. No data is lost because the smaller type can fit within the larger one.

   **Example**:

   ```java
   int intValue = 100;
   long longValue = intValue;  // int is converted to long automatically
   ```

2. **Type Casting (Explicit/Narrowing)**:  
   This requires explicitly converting a larger data type to a smaller one. Data loss can occur, such as truncating the decimal part when converting from double to int.

   **Example**:

   ```java
   double doubleValue = 10.5;
   int intValue = (int) doubleValue;  // Results in 10, fractional part is lost
   ```

3. **Type Promotion**:  
   In arithmetic expressions, smaller data types are automatically promoted to larger types to avoid precision loss.

   **Example**:

   ```java
    byte byteValue = 10;
    int intValue = 20;
    double doubleValue = 30.5;
    double result = byteValue + intValue + doubleValue;  // Result is promoted to double

   ```
