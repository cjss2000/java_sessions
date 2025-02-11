package homework.mcv_design_pattern;

public class TaskController {

    TaskService taskService;
    TaskView taskView;

    public TaskService getTaskservice() {
        return taskService;
    }

    public void setTaskservice(TaskService taskservice) {
      //  TaskService ts = new TaskService();
       // this.taskService = taskService;
        this.taskService = new TaskService();
    }

    public TaskView getTaskView() {
       return taskView;
    }

    public void setTaskView(TaskView taskView) {
     //   TaskView tv = new TaskView();
        this.taskView = new TaskView();

    }






}
