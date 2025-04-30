package homework.contact_management_system;

public class ContactController {


    private ContactService service;
    private ContactView view;

    ContactController() {
  //      this.service = new ContactService();
        this.view = new ContactView();
    }

    public void run() {
        boolean isRunning = true;
        while (isRunning) {
            view.displayMenu();
            int choice = view.readInt("Please select your choice");
            switch (choice) {
                case 1:
                    // TODO: extract this to a method: handleAddContact();
                    view.displayMessage("Add a new Contact:");
                    handleAddContact();
               //     service.getAllContacts();
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
                    handleSearch();
                    break;
                case 6:
                    isRunning = false;
                    System.out.println("Killing program :X");
                    break;
            }
        }
    }

    public void handleAddContact() {
        String nameInput = view.readString("Please enter contact name:");
        String phoneInput = view.readString("Phone number: ");
        String emailInput = view.readString("Enter email please:");
        int assignID = view.readInt("Assign an ID");
    //    service.addContact(assignID, nameInput, phoneInput, emailInput);
    }

    public void handleRemoveContact(int id) {
        //  cs.removeContact();
    }

    public void handleDisplayContacts() {
        service.getAllContacts();
    }

    public void handleDisplaySortedContacts() {
        service.getSortedContacts();
    }

    public void addTaskfromInput() {

    }

    public void handleSearch() {
        int idToSearchFor = view.readInt("Please list the ID you'd like to search: ");
        Contact contactFound = service.getContactById(idToSearchFor);
        if (contactFound == null) {
            view.displayError("Contact not found");
        } else {
            view.displayMessage("Contact found: " + contactFound.toString());
        }
    }
}

