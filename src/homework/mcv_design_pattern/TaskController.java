package homework.mcv_design_pattern;

import java.util.Scanner;

public class TaskController {

    private TaskService taskService;
    private TaskView taskView;

    TaskController() {
        this.taskService = new TaskService();
        this.taskView = new TaskView();
    }

    public void runner() {
        boolean isRunning = true;
        while (isRunning)    {
                taskView.displayMenu();
                int choice = taskView.userIntInput("Please select your choice: ");
               switch (choice) {
                   case 1:

                       addTaskfromUserInput();
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
                        taskView.displayMessage("Please provide task ID of task you'd like to complete");
                       showTasktobeCompleted();
                       break;
                   case 5:
                       taskView.displayMessage("Here are all tasks: ");
                       showTasksfromService();
                       break;
                   case 6:
                       taskView.displayMessage("Here are your open tasks: ");
                       showPendingTasks();
                       break;
                   case 7:
                       taskView.displayMessage("Here are your completed tasks: ");
                       showCompletedTasks();
                       break;
                   case 0:
                       System.out.println("Killing system");
                       isRunning = false;
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
    public void addTaskfromUserInput(){
        int id = taskView.userIntInput("Please enter your new task id: ");
        String description = taskView.userInput("Please provide description of your new task: ");
        boolean isCompleted = false;
        taskService.addTask(id, description, isCompleted);
        taskView.displayMessage("Your new task has been added to the list, please find via your ID:" + taskService.getAllTasks() );
    }

    public void showTasksfromService(){
       String showTasks = taskService.getAllTasks();
        taskView.displayMessage(showTasks);

    }
    public void showCompletedTasks(){
        String completedTasks = taskService.getCompletedTasks();
        taskView.displayMessage(completedTasks);
    }

    public void showTasktobeCompleted(){
        String finishedTask = taskService.markTaskAsDone(taskView.userIntInput(""));
    }
    public void showPendingTasks(){
        String pendingTasks = taskService.getPendingTasks();
    }
}
