package homework.mcv_design_pattern;

public class Main {

    public static void main(String[] args) {
    Task task1 = new Task(1,"I'm a test", false);
   // task1.toString();
        System.out.println(task1.toString());
        task1.markAsDone();
        System.out.println(task1.toString());
    }

}
