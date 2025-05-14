package homework.another_mvc_interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class CourseServiceImpl implements CourseService {

    List<Course> list = new ArrayList<>();

    //  long idCounter;

    @Override

    public Course createCourse(UUID id, String title, String instructor, int duration){
        Course course = new Course(id, title, instructor,duration);

        list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(UUID id, String title, String instructor, int duration) {
        Course updatedCourse = null;
        for (Course course : list) {
            if (course.getId() == id) {
                updatedCourse = new Course(id, title, instructor, duration);
            }
        }
        return updatedCourse;
    }

    @Override

    //Change this to get course by name
    public Course getCourseByTitle(String title){

       for  (Course course : list){
            if (course.getTitle().equals(title)){
                System.out.println(course);
          return course;

    public Course getCourseById(Long id) {

        for (Course course : list) {
            if (course.getId().equals(id)) {
                return course;

            }
        }
        return null;
    }

    @Override


    public Course getCourseByUUID(UUID id){
        for  (Course course : list){
            if (course.getId() == id){
            System.out.println(course);
            return course;
        }
    }
        return null;}

    @Override
    public List<Course> listAllCourses(){

        return list;
    }
    //verify this actdually returns the list or prints the list data, something with the ToString method?
    @Override
    public void deleteCourse(UUID id){
        for (Course course : list){
            if (course.getId() == id){

                list.remove(course);
                System.out.println(course + " Has been deleted!");
            }
        }
    }


}
