package data.repositories.Interfaces;

import data.models.Officer;
import data.models.Ticket;

import java.util.HashMap;

public interface TicketRepository {
    Ticket save(Ticket ticket);
    Ticket findById(int id);
    HashMap<Integer,Ticket> findAll();
    void deleteById(int id);
    void deleteAll();
    void delete(Ticket ticket);
    long count();
}
