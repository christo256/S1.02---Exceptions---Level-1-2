## 📘 Sprint 2 - Java Exceptions - Level 1 & Level 2

## 📄 Description

This repository contains the exercises for **Level 1** and **Level 2** of the Java Exceptions module using `Scanner`, `try-catch`, and custom exception handling.

---

### 🧩 Level 1 - Exercise 1

Create a class named `Product` with the attributes `name` and `price`, and another class called `Sale`. The `Sale` class includes:

- A collection of products.
- A total price attribute.
- A method `calculateTotal()` which throws a custom exception `EmptySaleException` if no products are added to the sale.

If the product list is empty, it prints:  
**"To make a sale, you must add products first."**

Additionally, the exercise requires generating and catching an `IndexOutOfBoundsException`.

---

### 🧩 Level 2 - Exercise 1

Create a class called `Entry` used to manage user input via the `Scanner` class and handle possible exceptions.

Each method in this class:

- Receives a custom message string.
- Repeats the input prompt until the user provides a valid value.
- Uses `try-catch` to handle `InputMismatchException` and a custom `InputValidationException`.

**Methods to implement:**

With `InputMismatchException`:

- `public static byte readByte(String message);`
- `public static int readInt(String message);`
- `public static float readFloat(String message);`
- `public static double readDouble(String message);`

With custom `InputValidationException`:
``` java
- `public static char readChar(String message);`
- `public static String readString(String message);`
- `public static boolean readYesOrNo(String message);`

---

## 💻 Technologies Used

Java 23

IntelliJ IDEA (or any Java-compatible IDE)

Git + GitHub

.gitignore to manage unnecessary files

---

## 📋 Requirements

- Java JDK 17 or later
- IDE (IntelliJ IDEA or Eclipse)
- Git installed and configured
- `.gitignore` properly configured (e.g., excludes `/out`, `.idea/`, `*.class`...)

---

## 🛠️ Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/christo256/S1.02---Exceptions---Level-1-2/edit/master/README.md
