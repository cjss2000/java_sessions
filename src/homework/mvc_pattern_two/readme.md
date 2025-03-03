# ✅ Simple Contact Management System - MVC, Collections, & Sorting Exercise

## 📌 Scenario

In this exercise, you will build a **Simple Contact Management System** in Java using the **MVC (Model-View-Controller) design pattern**. The system will let users **manage their contacts** via a command-line interface, where they can add, remove, search, list, and sort contacts.

Contacts will be stored using a **Collection** (e.g., an `ArrayList`), and user interactions will be handled via the `Scanner` class.

In addition, you will implement the **Comparable interface** in your model and create a **Comparator** for custom sorting (e.g., sorting contacts alphabetically by name).

---

## 🏗️ Task Description

### 1️⃣ Create the **Model** - `Contact` Class

- **Instance Variables:**
    - `id` (int) – A unique identifier for the contact.
    - `name` (String) – The contact's name.
    - `phone` (String) – The contact's phone number.
    - `email` (String) – The contact's email address.

- **Interface Requirements:**
    - **Comparable:** Implement the `Comparable<Contact>` interface to allow contacts to be compared. A common approach is to compare contacts based on `name`.

- **Methods:**
    - **Constructor:** Initialize the above fields.
    - **toString():** Override to return a formatted string representing the contact (e.g., `[1] John Doe | 123-456-7890 | john@example.com`).
    - **compareTo(Contact other):** Implement this method as part of the Comparable interface (e.g., compare by `name`).

---

### 2️⃣ Create the **Service** - `ContactService` Class

- **Purpose:** Manage the collection of contacts.
- **Storage:** Use a `List<Contact>` (preferably an `ArrayList`) to store contacts.
- **Methods:**
    - `addContact(Contact contact)`: Adds a new contact.
    - `removeContact(int id)`: Removes a contact by its ID.
    - `getContactById(int id)`: Finds and returns a contact by ID.
    - `getAllContacts()`: Returns a list of all contacts.
    - *(Optional)* A method to search for contacts by name.
    - **Sorting:** Implement a method that returns a sorted list of contacts. You can use:
        - The natural ordering defined by the **Comparable** interface
---

### 3️⃣ Create the **View** - `ContactView` Class (Handles ALL User Interaction)

- **Role:** Manage all user input/output using `Scanner`.
- **Methods:**
    - `displayMenu()`: Shows the available actions (e.g., "Press 1 to add a contact").
    - `displayMessage(String message)`: Prints a regular message to the user.
    - `displayError(String message)`: Prints an error message.
    - `readInt()`: Reads an integer input.
    - `readString()`: Reads a string input.
- *(Feel free to add any helper methods that might improve user interaction.)*

---

### 4️⃣ Create the **Controller** - `ContactController` Class

- **Role:** Coordinate the flow between the model, service, and view.
- **Instance Variables:**
    - A `ContactService` instance.
    - A `ContactView` instance.
- **Methods:**
    - `handleAddContact(String name, String phone, String email)`: Calls the service to add a new contact.
    - `handleRemoveContact(int id)`: Calls the service to remove a contact.
    - `handleDisplayContacts()`: Retrieves all contacts from the service and displays them via the view.
    - `handleDisplaySortedContacts()`: Retrieves the sorted list of contacts and displays them.
- **run() Method:**
    - Displays the menu with options like:
        - Add a new contact.
        - Remove a contact.
        - View all contacts.
        - View sorted contacts.
        - Search for a contact.
        - Exit the program.
    - Uses a loop (e.g., `while(true)`) to continuously prompt the user for actions until they choose to exit.

---

### 5️⃣ Create the **Main** Class

- **Purpose:** Entry point of the application.
- **Task:** Instantiate the controller and call its `run()` method to start the program.

---

## 🎯 Expected Output Example

```plaintext
Welcome to the Contact Management System!
-------------------------------------------
1. Add a new contact
2. Remove a contact
3. View all contacts
4. View sorted contacts
5. Search for a contact
6. Exit
-------------------------------------------
Enter your choice: 1
Enter contact name: John Doe
Enter phone number: 123-456-7890
Enter email address: john@example.com
Contact added successfully!

Enter your choice: 3
Contacts List:
[1] John Doe | 123-456-7890 | john@example.com

Enter your choice: 4
Sorted Contacts List:
[1] John Doe | 123-456-7890 | john@example.com
... (other contacts sorted based on the chosen criteria)

Enter your choice: 6
Exiting Contact Manager...
