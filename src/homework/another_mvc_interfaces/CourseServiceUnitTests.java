package homework.another_mvc_interfaces;

import static org.junit.Assert.*;

import java.util.UUID;
import org.junit.Test;
import org.junit.Before;

public class CourseServiceUnitTests {

    private CourseService testedServiceInstance;

    // TODO: please rename methods accordingly to the naming convention: testMethodName_ExpectedBehavior

    @Before
    public void buildOutTestPrep() {
        testedServiceInstance = new CourseServiceImpl();
        //   testedServiceInstance.
    }

    @Test
    public void testCreate_GettersAndSettersWorkAsExpected() {
        Course testedCourse = new Course("Unit Test Course", "Mr.Test", 1);

        assertEquals("Unit Test Course", testedCourse.getTitle());
        assertEquals("Mr.Test", testedCourse.getInstructor());
        assertEquals(1, testedCourse.getDurationInHours());
    }

    @Test
    public void testCreateCourse_shouldAddCourseToTheList() {
        int intialCourseCount = testedServiceInstance.listAllCourses().size();
        assertEquals(0, intialCourseCount);
        testedServiceInstance.createCourse(UUID.randomUUID(), "Unit Test Course", "Mr.Test", 1);
        int courseCount = testedServiceInstance.listAllCourses().size();
        assertEquals(1, courseCount);
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

    @Test
    public void testUpdateCourse_UpdatesExistingCourseEntry(){
        UUID id = UUID.randomUUID();
        testedServiceInstance.createCourse(id, "Unit Test Course", "Mr.Test", 1);
        assertEquals(1, testedServiceInstance.listAllCourses().size());

        testedServiceInstance.updateCourse(id, "UPDATED THIS FIELD", "Mr.Test2", 2);
        assertEquals(1, testedServiceInstance.listAllCourses().size());

        Course courseUpdated = testedServiceInstance.getCourseByUUID(id);
        assertNotNull(courseUpdated);
        assertEquals("UPDATED THIS FIELD", courseUpdated.getTitle());
    }
}