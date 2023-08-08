package PhoneBookPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class PhoneBook {
    private String userName;
    private boolean isLock = true;
    private String pin;
    private List<Contact> contacts = new ArrayList<>();
    private String searchResult;

    public PhoneBook(String userName, String pin) {
        this.userName = userName;
        this.pin = pin;
    }

    public boolean isLock() {
        return isLock;
    }

    public void unlockPhoneBook(String pin) {
        if (this.pin.equals(pin)) isLock = false;
        else throw new IllegalArgumentException("invalid Password");
    }

    public void createContact(String firstName, String lastName, String phoneNumber) {
        Contact contact = new Contact(firstName, lastName, phoneNumber);
        contacts.add(contact);
    }

    public List<Contact> listOfContacts() {
        return contacts;
    }

    //    public void searchByName(String firstName) {
//        searchResult = "";
//        for (Contact contact : contacts)
//            if (contact.getFirstName().equals(firstName))
//                searchResult += contact.showDetails();
//    }
//    public String searchResult() {
//        return searchResult;
//    }
    public String searchByName(String name) {
        for (Contact contact : contacts)
            if (contact.getFirstName().equals(name)) return contact.showDetails();
        return null;
    }
}
