package homework.mcv_design_pattern;

import java.util.Scanner;

public class TaskView {

    Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("***Task Menu Front Page***");
        System.out.println(" 1) add Task");
        System.out.println(" 2) Remove task via ID");
        System.out.println(" 3) Find Task by ID");
        System.out.println(" 4) Complete Task");
        System.out.println(" 5) View Task");
        System.out.println(" 6) Return open Tasks");
        System.out.println(" 7) Return Completed Tasks");
    }
    public static void hanldeChoice(int choice){

                switch (choice){
                    case 1 :
                    {
                    }
                    break;
                    case 2: {
                    }
                    case 3: {
                    }
                    case 4: {
                    }
                    case 5: {
                    }
                    case 6 : {
                    }
                    case 7 : {
                    }

                }

        }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    // printing happens here as the view handles user INPUT and OUTPUT
    public void displayError(String message) {
        System.out.println("ERROR: " + message);
    }

    // TODO: change the return type here to int as the idea here is that the view should READ the input/handle user input and this
    // method in particular would handle reading an integer from the user
    public int readInt() {
        int userInt;
        System.out.println("Please enter your selection: ");
        userInt = scanner.nextInt();
        return userInt;
    }

    // TODO: change the return type here to String as the idea here is that the view should READ the input/handle user input and this
    // method in particular would handle reading a string from the user
    public void readString() {

    }
}

