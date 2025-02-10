package homework.mcv_design_pattern;

import java.util.Scanner;

public class TaskView {

    Scanner scanner = new Scanner(System.in);

    public void displayMenu(){
        System.out.println("***Task Menu Front Page***");
        System.out.println(" 1) add Task");
        System.out.println(" 2) Remove task via ID");
        System.out.println(" 3) Find Task by ID");
        System.out.println(" 4) Complete Task");
        System.out.println(" 5) View Task");
        System.out.println(" 6) Return open Tasks");
        System.out.println(" 7) Return Completed Tasks");
    }
    public void displayMessage(String message){
    }
    public void displayError(String message){
    }
    public void readInt(){
    }
    public void readString(){

    }
}
