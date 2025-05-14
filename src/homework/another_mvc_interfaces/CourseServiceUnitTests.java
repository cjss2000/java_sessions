package homework.another_mvc_interfaces;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;


public class CourseServiceUnitTests {

    private CourseService testedServiceInstance;

    @Before
    public void buildOutTestPrep() {
        testedServiceInstance = new CourseServiceImpl();
        //   testedServiceInstance.
    }


    @Test
    public void testAddCourse() {
        Course testedCourse = new Course("Unit Test Course", "Mr.Test", 1);

        assertEquals("Unit Test Course", testedCourse.getTitle());
        assertEquals("Mr.Test", testedCourse.getInstructor());
        assertEquals(1, testedCourse.getDurationInHours());


    }

    @Test
    public void TestedCourseListIncreasesByOne() {


        Course testedCourse = new Course("Unit Test Course", "Mr.Test", 1);
        int intialCourseCount = testedServiceInstance.listAllCourses().size();

        Course testedCourse2 = new Course("Unit Test Course2", "Mr.Test2", 2);
        int courseCount = testedServiceInstance.listAllCourses().size();

        assertEquals(intialCourseCount + 1, courseCount);
    }
    @Test
    public void TestModifyingCourseTitle(){
        Course testedCourse = new Course("Unit Test Course", "Mr.Test", 1);
        testedCourse.setTitle("Unit Test Course2");
        assertEquals("Unit Test Course2", testedCourse.getTitle());
    }
    @Test
    public void TestCourseFieldsAreCorrect(){
        Course testedCourse = new Course("Unit Test Course", "Mr.Test", 1);
        assertEquals("Unit Test Course", testedCourse.getTitle());
        assertEquals("Mr.Test", testedCourse.getInstructor());
        assertEquals(1, testedCourse.getDurationInHours());

    }
}

