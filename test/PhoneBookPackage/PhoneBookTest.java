package PhoneBookPackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    PhoneBook phoneBook;

    @BeforeEach void startWith(){
        phoneBook = new PhoneBook("name", "0000");
    }
    @Test public void phoneBookExist(){
        assertNotNull(phoneBook);
    }
    @Test public void isPhoneBookLock(){
        assertTrue(phoneBook.isLock());
    }

    @Test public void phoneBookCanUnlockWithPassword(){
        phoneBook.unlockPhoneBook("0000");
        assertFalse(phoneBook.isLock());
    }
    @Test public void phoneCannotBeLockedWithWrongPassword(){
        boolean check = phoneBook.isLock();
        assertTrue(check);
        assertThrows(IllegalArgumentException.class,()->phoneBook.unlockPhoneBook("9999"));
        assertTrue(phoneBook.isLock());
    }
    @Test public void CreateContact(){
        boolean check = phoneBook.isLock();
        assertTrue(check);
        phoneBook.createContact("firstName", "lastName", "11111111");
        assertTrue(phoneBook.listOfContacts().size() == 1);
    }
    @Test public void CreateMultipleContact() {
        boolean check = phoneBook.isLock();
        assertTrue(check);
        phoneBook.createContact("firstName", "lastName", "11111111");
        phoneBook.createContact("firstName", "lastName", "11111111");
        assertEquals(2, phoneBook.listOfContacts().size());
    }
//    @Test public void searchMultipleContactTestA() {
//        boolean check = phoneBook.isLock();
//        assertTrue(check);
//        phoneBook.createContact("firstName", "lastName", "11111111");
//        assertEquals(1, phoneBook.listOfContacts().size());
//        phoneBook.searchByName("firstName");
//        String result = """
//                Name: firstName lastName
//                Number: 11111111
//                """;
//        System.out.println("result is "+ result);
//        System.out.println("real "+ phoneBook.searchResult());
//        assertEquals(result, phoneBook.searchResult());
//    }
//    @Test public void searchMultiplesContactTestA() {
//        boolean check = phoneBook.isLock();
//        assertTrue(check);
//        phoneBook.createContact("firstName", "lastName", "11111111");
//        phoneBook.createContact("firstName1", "lastName1", "22222222");
//        phoneBook.createContact("firstName2", "lastName2", "33333333");
//        assertEquals(3, phoneBook.listOfContacts().size());
//        phoneBook.searchByName("firstName2");
//        String result = """
//                Name: firstName2 lastName2
//                Number: 33333333
//                """;
//        System.out.println("result is " + result);
//        System.out.println("real " + phoneBook.searchResult());
//        assertEquals(result, phoneBook.searchResult());
//    }

    @Test public void searchMultiplesContactTestA() {
        boolean check = phoneBook.isLock();
        assertTrue(check);
        phoneBook.createContact("firstName", "lastName", "11111111");
        phoneBook.createContact("firstName1", "lastName1", "22222222");
        phoneBook.createContact("firstName2", "lastName2", "33333333");
        assertEquals(3, phoneBook.listOfContacts().size());
        String result = """
                Name: firstName2 lastName2
                Number: 33333333
                """;
        assertEquals(result,phoneBook.searchByName("firstName2"));
    }
}
