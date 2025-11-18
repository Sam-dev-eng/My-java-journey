package data.repositories;
import data.models.Ticket;
import data.repositories.Interfaces.TicketRepository;
import exceptions.TicketExceptions.EmptyTicketsException;
import exceptions.TicketExceptions.TicketException;
import exceptions.TicketExceptions.TicketIdNotFoundException;

import java.util.HashMap;

public class Tickets implements TicketRepository {
    private static final HashMap<Integer,Ticket> tickets = new HashMap<>();
    private static long count = 0;

    @Override
    public Ticket save(Ticket ticket) {
        if (tickets.containsValue(ticket))return updateTicket(ticket);
        ticket.setId(id());
        tickets.put(id(),ticket);
        count++;
        return ticket;
    }
    private Ticket updateTicket(Ticket ticket){
        int id = ticket.getId();
        tickets.put(id,ticket);
        return ticket;
    }

    private int id(){
        return (int)count + 1;
    }

    @Override
    public Ticket findById(int id) {
        validateId(id);
        return tickets.get(id);
    }

    private void validateId(int id){
        if(!tickets.containsKey(id)){
        throw new TicketIdNotFoundException("Ticket Id is not found");
        }
    }

    @Override
    public HashMap<Integer, Ticket> findAll() {
        validateTickets();
        return tickets;
    }
    private void validateTickets(){
        if(tickets.isEmpty()) throw new EmptyTicketsException("List of tickets are Empty");
    }

    @Override
    public void deleteById(int id) {
        validateId(id);
        tickets.remove(id);
        count--;
    }

    @Override
    public void deleteAll() {
        validateTickets();
        tickets.clear();
        count = 0;
    }

    @Override
    public void delete(Ticket ticket) {
        validateTickets(ticket);
        int id = ticket.getId();
        tickets.remove(id);
        count--;
    }
    private void validateTickets(Ticket ticket){
        if(!tickets.containsValue(ticket)) throw new TicketException("Ticket not found");
    }

    @Override
    public long count() {
        return count;
    }

}
