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
        boolean isRunning = true;
        while (isRunning)    {
                taskView.displayMenu();
                int choice = taskView.readInt();
               switch (choice) {
                   case 1:
                       taskView.displayMessage("Adding Task");
                    //   taskService.addTask();
                       taskView.handleTaskAdd();
                        break;
                   case 2:
                       taskView.displayMessage("Removing task, Please provide an ID:");
                       int  TaskId = taskView.readInt();
                       taskService.removeTask(TaskId);
                       taskView.handleTaskRemove();
                       break;
                   case 3:
                       taskView.displayMessage("Please provide task ID:");
                       taskService.getTaskById(taskView.readInt());
                       break;
                   case 4:
                       taskView.displayMessage("Here are your completed tasks: ");
                       taskService.getCompletedTasks();
                       break;
                   case 5:
                       taskView.displayMessage("Please enter ID for your task to view");
                       break;
                   case 6:
                       taskView.displayMessage("Here are your open tasks: ");
                       break;
                   case 7:
                       taskView.displayMessage("Here are your completed tasks");
                       break;

               }
                }
                // call the view's display menu
                // get the user's choice by calling the views' getInt method
                // add a switch statement to handle the user's choice
                // within the swtich statement call the handle methods

    }
//        public String TaskFetcher(Task task){
////        String TaskFetcher = this.task.toString()
//       }


}
