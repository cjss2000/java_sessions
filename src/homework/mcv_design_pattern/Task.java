package homework.mcv_design_pattern;

public class Task {

    private int id;
    private String description;
    private boolean isCompleted;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    Task(int id, String description, boolean isCompleted){
        this.id = id;
        this.description = description;
        this.isCompleted = isCompleted;
    }

    public void markAsDone(){
       this.isCompleted = true;
    }

    public String toString() {
        return "Task: " + this.getId() + " :" + this.getDescription() + " I need to fix this boolean later: " + this.isCompleted;
    }
}
