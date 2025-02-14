package homework.mcv_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class TaskService {

    // TODO: instead of instantiating the list here, you can pass it as a parameter to the constructor
    private List<Task> list;

    TaskService(){
        this.list = new ArrayList<>();
    }

    public void addTask(Task task) {
        list.add(task);
      //  System.out.println("The following Task has been added to the list: " + task.getId());
    }

    public void removeTask(int id) {
        for (Task task : list) {
            if (task.getId() == id) {
                list.remove(task);
            }
        }
    }

    // TODO: return a Task instead of void / system.out.println
    public Task getTaskById(int id) {
        for (Task task : list) {
            if (task.getId() == id) {
            }
        }
        return Task;
    }

    public void markTaskAsDone(int id) {
        for (Task task : list) {
            if (task.getId() == id) {
                task.setCompleted(true);
                // adding a break is just a better practice that prevents the rest of the loop from
                // executing once the task has ALREADY been found and marked as done
                break;
            }
        }
    }

    // TODO: return the list instead of void / system.out.println
    public void getAllTasks() {
        for (Task task : list) {
            System.out.println(task);
        }
    }

    // TODO: create a new list into which you add the tasks that are not completed and then return that list
    public void getPendingTasks() {
        for (Task task : list) {
            if (!task.isCompleted()) {
                System.out.println("the following tasks have not been completed: ");
                System.out.println(task);
            }
        }
    }

    // TODO: same as above
    public void getCompletedTasks() {
        for (Task task : list) {
            if (!task.isCompleted()) {
                System.out.println(task);
            }
        }
    }
}
