package homework.mcv_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class TaskService {

    // TODO: instead of instantiating the list here, you can pass it as a parameter to the constructor
    private List<Task> list;

    TaskService(){
        this.list = new ArrayList<>();
    }


    public void addTask(int id, String description, boolean isCompleted) {
        list.add(new Task(id, description, isCompleted));
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
    public String getTaskById(int id) {
        String foundTask = "";
        for (Task task : list) {
            if (task.getId() == id) {
                foundTask = task.getId() + task.getDescription() + " is task completed: " + task.isCompleted();
            }
        }
      return foundTask;
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
    public String getAllTasks() {
      String  allTasks = "";
        for (Task task : list) {
          allTasks =  task.getId() + " " + task.getDescription();
        }
        return allTasks;
    }

    // TODO: create a new list into which you add the tasks that are not completed and then return that list
    public String getPendingTasks() {
        String pendingTasks = "";
        for (Task task : list) {
            if (!task.isCompleted()) {
             pendingTasks = task.getId() + " " + task.getDescription();
            }
        }
        return pendingTasks;
    }

    // TODO: same as above
    public String getCompletedTasks() {
        String completedTasks = "";
        for (Task task : list) {
            if (task.isCompleted()) {
               completedTasks = task.getId() + " " + task.getDescription();
            }

        }   return completedTasks;
    }

}
