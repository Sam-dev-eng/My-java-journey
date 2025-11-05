import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {
    Contact contact;
    @BeforeEach
    void setUp(){
       contact = new Contact("defaultName","number");
    }
    @Test
    void testContact() {
        assertEquals("defaultName", contact.getDefaultName());
        assertEquals("number",contact.getNumber());
    }
    @Test
    void testToChangeSaveAsContact() {
        contact.setSaveAs("my Homie");
        assertEquals("defaultName", contact.getDefaultName());
        assertEquals("my Homie",contact.getSaveAs());
    }
    @Test
    void setIsRegistered(){
        contact.setIsRegistered(true);
        assertTrue(contact.getIsRegistered());
    }

}
