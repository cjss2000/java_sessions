package homework.mcv_design_pattern;

public class Main {

    public static void main(String[] args) {
        Task task1 = new Task(1, "I'm a test", false);
        Task task2 = new Task(2, "I'm also a test", false);
        Task task3 = new Task(3, "I'm a completed Task", true);

        TaskController tc = new TaskController();
        tc.runner();

    }

}
