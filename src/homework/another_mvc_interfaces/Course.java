package homework.another_mvc_interfaces;

import java.util.Random;
import java.util.UUID;

public class Course {

    private Long id;
//    private UUID uuid;
    private String title;
    private String instructor;
    private int durationInHours;

    Course(Long id, String title, String instructor, int durationInHours) {
        this.id = id;
        this.title = title;
        this.instructor = instructor;
        this.durationInHours = durationInHours;
    }

    Course(String title, String instructor, int durationInHours) {
        // TODO: generate random id here
        this.id = new Random().nextLong(10000000); // <-- here
//        this.uuid = UUID.randomUUID();
        this.title = title;
        this.instructor = instructor;
        this.durationInHours = durationInHours;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getDurationInHours() {
        return durationInHours;
    }

    public void setDurationInHours(int durationInHours) {
        this.durationInHours = durationInHours;
    }

    public String toString() {
        return this.getId() + " " + this.getTitle() + " " + this.getInstructor() + " " + this.getDurationInHours();
    }
}
