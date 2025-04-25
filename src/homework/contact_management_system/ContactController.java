package homework.contact_management_system;

public class ContactController {

    //    ContactService cs = new ContactService();
//    ContactView cv = new ContactView();
    private ContactService cs;
    private ContactView cv;

    ContactController() {
        this.cs = new ContactService();
        this.cv = new ContactView();
    }

    public void run() {
        boolean isRunning = true;
        while (isRunning) {
            cv.displayMenu();
            int choice = cv.readInt("Please select your choice");
            switch (choice) {
                case 1:
                    cv.displayMessage("Add a new Contact:");
                    handleAddContact();
                    cs.getAllContacts();
                    break;
                case 2:
                    System.out.println("Remove a contact");
                    break;
                case 3:
                    System.out.println("View all contacts");
                    break;
                case 4:
                    System.out.println("View all sorted contacts");
                    break;
                case 5:
                    System.out.println("Search for a specific contacts");
                    break;
                case 6:
                    isRunning = false;
                    System.out.println("Killing program :X");
                    break;
            }
        }
    }

    public void handleAddContact() {
        String nameInput = cv.readString("Please enter contact name:");
        String phoneInput = cv.readString("Phone number: ");
        String emailInput = cv.readString("Enter email please:");
        int assignID = cv.readInt("Assign an ID");
        cs.addContact(assignID, nameInput, phoneInput, emailInput);
    }

    public void handleRemoveContact(int id) {
        //  cs.removeContact();
    }

    public void handleDisplayContacts() {
        cs.getAllContacts();
    }

    public void handleDisplaySortedContacts() {
        cs.getSortedContacts();
    }

    public void addTaskfromInput() {

    }

    public void handleSearch(){
        cv.readInt("Please list the ID you'd like to search: ");
       // cs.getContactById();
    }
}

