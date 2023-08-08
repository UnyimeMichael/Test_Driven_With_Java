package PhoneBookPackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ContactTest {
    Contact contact;
    @BeforeEach void startWith(){
        contact = new Contact("firstName", "lastName", "08011111111");
    }

    @Test public void contactExistTest(){
        assertNotNull(contact);
    }
    @Test public void createContactTest(){
        contact.saveContact("segun","lastName","08011111111");
        assertEquals("""
                segun
                08011111111
                """, contact.getSavedContact());
    }
    @Test public void createMultipleContactTest(){
        contact.saveContact("segun","lastName","08011111111");
        contact.saveContact("femi","lastName","08011111112");
        assertEquals(2,contact.size());

    }

}