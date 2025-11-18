package data.repositories.Interfaces;

import data.models.Owner;
import data.repositories.Owners;
import exceptions.OwnersExceptions.OwnerException;
import exceptions.OwnersExceptions.OwnerIdNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerRepostoryTest {
    Owners owners;
    @BeforeEach
    void setUp() {
        owners = new Owners();
    }
    @Test
    void testTheDefaultCountOfCarOwners(){
        assertEquals(0,owners.count());
    }
    @Test
    void testToAddOwnersAndCheckTheCount(){
        Owner owner = new Owner();
        owners.save(owner);
        assertEquals(1,owners.count());
    }
    @Test
    void testToAddMoreThanOneOwnersAndCheckTheCount(){
        Owner ownerOne = new Owner();
        Owner ownerTwo = new Owner();
        owners.save(ownerOne);
        owners.save(ownerTwo);
        assertEquals(2,owners.count());
    }
    @Test
    void testToFindOwnerWithId(){
        Owner ownerOne = new Owner();
        Owner ownerTwo = new Owner();
        owners.save(ownerOne);
        owners.save(ownerTwo);
        assertEquals(2,owners.count());
        assertEquals(ownerOne,owners.findById(1));
        assertEquals(ownerTwo,owners.findById(2));
    }
    @Test
    void testToFindOwnerWithAWrongId(){
        Owner ownerOne = new Owner();
        Owner ownerTwo = new Owner();
        owners.save(ownerOne);
        owners.save(ownerTwo);
        assertEquals(2,owners.count());
        assertEquals(ownerOne,owners.findById(1));
        assertEquals(ownerTwo,owners.findById(2));
        assertThrows(OwnerIdNotFoundException.class,()-> owners.findById(10));
    }
    @Test
    void testToUpdateOwnerInsteadOfSaving(){
        Owner ownerOne = new Owner();
        Owner ownerTwo = new Owner();
        owners.save(ownerOne);
        owners.save(ownerTwo);
        assertEquals(2,owners.count());
        assertEquals(ownerOne,owners.findById(1));
        assertEquals(ownerTwo,owners.findById(2));
        assertThrows(OwnerIdNotFoundException.class,()-> owners.findById(10));
        ownerOne.setName("sam");
        owners.save(ownerOne);
        assertEquals("sam",owners.findById(1).getName());
        assertEquals(2,owners.count());
    }
    @Test
    void testToDeleteOwnerWithId(){
        Owner ownerOne = new Owner();
        Owner ownerTwo = new Owner();
        owners.save(ownerOne);
        owners.save(ownerTwo);
        assertEquals(2,owners.count());
        assertEquals(ownerOne,owners.findById(1));
        assertEquals(ownerTwo,owners.findById(2));
        assertThrows(OwnerIdNotFoundException.class,()-> owners.findById(10));
        ownerOne.setName("sam");
        owners.save(ownerOne);
        assertEquals("sam",owners.findById(1).getName());
        assertEquals(2,owners.count());
        owners.deleteById(1);
        assertThrows(OwnerIdNotFoundException.class,()-> owners.findById(1));
        assertEquals(1,owners.count());
    }
    @Test
    void testToDeleteOwnerWithWrongId(){
        Owner ownerOne = new Owner();
        Owner ownerTwo = new Owner();
        owners.save(ownerOne);
        owners.save(ownerTwo);
        assertEquals(2,owners.count());
        assertEquals(ownerOne,owners.findById(1));
        assertEquals(ownerTwo,owners.findById(2));
        assertThrows(OwnerIdNotFoundException.class,()-> owners.findById(10));
        ownerOne.setName("sam");
        owners.save(ownerOne);
        assertEquals("sam",owners.findById(1).getName());
        assertEquals(2,owners.count());
        owners.deleteById(1);
        assertThrows(OwnerIdNotFoundException.class,()-> owners.findById(1));
        assertEquals(1,owners.count());
        assertThrows(OwnerIdNotFoundException.class,()-> owners.deleteById(10));
    }
    @Test
    void testToDeleteOwnerObject(){
        Owner ownerOne = new Owner();
        Owner ownerTwo = new Owner();
        owners.save(ownerOne);
        owners.save(ownerTwo);
        assertEquals(2,owners.count());
        assertEquals(ownerOne,owners.findById(1));
        assertEquals(ownerTwo,owners.findById(2));
        assertThrows(OwnerIdNotFoundException.class,()-> owners.findById(10));
        ownerOne.setName("sam");
        owners.save(ownerOne);
        assertEquals("sam",owners.findById(1).getName());
        assertEquals(2,owners.count());
        owners.deleteById(1);
        assertThrows(OwnerIdNotFoundException.class,()-> owners.findById(1));
        assertEquals(1,owners.count());
        assertThrows(OwnerIdNotFoundException.class,()-> owners.deleteById(10));
        owners.delete(ownerTwo);
        assertThrows(OwnerIdNotFoundException.class,()-> owners.findById(2));
        assertEquals(0, owners.count());
    }
    @Test
    void testToDeleteAllOwners(){
        Owner ownerOne = new Owner();
        Owner ownerTwo = new Owner();
        owners.save(ownerOne);
        owners.save(ownerTwo);
        assertEquals(2,owners.count());
        assertEquals(ownerOne,owners.findById(1));
        assertEquals(ownerTwo,owners.findById(2));
        owners.deleteAll();
        assertThrows(OwnerException.class,()-> owners.findAll());
    }

}