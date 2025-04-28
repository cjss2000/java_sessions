package homework.another_mvc_interfaces;

import java.util.List;


public class CourseServiceImpl implements CourseService {
    List<Course> list;
    long idCounter;

    @Override
    public Course createCourse(String title, String instructor, int duration){
        Course course = new Course(idCounter, title, instructor,duration);
        return course;
    }

    @Override
    public Course updateCourse(Long id, String title, String instructor, int duration){

    }

    @Override
    public Course getCourseById(Long id){

    }


}
