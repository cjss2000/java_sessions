package homework.another_mvc_interfaces;

import java.util.List;

public interface CourseService {

    Course createCourse(String title, String instructor, int duration);
    Course updateCourse(Long id, String title, String instructor, int duration);
    Course listAllCourses();
    Course getCourseById(Long id);
    void deleteCourse(Long id);


}

