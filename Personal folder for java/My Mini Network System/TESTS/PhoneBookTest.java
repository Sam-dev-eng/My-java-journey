import Exceptions.DuplicateNameException;
import Exceptions.PasswordException;
import Exceptions.PhoneBookLockedException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {

    PhoneBook book;
    @BeforeEach
    void setup(){
        book = new PhoneBook("Sam","Password");
    }
    @Test
    void testToUnlockMyPhoneBook(){
        book.unlockPhoneBook("Password");
        assertTrue(book.isLocked());
    }
    @Test
    void testIfICanLockMyPhoneBook(){
       book.unlockPhoneBook("Password");
       assertTrue(book.isLocked());
       book.lockPhoneBook();
       assertFalse(book.isLocked());
    }
    @Test
    void testIfICanUnlockPhoneBookWithAWrongPassword(){
        assertThrows(PasswordException.class,()->book.unlockPhoneBook("wrongPassword"));
        assertFalse(book.isLocked());
    }
    @Test
    void testIfICanAddAContact(){
        book.unlockPhoneBook("Password");
        book.addAContact("08060939292","preferredName");
        book.addAContact("976785647","anotherNAmem");
        assertTrue(book.viewListOfContacts().containsKey("preferredName"));
        assertTrue(book.viewListOfContacts().containsKey("anotherNAmem"));
        book.lockPhoneBook();
    }
    @Test
    void testIfICanAddContactWhenLocked(){
        assertThrows(PhoneBookLockedException.class,()-> book.addAContact("08060939292","preferredName"));
    }
    @Test
    void testToAvoidDuplicateNameInMyConTactList(){
        book.unlockPhoneBook("Password");
        book.addAContact("08060939292","preferredNamem");
        assertThrows(DuplicateNameException.class,()->book.addAContact("976785647","preferredNamem"));
        book.lockPhoneBook();
    }
    @Test
    void testToDeleteAContactFromMyContactList(){
        book.unlockPhoneBook("Password");
        book.addAContact("08060939292","preferredName");
        book.addAContact("976785647","anotherNAme");
        assertTrue(book.viewListOfContacts().containsKey("preferredName"));
        assertTrue(book.viewListOfContacts().containsKey("anotherNAme"));
        book.deleteContact("preferredName","Password");
        assertFalse(book.viewListOfContacts().containsKey("preferredName"));
        book.lockPhoneBook();

    }
    @Test
    void testToUpdateConTactNumber(){
        book.unlockPhoneBook("Password");
        book.addAContact("08060939292","Name");
        book.addAContact("976785647","anotherNAmeAgain");
        assertTrue(book.viewListOfContacts().containsKey("Name"));
        assertTrue(book.viewListOfContacts().containsKey("anotherNAmeAgain"));
        book.updateNumber("anotherNAmeAgain","976785647","090490233442");
        assertTrue(book.viewListOfContacts().containsValue("090490233442"));
        book.lockPhoneBook();
    }
    @Test
    void testToUpdateConTactName(){
        book.unlockPhoneBook("Password");
        book.addAContact("08060939292","addedName");
        book.addAContact("976785647","anotherAddedName");
        assertTrue(book.viewListOfContacts().containsKey("addedName"));
        assertTrue(book.viewListOfContacts().containsKey("anotherAddedName"));
        book.updateNumber("anotherAddedName","976785647","090490233442");
        assertTrue(book.viewListOfContacts().containsValue("090490233442"));
        book.updateName("addedName","aNewNameNow");
        assertEquals("08060939292",book.viewListOfContacts().get("aNewNameNow"));
        book.lockPhoneBook();
    }
    @Test
    void testToFindContactWithName(){
        book.unlockPhoneBook("Password");
        book.addAContact("08060939292","addedName1");
        book.addAContact("976785647","anotherAddedName2");
        assertTrue(book.viewListOfContacts().containsKey("addedName1"));
        assertTrue(book.viewListOfContacts().containsKey("anotherAddedName2"));
        assertEquals("08060939292",book.findContactByName("addedName1"));
        book.lockPhoneBook();
    }

    @Test
    void testToAddListInAFileToList(){
        book.unlockPhoneBook("Password");
        book.addAContact("08060939292","addedName001");
        book.addAContact("976785647","anotherAddedName110");
        assertTrue(book.viewListOfContacts().containsKey("addedName001"));
        assertTrue(book.viewListOfContacts().containsKey("anotherAddedName110"));
        book.updateNumber("anotherAddedName110","976785647","090490233442");
        assertTrue(book.viewListOfContacts().containsValue("090490233442"));
        book.updateName("addedName001","aNewNameNow");
        assertEquals("08060939292",book.viewListOfContacts().get("aNewNameNow"));
        book.lockPhoneBook();
    }


}
