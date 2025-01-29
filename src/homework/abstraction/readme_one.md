# 💼 Employee Payroll System - Abstract Class Exercise

## 📌 Scenario

In this exercise, you will implement an **abstract class** in Java to model an **Employee Payroll System**. The goal is to define a common structure for handling employee payments while allowing different types of employees to have their own salary calculation rules.

---

## 🏗️ Task Description

### 1️⃣ Create an **Abstract Class** `Employee`
- Define the following **instance variables**:
    - `employeeId` (String) - A unique ID for the employee.
    - `name` (String) - The employee's name.
    - `baseSalary` (double) - The employee’s base salary.

- Implement the **constructor** to initialize these fields.

- Declare the following **abstract method**:
    - `calculateSalary()` - Returns the employee's total salary based on their payment type.

- Implement the following **concrete methods**:
    - `displayEmployeeInfo()`:
        - Prints the **employee ID, name, and salary**.

---

### 2️⃣ Create Subclasses that Extend `Employee`

#### 🏢 `SalariedEmployee`
- Has a **fixed salary** every month.
- Implements `calculateSalary()` by:
    - Returning the **base salary** as the total salary.
    - **Deducting a 10% tax**.

---

#### ⏳ `HourlyEmployee`
- Paid **per hour worked**.
- Defines an **hourly rate** (`hourlyWage`).
- Implements `calculateSalary(int hoursWorked)` by:
    - Calculating `totalSalary = hourlyWage × hoursWorked`.
    - **Applying overtime pay (1.5x the rate) for hours over 40**.

---

### 3️⃣ In the `main` Method:
- Create instances of `SalariedEmployee` and `HourlyEmployee`.
- Perform the following operations:
    - **Calculate salaries** for both types of employees.
    - **Check overtime pay** for hourly employees.
    - **Display employee information**.

---

## 🎯 Expected Output Example

```plaintext
Employee ID: E001 | Name: Alice | Salary: $4,500.00
Employee ID: E002 | Name: Bob | Salary: $2,250.00

Calculating salaries...
Salaried Employee (Alice) Monthly Salary (after tax): $4,500.00
Hourly Employee (Bob) Salary (45 hours worked, with overtime): $2,625.00

Final Payroll Status:
[ E001 ] Alice - Total Salary: $4,500.00
[ E002 ] Bob - Total Salary: $2,625.00
