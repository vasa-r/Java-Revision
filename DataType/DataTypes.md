# Data Types in Java

Java has a rich set of data types that can be broadly categorized into two main groups: **primitive data types** and **reference data types**.

## 1. Primitive Data Types

These are the basic data types built into the Java language. There are eight primitive data types:

| Data Type | Size    | Description                                  | Example Value            |
| --------- | ------- | -------------------------------------------- | ------------------------ |
| `byte`    | 8 bits  | Smallest integer type; range: -128 to 127    | `byte b = 100;`          |
| `short`   | 16 bits | Short integer type; range: -32,768 to 32,767 | `short s = 1000;`        |
| `int`     | 32 bits | Default integer type; range: -2^31 to 2^31-1 | `int i = 100000;`        |
| `long`    | 64 bits | Large integer type; range: -2^63 to 2^63-1   | `long l = 100000L;`      |
| `float`   | 32 bits | Single-precision floating-point type         | `float f = 10.5f;`       |
| `double`  | 64 bits | Double-precision floating-point type         | `double d = 20.99;`      |
| `char`    | 16 bits | Single 16-bit Unicode character              | `char c = 'A';`          |
| `boolean` | 1 bit   | Represents true or false                     | `boolean isTrue = true;` |

## 2. Reference Data Types

Reference data types refer to objects and can be classified into several categories:

- **String**: Collections of characters.
  ```java
  String str = "Hello, World!";
  ```
- **Arrays**: Collections of elements of the same type.
  ```java
  int[] numbers = {1, 2, 3, 4, 5};
   String[] names = new String[3];
  ```

## 3. Wrapper Classes

Each primitive data type has a corresponding wrapper class in the java.lang package. These classes allow primitives to be treated as objects, enabling additional functionalities. Here’s the mapping:

## Mapping of Primitive Types to Wrapper Classes

| Primitive Type | Wrapper Class |
| -------------- | ------------- |
| `byte`         | `Byte`        |
| `short`        | `Short`       |
| `int`          | `Integer`     |
| `long`         | `Long`        |
| `float`        | `Float`       |
| `double`       | `Double`      |
| `char`         | `Character`   |
| `boolean`      | `Boolean`     |
