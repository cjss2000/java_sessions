package homework.mcv_design_pattern;

public class Main {

    public static void main(String[] args) {
//    Task task1 = new Task(1,"I'm a test", false);
//    Task task2 = new Task(2, "I'm also a test", false);
//    Task task3 = new Task(3, "I'm a completed Task", true);
//   // task1.toString();
//        System.out.println(task1.toString());
//        task1.markAsDone();
//        System.out.println(task1.toString());
//        TaskController tc = new TaskController();
//        tc.getTaskView().displayMenu();
//        tc.getTaskService().addTask(task1);
//        tc.getTaskService().addTask(task2);
//        tc.getTaskService().addTask(task3);
//        tc.getTaskService().getAllTasks();
//        tc.getTaskService().getPendingTasks();

        TaskController tc = new TaskController();
        tc.run();


    }

}
