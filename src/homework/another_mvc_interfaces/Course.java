package homework.another_mvc_interfaces;

import java.util.UUID;

public class Course {

    private UUID uuid;

    private String title;
    private String instructor;
    private int durationInHours;

    Course(UUID id, String title, String instructor, int durationInHours) {
        this.uuid = id;
        this.title = title;
        this.instructor = instructor;
        this.durationInHours = durationInHours;
    }

    Course(String title, String instructor, int durationInHours) {
        this.uuid = UUID.randomUUID();
        this.title = title;
        this.instructor = instructor;
        this.durationInHours = durationInHours;
    }

    public UUID getId() {
        return uuid;
    }

    public void setId(UUID id) {
        this.uuid = id;
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
