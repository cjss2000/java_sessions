package homework.another_mvc_interfaces;

public class Application {

    public static void main(String[] args) {
        System.out.println("This is my java main class, there are many like it, but this one is mine. ");
        Course math = new Course(12345678L, "Math 101", "Mr. Steve", 5);
        CourseController cc = new CourseController();
        cc.start();
    }
}