package PhoneBookPackage;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int count;

    public Contact(String firstName, String lastName, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }


    public void saveContact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        count++;
    }

    public String getSavedContact() {
        return String.format("""
                %s
                %s
                %s
                """, firstName, lastName, phoneNumber);
    }
    public int size() {
        return count;
    }
    public String showDetails(){
        return String.format("""
                Name: %s %s
                Number: %s
                """, firstName,lastName,phoneNumber);
    }
    public String getFirstName() {
        return firstName;
    }
}
