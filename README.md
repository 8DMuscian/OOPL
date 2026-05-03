# ☕ Object-Oriented Programming Laboratory (OOPL)

A repository containing Java programs demonstrating core Object-Oriented Programming principles.

## 📂 Repository Structure

This repository contains solutions for the following laboratory experiments:

*   **🧮 Expt1.java: Basic Calculator**
    *   Demonstrates Classes, Objects, Methods, Constructors, and `switch-case` control flow.
    *   Operations: Addition, Subtraction, Multiplication, Division, and Factorial.
*   **🔢 Expt2.java: Array Manipulation**
    *   Demonstrates sorting of 1D arrays (Integers and Strings).
    *   Implements both Ascending and Descending sorts using standard `Arrays` utility methods.
*   **🔤 Expt3.java: String Operations**
    *   Demonstrates string manipulation and the `StringBuilder` class.
    *   Operations: Vowel/Consonant counting, character replacement, case conversion, and string reversal.
*   **🛒 Expt4.java: Inheritance & Polymorphism**
    *   Demonstrates hierarchical inheritance and method overriding using an E-commerce system model (`Product`, `Electronics`, `Clothing`, `Groceries`).
*   **💳 Expt5.java: Payment System**
    *   Demonstrates achieving multiple inheritance in Java using interfaces (`CardPayment`, `UPIPayment`).
*   **⚠️ Expt6.java: Exception Handling (Login System)**
    *   Demonstrates user login validation with custom error handling.
    *   Operations: Throws custom `InvalidCredentialsException` for incorrect data, handles `NullPointerException` for missing inputs, and catches generic exceptions for debugging logs.
*   **📦 Expt7.java: Product Inventory System**
    *   Demonstrates Create, Read, Update, and Delete (CRUD) operations using `ArrayList` and custom objects.
    *   Operations: Adding, updating prices, and removing products. Implements sorting by price or name using custom `Comparator` logic.
*   **🏢 Expt8.java: Employee Records Management**
    *   Demonstrates key-value pair data management using `HashMap` (Employee ID as key, Name as value).
    *   Operations: Adding, updating, deleting, and searching employee records. Extracts and displays all employees sorted in alphabetical order by their names.
*   **📚 Collections_TPS/** 
    *   A set of 20 practical implementations covering the broader Java Collections Framework.
    *   Data Structures utilized: `ArrayList`, `LinkedList`, `HashMap`, `HashSet`, `LinkedHashSet`, `ArrayDeque` (implemented as Stacks and Queues), and `TreeMap`.

## ⚙️ Prerequisites

*   ☕ Java Development Kit (JDK) installed.
*   **Note:** Method 2 (Direct Execution) requires JDK 11 or higher.

## 🚀 Execution Instructions

Navigate to the directory containing the Java files and run them using your terminal.

### 💻 Method 1: Standard Compilation (All Java Versions)

This is the traditional two-step process to compile the source code into bytecode and then execute it.

1.  **Compile the source code:**
    ```bash
    javac FileName.java
    ```
    *(Example: `javac Expt1.java`)*
    This command generates a `.class` file in the same directory.

2.  **Execute the compiled class:**
    ```bash
    java FileName
    ```
    *(Example: `java Expt1`)*
    *Warning: Do not include the `.class` extension when executing the `java` command. It will result in a `ClassNotFoundException`.*

### ⚡ Method 2: Direct Execution (Requires Java 11+)

You can run a single-file Java program directly from the source code without explicitly generating a `.class` file on disk:
```bash
java FileName.java
