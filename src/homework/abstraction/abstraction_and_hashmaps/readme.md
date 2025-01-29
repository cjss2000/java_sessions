# 🚗 Car Rental System - Abstract Class & HashMap Exercise

## 📌 Scenario

In this exercise, you will implement an **abstract class** in Java to model a **Car Rental System**, where rental cars are stored in a **HashMap** and different types of vehicles (Economy, Luxury) have different rental rates and deposit requirements.

---

## 🏗️ Task Description

### 1️⃣ Create an **Abstract Class** `Car`
- Define the following **instance variables**:
    - `carId` (String) - A unique identifier for the car.
    - `brand` (String) - The brand of the car (e.g., Toyota, BMW).
    - `model` (String) - The model of the car.
    - `rentalRate` (double) - The daily rental rate.
    - `isAvailable` (boolean) - Indicates if the car is available for rent.

- Implement the **constructor** to initialize these fields.

- Declare the following **abstract methods**:
    - `calculateRentalCost(int days)` - Computes the total rental cost based on the number of days.
    - `getDepositAmount()` - Returns the security deposit amount required for the car.

- Implement a **concrete method**:
    - `toggleAvailability()` - Toggles the availability of the car.

---

### 2️⃣ Create Subclasses that Extend `Car`

#### 🚗 `EconomyCar`
- Has a **fixed deposit of $200**.
- Implements `calculateRentalCost(int days)` by:
    - Returning `rentalRate × days`.
- Implements `getDepositAmount()` by:
    - Returning **$200**.

---

#### 🚘 `LuxuryCar`
- Has a **fixed deposit of $1000**.
- Implements `calculateRentalCost(int days)` by:
    - Applying **a 10% luxury tax** on top of `rentalRate × days`.
- Implements `getDepositAmount()` by:
    - Returning **$1000**.

---

### 3️⃣ Create a `CarRentalService` Class with a **HashMap**
- Store **all available cars** in a `HashMap<String, Car>`, where:
    - The **key** is `carId`.
    - The **value** is the `Car` object.

- Implement the following methods:
    - `addCar(Car car)`: Adds a car to the system.
    - `rentCar(String carId, int days)`:
        - Checks if the car is available.
        - If available, calculates rental cost and deposit.
        - Marks the car as **unavailable**.
    - `returnCar(String carId)`: Marks the car as **available** again.
    - `displayAvailableCars()`: Displays all available cars.

---

### 4️⃣ In the `main` Method:
- Create instances of `EconomyCar` and `LuxuryCar`.
- Add them to the `CarRentalService` HashMap.
- Rent a car and return it.
- Display available cars before and after rentals.

---

## 🎯 Expected Output Example

```plaintext
Available Cars:
[E001] Toyota Corolla - $40/day
[L001] BMW X5 - $120/day

Renting E001 for 3 days...
Total rental cost: $120.00
Deposit required: $200.00

Returning E001...
Car returned successfully!

Available Cars:
[E001] Toyota Corolla - $40/day
[L001] BMW X5 - $120/day
