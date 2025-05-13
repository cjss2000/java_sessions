package homework.another_mvc_interfaces;

import java.util.Random;
import java.util.UUID;

public class CourseController {

    ConsoleCourseView cv = new ConsoleCourseView();
    CourseServiceImpl cs = new CourseServiceImpl();

    public void start(){
        boolean isRunning = true;
        while (isRunning) {
            cv.displayMenu();
            int choice = cv.getInputAsInterger("Please select your choice..");
            switch (choice) {
                case 1:
                    gatherCourseInfoAndAddCourse("Please provide new course info");
                break;
                case 2:
                    gatherCourseInfoAndRemoveCourse("Ready to remove requested course..");
                   // gatherCourseInfo("Please provide list id you want to remove");
                    break;
                case 3:
                    gatherCourseInfoToPrintandPrint("Providing you with your current courses");
                    break;
                case 4:
                    gatherCourseInfoandFindbyID("Please provide your course ID");
                    break;
                case 5:
                    cv.printMessage("Exiting program");
                    isRunning = false;
                    break;
                case 6:
                    isRunning = false;
                    System.out.println("Killing program :X");
                    break;
            }
        }

    }
    public void gatherCourseInfoAndAddCourse(String messageToDisplay){
        cv.printMessage(messageToDisplay);
       // long id = new Random().nextLong();
        UUID id = UUID.randomUUID();
        int hours  =  cv.getInputAsInterger("Input duration: ");
        String title = cv.getInputAsString("Input title: ");
        String instructor  =  cv.getInputAsString("Input instructor name: ");
        cs.createCourse(id, title, instructor, hours);
        cv.printMessage("Successfuly created a course");

    }
    public void gatherCourseInfoAndRemoveCourse(String messageToDisplay){
        cv.printMessage(messageToDisplay);
       cv.printMessage("Please provide UUID for course you'd like to remove:");
     //  Long courseIDtoDelete = cv.getInputAsInterger("Please provide ID for course you'd like to remove:");
       String courseTitletoDelete =   cv.scanner.nextLine();
        cs.deleteCourse(courseTitletoDelete);

    }
    public void gatherCourseInfoToPrintandPrint(String messageToDisplay){
        cv.printMessage("Listing your courses...");
        cs.listAllCourses();
    }
    public void gatherCourseInfoandFindbyID(String messageToDisplay) {
        cv.printMessage("Please provide your ID");
        Long courseIDtoSearch =   cv.scanner.nextLong();
        cs.getCourseById(courseIDtoSearch);
    }

}
