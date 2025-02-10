package homework.mcv_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class TaskService {

    List<Task> list = new ArrayList<>();


    public void addTask(Task task){

        list.add(task);
        System.out.println("The following Task has been added to the list: " + task.getId());
    }
    //why wouldn't this.getId work if I already have task implied as a parameter?

    public void removeTask(int id){
        for (Task task : list){
            if (task.getId() == id){
              list.remove(task);
            }
        }
    }

    public void getTaskById(int id){
        for (Task task : list){
            if (task.getId() == id){
                System.out.println(task);
            }
        }
    }

    public void markTaskAsDone(int id){
        for (Task task : list){
            if (task.getId() == id){
               task.setCompleted(true);
            }
        }
    }

    public void getAllTasks(){
        for (Task task : list){
            System.out.println(task);
        }

    }

    public void getPendingTasks(){
    for (Task task : list){
        if (!task.isCompleted()){
            System.out.println(task);
        }
    }
    }

    public void getCompletedTasks(){
        for (Task task : list){
            if (!task.isCompleted()){
                System.out.println(task);
            }
        }
    }
}
