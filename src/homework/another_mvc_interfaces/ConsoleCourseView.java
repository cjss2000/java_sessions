package homework.another_mvc_interfaces;

import java.util.Scanner;

public class ConsoleCourseView implements CourseView{

    Scanner scanner;
    ConsoleCourseView() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public int getInputAsInterger(String message){
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
    @override
    public void printCourseList(List<Course> course){
        //print courselist, likely from ServiceImp class
    }

}
