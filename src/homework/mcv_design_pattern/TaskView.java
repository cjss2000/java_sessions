package homework.mcv_design_pattern;

import java.util.Scanner;

public class TaskView {

    private Scanner scanner;

    public TaskView() {
        this.scanner = new Scanner(System.in);
    }
    public void displayMenu() {
        System.out.println("***Task Menu Front Page***");
        System.out.println(" 1) add Task");
        System.out.println(" 2) Remove task via ID");
        System.out.println(" 3) Find Task by ID");
        System.out.println(" 4) Complete Task");
        System.out.println(" 5) View Task");
        System.out.println(" 6) Return open Tasks");
        System.out.println(" 7) Return Completed Tasks");
        int userInput = scanner.nextInt();
    }

    public String userInput(){
       String userInput = scanner.nextLine();
        return userInput;
    }

    public int userIntInput(){
       int inputInt = scanner.nextInt();
        return inputInt;
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    // printing happens here as the view handles user INPUT and OUTPUT
    public void handleTaskAdd(){
        System.out.println("Task has been added");
    }
    public void handleTaskRemove(){
        System.out.println("Task has been removed per id");
        System.out.println("Here is your current list: " );
    }

    public void displayError(String message) {
        System.out.println("ERROR: " + message);
    }

    // TODO: change the return type here to int as the idea here is that the view should READ the input/handle user input and this
    // method in particular would handle reading an integer from the user
    public int readInt() {
        int userInt;
        System.out.println("Please enter your selection: ");
        userInt = this.scanner.nextInt();
        return userInt;
    }

    // TODO: change the return type here to String as the idea here is that the view should READ the input/handle user input and this
    // method in particular would handle reading a string from the user
    public void readString() {

    }


}

