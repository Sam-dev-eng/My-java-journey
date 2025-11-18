package data.repositories.Interfaces;

import data.models.Officer;
import data.repositories.Officers;
import exceptions.OfficerExceptions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficerRepositoryTest {
    OfficerRepository officers;
    @BeforeEach
    void setUp() {
        officers = new Officers();
    }
    @Test
    void testTheDefaultCountOfTheRepository(){
        assertEquals(0,officers.count());
    }
    @Test
    void testIfTheCountWillIncreaseWhenIAddOneOfficer(){
        Officer officer = new Officer();
        officers.save(officer);
        assertEquals(1,officers.count());
    }
    @Test
    void testIfICanFindAddedOfficersByID(){
        Officer officer = new Officer();
        Officer saved = officers.save(officer);
        assertEquals(saved,officers.findById(1));

    }
     @Test
    void testIfICanAddTwoOfficersAndFindById(){
        Officer officerOne = new Officer();
        Officer officerTwo = new Officer();
        Officer savedOne = officers.save(officerOne);
        Officer savedTwo = officers.save(officerTwo);
        assertEquals(savedTwo,officers.findById(2));
        assertEquals(savedOne,officers.findById(1));

    }
    @Test
    void testToFindOfficerWithWrongId(){
        Officer officerOne = new Officer();
        Officer officerTwo = new Officer();
        Officer savedOne = officers.save(officerOne);
        Officer savedTwo = officers.save(officerTwo);
        assertEquals(savedTwo,officers.findById(2));
        assertEquals(savedOne,officers.findById(1));
        assertThrows(OfficerIdNotFoundException.class,()-> officers.findById(10));
    }
    @Test
    void testToUpdateOfficerWhenOfficerAlreadyExist(){
        Officer officerOne = new Officer();
        Officer officerTwo = new Officer();
        Officer savedOne = officers.save(officerOne);
        Officer savedTwo = officers.save(officerTwo);
        assertEquals(savedTwo,officers.findById(2));
        assertEquals(savedOne,officers.findById(1));
        assertThrows(OfficerIdNotFoundException.class,()-> officers.findById(10));
        officerOne.setName("sam");
        officers.save(officerOne);
        assertEquals("sam",officers.findById(1).getName());
        assertEquals(2,officers.count());
    }
    @Test
    void testIfICanDeleteOfficerById(){
        Officer officerOne = new Officer();
        Officer officerTwo = new Officer();
        Officer savedOne = officers.save(officerOne);
        Officer savedTwo = officers.save(officerTwo);
        assertEquals(savedTwo,officers.findById(2));
        assertEquals(savedOne,officers.findById(1));
        officers.deleteById(2);
        assertThrows(OfficerIdNotFoundException.class,()-> officers.findById(2));

    }

    @Test
    void testIfICanDeleteOfficerWithWrongId(){
        Officer officerOne = new Officer();
        Officer officerTwo = new Officer();
        Officer savedOne = officers.save(officerOne);
        Officer savedTwo = officers.save(officerTwo);
        assertEquals(savedTwo,officers.findById(2));
        assertEquals(savedOne,officers.findById(1));
        assertThrows(OfficerIdNotFoundException.class,()-> officers.deleteById(10));
    }
    @Test
    void testToDeleteOfficerWithTheObject(){
        Officer officerOne = new Officer();
        Officer officerTwo = new Officer();
        Officer savedOne = officers.save(officerOne);
        Officer savedTwo = officers.save(officerTwo);
        assertEquals(savedTwo,officers.findById(2));
        assertEquals(savedOne,officers.findById(1));
        officers.delete(officerOne);
        assertThrows(OfficerIdNotFoundException.class,()-> officers.findById(1));
    }
   @Test
   void testToDeleteOfficer_NotInTheOfficerstList(){
       Officer officerOne = new Officer();
       Officer officerTwo = new Officer();
       Officer savedOne = officers.save(officerOne);
       Officer savedTwo = officers.save(officerTwo);
       assertEquals(savedTwo,officers.findById(2));
       assertEquals(savedOne,officers.findById(1));
       Officer notSaved = new Officer();
       assertThrows(OfficerException.class,()-> officers.delete(notSaved));
   }
   @Test
    void testToDeleteAllOfficers(){
       Officer officerOne = new Officer();
       Officer officerTwo = new Officer();
       Officer savedOne = officers.save(officerOne);
       Officer savedTwo = officers.save(officerTwo);
       assertEquals(savedTwo,officers.findById(2));
       assertEquals(savedOne,officers.findById(1));
       officers.deleteAll();
       assertThrows(EmptyOfficersException.class,()-> officers.findAll());
   }


}