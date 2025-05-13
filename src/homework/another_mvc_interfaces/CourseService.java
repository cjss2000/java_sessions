package homework.another_mvc_interfaces;

import java.util.List;
import java.util.UUID;

public interface CourseService {

    Course createCourse(UUID id, String title, String instructor, int duration);
    Course updateCourse(UUID id, String title, String instructor, int duration);
    List<Course> listAllCourses();
    Course getCourseByTitle(String title);
    Course getCourseByUUID(UUID id);
    void deleteCourse(UUID id);


}

