# Java Input and Array Tutorial

This guide explains how to:
1. Take user input for various data types in Java.
2. Use fixed-size, multi-dimensional, and jagged arrays.
3. Compare equivalent functionalities between Java and C#.

---

## 1. User Input in Java

Java uses the `Scanner` class for reading user input from the console. Here’s how different data types are handled:

- **Integer Input**: `nextInt()` reads an integer.
- **Float Input**: `nextFloat()` reads a floating-point number.
- **Character Input**: `next().charAt(0)` reads the first character of a string.
- **String Input**: `nextLine()` reads a full line of text.

The `Scanner` class allows flexibility to read various data types, but keep in mind:
- When switching from `nextInt()` or `nextFloat()` to `nextLine()`, use `nextLine()` to clear out the newline character left in the buffer.

### Equivalent in C#

In C#, `Console.ReadLine()` reads input as a string. Type parsing (e.g., `int.Parse()`, `float.Parse()`) is needed to convert the input into specific data types.

---

## 2. Fixed-Size Arrays

A **fixed-size array** is an array with a predefined length, storing values of the same data type. In Java:

- Declare and initialize with fixed elements, e.g., `int[] fixedArray = {1, 2, 3};`.
- Access and iterate over elements using a `for-each` loop or standard `for` loop.

### Equivalent in C#

C# also supports fixed-size arrays with similar syntax, using `int[] fixedArray = {1, 2, 3};`.

---

## 3. Multi-dimensional Arrays

**Multi-dimensional arrays** in Java allow storage in a matrix-like (row-column) format. To define a 2D array:

- Specify the number of rows and columns during initialization.
- Access elements using two indices, `[row][column]`.

In our example:
- Rows and columns are determined by user input.
- A `for` loop iterates over each element, both for filling and displaying the array.

### Equivalent in C#

C# uses `int[,]` syntax for multi-dimensional arrays, which is more common than Java’s `[rows][columns]`. Other functionality, such as initialization and iteration, is similar.

---

## 4. Jagged Arrays

A **jagged array** in Java is an array of arrays where each row can have a different number of columns. To create a jagged array:

- Define the number of rows initially.
- Set the size of each row individually, allowing each row to hold a varying number of elements.

This structure is useful for datasets where each row has a different number of elements.

### Equivalent in C#

C# also supports jagged arrays with `int[][]` syntax, similar to Java. Each row’s length is defined separately, allowing flexible row sizes.

---

## Java vs. C# Summary Table

| **Feature**               | **Java**                                | **C#**                                 |
|---------------------------|-----------------------------------------|----------------------------------------|
| **User Input**            | `Scanner` class with `nextInt()`, etc. | `Console.ReadLine()` with parsing      |
| **Fixed-Size Array**      | `int[]`                                | `int[]`                                |
| **Multi-dimensional Array** | `int[][]`                           | `int[,]`                               |
| **Jagged Array**          | `int[][]` (rows defined individually) | `int[][]` (rows defined individually)  |
| **String Concatenation**   | `"text " + value`                      | `$"text {value}"` with interpolation   |

### Closing Notes

This guide covers basic input and array usage in Java, highlighting similarities with C#. Use this as a quick reference for transitioning between these languages or understanding core concepts.
