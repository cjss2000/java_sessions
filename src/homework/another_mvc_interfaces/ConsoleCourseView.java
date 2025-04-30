package homework.another_mvc_interfaces;

import java.util.List;
import java.util.Scanner;

public class ConsoleCourseView implements CourseView{

    Scanner scanner;
    ConsoleCourseView() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void displayMenu(){
        System.out.println("Welcome to the Course Management System!");
        System.out.println("-----------------------------------------");
        System.out.println("1. Create a new Course");
        System.out.println("2. Remove a contact");
        System.out.println("3. List all Courses");
        System.out.println("4. View Course via ID");
        System.out.println("5. Exit program");
    }
    @Override
    public int getInputAsInterger(String message){
        System.out.println(message);
        int input = scanner.nextInt();
        return input;
    }
    @Override
    public String getInputAsString(String message){
        String newMessage = scanner.next();
        return newMessage;
    }
    @Override
    public void printMessage(String message){
        System.out.println(message);
    }

    @Override
    public void printCourse(Course course) {
        System.out.println(course);
    }

    @Override
    public void printCourseList(List<Course> course){
        //print courselist, likely from ServiceImp class
    }

}
