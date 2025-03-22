# Java Interfaces & MVC Practice — Cleanly Separated Course Management System

This exercise helps you practice **interfaces**, build a **console-based Java application**, and implement **clean MVC architecture** with proper separation of concerns. You'll simulate a backend service using a `List<Course>` as an in-memory store — no database needed.

---

## 🎯 Objectives

- Design and implement Java interfaces
- Build a cleanly separated MVC system
- Use in-memory storage (via `List`) inside a service
- Practice clean design and data flow

---

## 🏗️ System Overview

You'll build a console-based Course Management System that allows a user to:

- Create a new course
- Update an existing course
- View all courses
- View course by ID
- Delete a course

The system must follow **strict MVC separation**.

---

## 🧩 Components to Implement

---

### 1. Model Layer

Create a `Course` class with the following fields:

- `id` (Long)
- `title` (String)
- `instructor` (String)
- `durationInHours` (int)

Also include:

- Constructor(s)
- Getters and setters
- `toString()` for display

---

### 2. Service Layer

Create an interface named `CourseService` that defines:

- `Course createCourse(String title, String instructor, int duration)`
- `Course updateCourse(Long id, String title, String instructor, int duration)`
- `List<Course> listAllCourses()`
- `Course getCourseById(Long id)`
- `void deleteCourse(Long id)`

Implement it in `CourseServiceImpl` with:

- An internal `List<Course>` for storage
- An `idCounter` for unique ID generation
- All CRUD logic performed using the list

---

### 3. View Layer

The view is responsible for all user interaction (input and output).

Create an interface `CourseView` with methods like:

- `int getInputAsInteger(String message)`
- `String getInputAsString(String message)`
- `void printMessage(String message)`
- `void printCourse(Course course)`
- `void printCourseList(List<Course> courses)`

Implement it in `ConsoleCourseView`, using `Scanner` for input and `System.out` for output.

---

### 4. Controller Layer

The controller coordinates the flow:

- Calls methods from the view to collect user input
- Constructs models (`Course`)
- Calls the service layer for logic
- Sends results back to the view for display

Create `CourseController` with a `start()` method that shows a menu and uses the view to:

- Read user choice
- Collect course data
- Delegate actions to the service
- Display results via the view

The controller **must not handle input/output directly** — that’s the view’s job.

---

### 5. Application Entry Point

Create a class `Application` with a `main` method that:

- Instantiates `CourseServiceImpl`
- Instantiates `ConsoleCourseView`
- Passes both to `CourseController`
- Calls `start()` to run the app

---

## 💡 Bonus Challenges

- Add validation (e.g., empty title not allowed)
- Add `CourseNotFoundException`
- Add filtering/searching by instructor
- Add persistence using a text or JSON file
- Add a `Student` class and simulate course enrollment (many-to-many)

---

## ✅ Summary

In this practice you will:

- Use interfaces to enforce separation
- Follow real-world MVC design
- Implement service-driven logic with no database
- Maintain clean responsibilities:  
  **Model = data**,  
  **View = user I/O**,  
  **Controller = flow**,  
  **Service = logic + state**

