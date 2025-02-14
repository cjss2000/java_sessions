package homework.mcv_design_pattern;

import java.util.Scanner;

public class TaskController {

    private TaskService taskService;
    private TaskView taskView;

    TaskController() {
        this.taskService = new TaskService();
        this.taskView = new TaskView();
    }

    public void run() {

            {
                taskView.displayMenu();
                int choice = taskView.readInt();
                taskView.hanldeChoice(choice);
                }
                // call the view's display menu
                // get the user's choice by calling the views' getInt method
                // add a switch statement to handle the user's choice
                // within the swtich statement call the handle methods

    }

}
