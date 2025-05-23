package homework.another_mvc_interfaces;

import java.util.List;

public interface CourseService {

    Course createCourse(Long id, String title, String instructor, int duration);
    Course updateCourse(Long id, String title, String instructor, int duration);
    String listAllCoursesAsString();
    Course getCourseById(Long id);
    void deleteCourse(Long id);


}

