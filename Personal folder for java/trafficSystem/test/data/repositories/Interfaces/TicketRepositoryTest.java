package data.repositories.Interfaces;

import data.models.Ticket;
import data.repositories.Tickets;
import exceptions.TicketExceptions.EmptyTicketsException;
import exceptions.TicketExceptions.TicketException;
import exceptions.TicketExceptions.TicketIdNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketRepositoryTest {
    TicketRepository tickets;
    @BeforeEach
    void setUp() {
        tickets = new Tickets();
    }
    @Test
    void testIfMyVehicleCountIsEmpty(){
        assertEquals(0, tickets.count());
    }
    @Test
    void testIfTheCountWillIncreaseWhenIAddOne(){
        Ticket ticket = new Ticket();
        tickets.save(ticket);
        assertEquals(1,tickets.count());
    }
    @Test
    void testIfTheCountWillIncreaseWhenAddedTwoTickets(){
        Ticket ticketOne = new Ticket();
        Ticket ticketTwo = new Ticket();
        tickets.save(ticketOne);
        tickets.save(ticketTwo);
        assertEquals(2,tickets.count());
    }
    @Test
    void testIfICanGetTicketsById(){
        Ticket ticketOne = new Ticket();
        Ticket ticketTwo = new Ticket();
        tickets.save(ticketOne);
        tickets.save(ticketTwo);
        assertEquals(2,tickets.count());
        Ticket expectedOne = tickets.findById(1);
        Ticket expectedTwo = tickets.findById(2);
        assertEquals(expectedOne,ticketOne);
        assertEquals(expectedTwo,ticketTwo);
    }
    @Test
    void testIfICanGetTicketWithAWrongId(){
        Ticket ticketOne = new Ticket();
        Ticket ticketTwo = new Ticket();
        tickets.save(ticketOne);
        tickets.save(ticketTwo);
        assertEquals(2,tickets.count());
        Ticket expectedOne = tickets.findById(1);
        Ticket expectedTwo = tickets.findById(2);
        assertEquals(expectedOne,ticketOne);
        assertEquals(expectedTwo,ticketTwo);
        assertThrows(TicketIdNotFoundException.class,()-> tickets.findById(10));
    }
    @Test
    void testToUpdateTicketIfTicketsAlreadyExist(){
        Ticket ticketOne = new Ticket();
        Ticket ticketTwo = new Ticket();
        tickets.save(ticketOne);
        tickets.save(ticketTwo);
        assertEquals(2,tickets.count());
        Ticket expectedOne = tickets.findById(1);
        Ticket expectedTwo = tickets.findById(2);
        assertEquals(expectedOne,ticketOne);
        assertEquals(expectedTwo,ticketTwo);
        ticketOne.setHasPaid(true);
        tickets.save(ticketOne);
        assertEquals(2,tickets.count());
        assertTrue(tickets.findById(1).isHasPaid());
        assertEquals(2,tickets.count());
    }


    @Test
    void testToDeleteATicketWithTheId(){
        Ticket ticketOne = new Ticket();
        Ticket ticketTwo = new Ticket();
        tickets.save(ticketOne);
        tickets.save(ticketTwo);
        assertEquals(2,tickets.count());
        Ticket expectedOne = tickets.findById(1);
        Ticket expectedTwo = tickets.findById(2);
        assertEquals(expectedOne,ticketOne);
        assertEquals(expectedTwo,ticketTwo);
        tickets.deleteById(1);
        assertThrows(TicketIdNotFoundException.class,()-> tickets.findById(1));
    }
    @Test
    void testToDeleteAllTheTickets(){
        Ticket ticketOne = new Ticket();
        Ticket ticketTwo = new Ticket();
        tickets.save(ticketOne);
        tickets.save(ticketTwo);
        assertEquals(2,tickets.count());
        Ticket expectedOne = tickets.findById(1);
        Ticket expectedTwo = tickets.findById(2);
        assertEquals(expectedOne,ticketOne);
        assertEquals(expectedTwo,ticketTwo);
        tickets.deleteById(1);
        tickets.deleteById(2);
        assertThrows(EmptyTicketsException.class,()-> tickets.findAll());
    }
    @Test
    void testTodeleteTicketByObject(){
        Ticket ticketOne = new Ticket();
        Ticket ticketTwo = new Ticket();
        tickets.save(ticketOne);
        tickets.save(ticketTwo);
        assertEquals(2,tickets.count());
        Ticket expectedOne = tickets.findById(1);
        Ticket expectedTwo = tickets.findById(2);
        assertEquals(expectedOne,ticketOne);
        assertEquals(expectedTwo,ticketTwo);
        tickets.delete(ticketOne);
        tickets.delete(ticketTwo);
        assertThrows(TicketException.class,()-> tickets.findAll());

    }
    @Test
    void testIfCanDeleteAllTheTickets(){
        Ticket ticketOne = new Ticket();
        Ticket ticketTwo = new Ticket();
        tickets.save(ticketOne);
        tickets.save(ticketTwo);
        assertEquals(2,tickets.count());
        Ticket expectedOne = tickets.findById(1);
        Ticket expectedTwo = tickets.findById(2);
        assertEquals(expectedOne,ticketOne);
        assertEquals(expectedTwo,ticketTwo);
        tickets.deleteAll();
        assertThrows(TicketException.class,()-> tickets.findAll());
    }
    @Test
    void testIfICanDeleteWhenNothingIsInSideTheList(){
        assertThrows(TicketException.class,()-> tickets.deleteAll());
    }
}
