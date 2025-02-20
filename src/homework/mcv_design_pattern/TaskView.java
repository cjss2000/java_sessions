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
        System.out.println(" 5) View all Tasks");
        System.out.println(" 6) Return Incomplete Tasks");
        System.out.println(" 7) Return Completed Tasks");
        System.out.println(" 0) Kill system");
    }

    public String userInputText(String controllerDescription) {
        System.out.println(controllerDescription);
        String userInput = scanner.nextLine();
        if (userInput.isEmpty()) {
            userInput = scanner.nextLine();
        }
        return userInput;
    }

    public int userIntInput(String controllerMessage) {
        System.out.println(controllerMessage);
        return scanner.nextInt();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displayError(String message) {
        System.out.println("ERROR: " + message);
    }

}

