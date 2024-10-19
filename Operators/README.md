# Operators in Java

An **operator** in Java is a symbol that performs operations on variables and values. Operators are used to manipulate data and perform tasks like arithmetic calculations, comparisons, logical decisions, and more.

## 1. Arithmetic Operators

These operators perform basic mathematical operations.

| Operator | Description         | Example |
| -------- | ------------------- | ------- |
| `+`      | Addition            | `a + b` |
| `-`      | Subtraction         | `a - b` |
| `*`      | Multiplication      | `a * b` |
| `/`      | Division            | `a / b` |
| `%`      | Modulus (remainder) | `a % b` |

---

## 2. Relational (Comparison) Operators

These operators compare two values and return a boolean (`true` or `false`).

| Operator | Description           | Example  |
| -------- | --------------------- | -------- |
| `==`     | Equal to              | `a == b` |
| `!=`     | Not equal to          | `a != b` |
| `>`      | Greater than          | `a > b`  |
| `<`      | Less than             | `a < b`  |
| `>=`     | Greater than or equal | `a >= b` |
| `<=`     | Less than or equal    | `a <= b` |

---

## 3. Logical Operators

These are used to combine multiple conditions and return a boolean result.

| Operator | Description | Example              |
| -------- | ----------- | -------------------- |
| `&&`     | Logical AND | `(a > b) && (a > c)` |
| `or `    | Logical OR  | `(a>b) or (a>c)`     |
| `!`      | Logical NOT | `!(a > b)`           |

---

## 4. Assignment Operators

These operators assign values to variables.

| Operator | Description         | Example                          |
| -------- | ------------------- | -------------------------------- |
| `=`      | Assign              | `a = 10`                         |
| `+=`     | Add and assign      | `a += 10` (same as `a = a + 10`) |
| `-=`     | Subtract and assign | `a -= 10` (same as `a = a - 10`) |

---

## 5. Unary Operators

These operators only work with one operand and perform operations like incrementing, decrementing, or negating values.

| Operator | Description    | Example        |
| -------- | -------------- | -------------- |
| `++`     | Increment by 1 | `++a` or `a++` |
| `--`     | Decrement by 1 | `--a` or `a--` |
| `-`      | Negate a value | `-a`           |

---

## 6. Bitwise Operators

These work on a bit level and are mostly used in low-level programming or manipulating bits.

| Operator | Description | Example  |
| -------- | ----------- | -------- |
| `&`      | AND         | `a & b`  |
| `^`      | XOR         | `a ^ b`  |
| `~`      | NOT         | `~a`     |
| `<<`     | Left shift  | `a << 2` |
| `>>`     | Right shift | `a >> 2` |

---

## 7. Ternary Operator

This is a shorthand for `if-else` statements, evaluating a condition and returning one of two values.

| Operator | Description                    | Example                         |
| -------- | ------------------------------ | ------------------------------- |
| `? :`    | Ternary (conditional) operator | `int result = (a > b) ? a : b;` |

---

### Summary

An operator is a symbol that tells the compiler to perform specific operations on operands. Different types of operators allow developers to perform a variety of tasks, such as arithmetic, comparisons, logical evaluations, and more.
