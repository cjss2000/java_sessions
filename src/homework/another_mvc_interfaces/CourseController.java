package homework.another_mvc_interfaces;

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
                cv.printMessage("Creating new course, please provide:");
                break;
                case 2:
                    cv.printMessage("Removing Course from List: ");
                    break;
                case 3:
                    cv.printMessage("Listing your courses...");
                    break;
                case 4:
                    cv.printMessage("Please provide your ID");
                    break;
                case 5:
                    cv.printMessage("Exiting program");
                    break;
                case 6:
                    isRunning = false;
                    System.out.println("Killing program :X");
                    break;
            }
        }

    }



}
