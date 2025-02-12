package homework.mcv_design_pattern;

public class TaskController {

    TaskService taskService;
    TaskView taskView;

    TaskController(TaskService taskService, TaskView taskView){
        this.taskService = new TaskService();
        this.taskView = new TaskView();
    }

    TaskController(){
        this.taskService = new TaskService();
        this.taskView = new TaskView();
    }

    public TaskService getTaskService(){
    return this.taskService;
    }

    public TaskView getTaskView(){
        return this.taskView;
    }

    public void sayHi(){
        System.out.println("hi");
    }


//    public TaskService getTaskservice() {
//        return taskService;
//    }
//
//    public void setTaskservice(TaskService taskservice) {
//      //  TaskService ts = new TaskService();
//       // this.taskService = taskService;
//        this.taskService = new TaskService();
//    }
//
//    public TaskView getTaskView() {
//       return taskView;
//    }
//
//    public void setTaskView(TaskView taskView) {
//     //   TaskView tv = new TaskView();
//        this.taskView = new TaskView();
//
//    }






}
