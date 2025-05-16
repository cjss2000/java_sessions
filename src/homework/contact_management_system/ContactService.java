package homework.contact_management_system;

import java.util.ArrayList;

public class ContactService {

    private ArrayList<Contact> list;

    public ContactService() {
        this.list = new ArrayList<Contact>();
    }

    public void addContact(int id, String name, String phone, String email) {
        list.add(new Contact(id, name, phone, email));
    }

    // TODO: pass an name instead of the id
    // TODO: add exceptions for when the id is not found
    public void removeContact(String name) {
        for (Contact contact : list) {
            if (contact.getName().equals(name)) {
                list.remove(contact);
            }
        }
    }

    // TODO: return a contact instead of printing it
    public Contact getContactById(int id) {
        for (Contact contact : list) {
            if (contact.getId() == id) {
                return contact;

            }
        }
        return null;
    }

    public void getAllContacts() {
        for (Contact contact : list) {
            contact.toString();

        }
    }

    public void getSortedContacts() {

    }
}

