# Chapter 1: Java Basics

This chapter covers the fundamental concepts of Java programming, including program execution, data types, type conversions, operators, control flow, and loops. Use this guide as an overview of these essential topics.

---

## Table of Contents

1. [Execution of Java Program](#execution-of-java-program)
2. [Data Types in Java](#data-types-in-java)
   - [Primitive vs Non-Primitive Data Types](#primitive-vs-non-primitive-data-types)
   - [Type Conversion](#type-conversion)
   - [Type Promotion](#type-promotion)
3. [Operators in Java](#operators-in-java)
4. [Control Flow](#control-flow)
5. [Loops](#loops)

---

### 1. Execution of Java Program

Java is a compiled and interpreted language. The process of running a Java program includes:

1. Writing the source code (`.java` file).
2. Compiling it into bytecode (`.class` file) using `javac` (Java Compiler).
3. The Java Virtual Machine (JVM) then interprets this bytecode into machine-specific instructions, allowing Java programs to run on different platforms without modification. This is known as the "Write Once, Run Anywhere" philosophy.

The program's execution starts from the `main` method, which acts as the entry point.

---

### 2. Data Types in Java

Java has two main categories of data types: Primitive and Non-Primitive.

#### Primitive vs Non-Primitive Data Types

- **Primitive Data Types**: These are the basic data types built into Java, including:
  - `byte`: 1 byte, integer values.
  - `short`: 2 bytes, integer values.
  - `int`: 4 bytes, integer values.
  - `long`: 8 bytes, integer values, larger range.
  - `float`: 4 bytes, decimal values, less precision.
  - `double`: 8 bytes, decimal values, higher precision.
  - `char`: 2 bytes, represents a single character (Unicode).
  - `boolean`: 1 bit, represents `true` or `false`.

- **Non-Primitive Data Types**: These include `String`, arrays, classes, and interfaces. Unlike primitives, non-primitive data types reference objects in memory and have methods associated with them.

#### Type Conversion

Type conversion in Java occurs in two forms:

- **Implicit Conversion**: Also known as "widening", this occurs automatically when assigning a smaller data type to a larger data type (e.g., `int` to `double`).
- **Explicit Conversion**: Also known as "narrowing", this requires explicit casting to convert a larger data type to a smaller one (e.g., `double` to `int`). This may lead to loss of precision.

#### Type Promotion

In expressions, smaller data types (e.g., `byte`, `short`, `char`) are automatically promoted to `int`. When different data types are used in an expression, Java promotes smaller data types to the largest type in the expression to ensure accuracy.

---

### 3. Operators in Java

Java provides various operators to perform operations on data, which are grouped into categories:

- **Arithmetic Operators**: Used for mathematical calculations (e.g., `+`, `-`, `*`, `/`, `%`).
- **Relational Operators**: Compare two values, resulting in a boolean (e.g., `==`, `!=`, `>`, `<`, `>=`, `<=`).
- **Logical Operators**: Combine boolean values or expressions (e.g., `&&` for AND, `||` for OR, `!` for NOT).
- **Assignment Operators**: Assign values to variables (e.g., `=`, `+=`, `-=`, `*=`, `/=`).
- **Unary Operators**: Operate on a single operand to perform operations like incrementing/decrementing (`++`, `--`), negation (`-`), etc.
- **Bitwise Operators**: Perform operations at the binary level (e.g., `&`, `|`, `^` for XOR, `~` for NOT).

Operators allow efficient manipulation of data and control of program logic.

---

### 4. Control Flow

Control flow statements direct the execution path of the code based on conditions. Common control flow constructs include:

- **if-else**: Evaluates a condition. If `true`, the `if` block runs; otherwise, the `else` block (if present) runs.
- **switch**: Evaluates a variable or expression and executes a matching case block. It provides a clear alternative to multiple `if-else` statements for specific types of values (like `int`, `String`, `char`).

These constructs help in decision-making within the program.

---

### 5. Loops

Loops allow repeated execution of a block of code based on a condition. Common loop types include:

- **for loop**: Repeats a block a set number of times, commonly used with a counter variable.
- **while loop**: Repeats a block as long as a condition is true. Useful when the number of iterations is not known in advance.
- **do-while loop**: Similar to `while`, but guarantees at least one execution, as the condition is evaluated after each iteration.

Loops are fundamental for tasks that require repeated actions, like iterating through data collections or performing calculations iteratively.

---

This concludes Chapter 1 of the Java tutorial. Understanding these basics is essential before diving deeper into Java programming, as they form the foundation of every Java application.
