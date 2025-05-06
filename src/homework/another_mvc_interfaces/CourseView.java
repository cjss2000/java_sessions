package homework.another_mvc_interfaces;

import java.util.List;

public interface CourseView {
    int getInputAsInterger(String message);
    String getInputAsString(String message);
    void printMessage(String message);
    void printCourse(Course course);
    void printCourseList(List<Course> courses);
    void displayMenu();
}
