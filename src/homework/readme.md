# Cloning Github Repository
     Open IntelliJ IDEA
     Clone Repository
        - From Welcome Screen: Click "Get from VCS"
        - From Open Project: File → New → Project from Version Control
    Enter Repository Details: Repository URL: https://github.com/cjss2000/java_sessions
    Choose directory location
    Click "Clone"
    Project Setup: 
        - Select open in new/current window
        - Click "Trust Project" if prompted
        - Wait for indexing

# Java Inheritance Homework

## Task Description
Create a hierarchy of classes to manage a digital library system, demonstrating both inheritance and encapsulation through object composition.

### Author Class (Encapsulation Example)
Create a class called `Author` with:
- private fields:
    - `firstName` (String)
    - `lastName` (String)
    - `email` (String)
    - `biography` (String)
- constructor that takes all fields
- private method `validateEmail(String email)` that checks email format
- public getters and setters with validation
- public method `getFullName()` that returns firstName + lastName
- public toString() method

### Base Class
Create a class called `Publication` with:
- private fields:
    - `id` (int)
    - `title` (String)
    - `publicationYear` (int)
    - `author` (Author) // Encapsulation through composition
- two constructors:
    - one taking all fields as parameters
    - one taking title, publicationYear, and author, generating random id (100-1000)
- public getters and setters
- public toString() method
- public method `calculatePrice()` that returns double

### Child Classes
1. Create class `Book` that inherits from `Publication`:
    - private field `pageCount` (int)
    - private field `publisher` (String)
    - implement required constructors
    - override toString()
    - override calculatePrice()

2. Create class `EBook` that inherits from `Publication`:
    - private field `fileSizeMB` (double)
    - private field `format` (String)
    - implement required constructors
    - override toString()
    - override calculatePrice()

### Main Class Example Usage
```java
// Example of how to create and use objects
Author author = new Author("John", "Doe", "john@email.com", "Famous writer...");
Book book = new Book("Java Programming", 2024, author, 300, "TechPress");
System.out.println(author.getFullName());
System.out.println(book.getAuthor().getBiography());