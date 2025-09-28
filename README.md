# CalculatorApp  

**Author:** Shana Fatima  
**Date:** 28-09-2025  

---

## 📖 Description
CalculatorApp is a **modular and scalable Java calculator** that supports both **basic arithmetic** and **advanced operations**.  
It demonstrates **clean coding**, **exception handling**, **input validation**, and a **menu-driven interface**, making it suitable for portfolio and real-world use.

---

## ✨ Features
- ✅ Addition, Subtraction, Multiplication  
- ✅ Division and Modulus with exception handling for zero  
- ✅ Power and Square Root operations  
- ✅ Factorial of integers  
- ✅ Logarithm (base 10)  
- ✅ Absolute Value  
- ✅ Calculation History (stores past results in the same session)  
- ✅ Input validation for safe and user-friendly experience  
- ✅ Formatted output for readability  

---

## 🖥️ Sample Menu
====== Calculator Menu ======

Addition

Subtraction

Multiplication

Division

Modulus

Power

Square Root

Factorial

Logarithm (base 10)

Absolute Value

View Calculation History

Exit

## 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/shanafatima707/CalculatorApp.git
   cd CalculatorApp/src

## Compile the program:

javac Calculator.java

## Run the program:

java Calculator

## Example Output
Enter first number: 7
Enter second number: 0
Addition: 7.00
Subtraction: 7.00
Multiplication: 0.00
Division Error: Cannot divide by zero!
Modulus Error: Cannot modulus by zero!
Power: 1.00
Square Root: 2.65

## Sample History Output
====== Calculation History ======
7 + 5 = 12.00
12 * 3 = 36.00
36 / 0 = Error: Cannot divide by zero!
25 sqrt = 5.00
6! = 720
Log10(1000) = 3.00
|-15| = 15


This feature stores all operations during the program session and allows users to review past calculations.

## ⚠️ Edge Cases Tested

The program was tested with multiple edge cases to ensure reliability:

Division / Modulus by Zero → Gracefully handled with error message

Square Root of Negative Numbers → Displays error instead of crashing

Factorial of 0 → Correctly returns 1

Factorial of Large Numbers (e.g., 20!) → Returns correct large result

Logarithm of Negative Numbers → Error message shown

Logarithm of Zero → Error message shown

Absolute Value of Negative Input → Correctly returns positive number

Very Large Power Calculation (e.g., 10^20) → Returns result in scientific notation

## 📌 Tech Stack

Language: Java

Tools: Git, VS Code, Command Line

## 🏆 Why this project?

This project highlights:

Strong Java fundamentals

Modular design & clean code practices

Handling real-world edge cases (division by zero, negative square root, etc.)

Calculation History for improved user experience

Ready-to-run code for academic, interview, or portfolio use


