package homework.contact_management_system;

import java.util.Scanner;

public class ContactView {

    private Scanner scanner;

    ContactView(){
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu(){
        System.out.println("Welcome to the Contact Management System!");
        System.out.println("-----------------------------------------");
        System.out.println("1. Add a new contact");
        System.out.println("2. Remove a contact");
        System.out.println("3. View all contacts");
        System.out.println("4. View sorted contacts");
        System.out.println("5. Search a contact");
        System.out.println("6. Exit program");
    }

    public void displayMessage(String message){
        System.out.println(message);
    }
    public void displayError(String message){

    }

    public int readInt(String messsage){
        int input = scanner.nextInt();
        return input;
    }

    public String readString(String message){
        String input = scanner.next();
        return input;
    }
}

