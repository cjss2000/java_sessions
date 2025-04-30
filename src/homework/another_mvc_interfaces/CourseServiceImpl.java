package homework.another_mvc_interfaces;

import java.util.List;


public class CourseServiceImpl implements CourseService {
    List<Course> list;
    long idCounter;

    @Override
    public Course createCourse(String title, String instructor, int duration){
        Course course = new Course(idCounter, title, instructor,duration);
        list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Long id, String title, String instructor, int duration) {
        Course updatedCourse = null;
        for (Course course : list) {
            if (course.getId() == id) {
                updatedCourse = new Course(id, title, instructor, duration);
            }
        }  return updatedCourse;
    }

    @Override
    public Course getCourseById(Long id){

       for  (Course course : list){
            if (course.getId() == id){
          return course;
            }
        }
            return null;
    }
    @Override
    public List<Course> listAllCourses(){
        return list;
    }
    @Override
    public void deleteCourse(Long id){
        for (Course course : list){
            if (course.getId() == id){
                list.remove(course);
            }
        }
    }


}
