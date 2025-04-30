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
        Course updatedCourse = null;
        for (Course course : list){
            if  (course.getId() == id){
            updatedCourse = new Course(id, title, instructor, duration);
        }
        return updatedCourse;
    }

    @Override
    public Course getCourseById(Long id){
            Course foundCourse = null;
        }
       for  (Course course : list){
            if (course.getId() == id){
          foundCourse =  System.out.println(course.toString());
            }
        }
       return foundCourse;
    }
    @Override
    public Course listAllCourses(){
        String listObjects = null;
        for (Course course : list){
          listObjects =  System.out.println(list);
        }
        return listObjects;
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
