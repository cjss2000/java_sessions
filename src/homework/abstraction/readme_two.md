# 🛒 E-Commerce Order Processing System - Abstract Class Exercise

## 📌 Scenario

In this exercise, you will implement an **abstract class** in Java to model an **E-Commerce Order Processing System**. The goal is to define a common structure for handling orders while allowing different types of orders to have their own shipping costs and discount rules.

---

## 🏗️ Task Description

### 1️⃣ Create an **Abstract Class** `Order`
- Define the following **instance variables**:
    - `orderId` (String) - A unique ID for the order.
    - `customerName` (String) - The name of the customer.
    - `orderAmount` (double) - The total amount of the order before any discounts.
    - `shippingCost` (double) - The cost of shipping (to be determined by subclasses).

- Implement the **constructor** to initialize these fields.

- Declare the following **abstract methods**:
    - `calculateShippingCost()` - Calculates the shipping cost based on the order type.
    - `applyDiscount()` - Applies any applicable discounts.

- Implement the following **concrete methods**:
    - `getFinalTotal()`:
        - Returns `orderAmount + shippingCost` after applying the discount.
    - `displayOrderSummary()`:
        - Prints the **order ID, customer name, total amount, and shipping cost**.

---

### 2️⃣ Create Subclasses that Extend `Order`

#### 📦 `StandardOrder`
- **Flat shipping cost** of `$5.00`.
- Implements `calculateShippingCost()` by:
    - Setting `shippingCost = 5.00`.
- Implements `applyDiscount()` by:
    - **Applying a 5% discount** if the order amount is **over $100**.

---

#### ⚡ `ExpressOrder`
- **Higher shipping cost** of `$10.00`, but **faster delivery**.
- Implements `calculateShippingCost()` by:
    - Setting `shippingCost = 10.00`.
- Implements `applyDiscount()` by:
    - **Applying a 10% discount** if the order amount is **over $200**.

---

### 3️⃣ In the `main` Method:
- Create instances of `StandardOrder` and `ExpressOrder`.
- Perform the following operations:
    - **Calculate shipping costs** for both types of orders.
    - **Apply discounts where applicable**.
    - **Display final order summaries**.

---

## 🎯 Expected Output Example

```plaintext
Order ID: SO123 | Customer: Alice | Order Amount: $120.00 | Shipping: $5.00
Discount Applied: 5% off
Final Total: $119.00

Order ID: EO456 | Customer: Bob | Order Amount: $250.00 | Shipping: $10.00
Discount Applied: 10% off
Final Total: $235.00
