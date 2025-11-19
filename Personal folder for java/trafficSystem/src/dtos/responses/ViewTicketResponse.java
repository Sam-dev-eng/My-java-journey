package dtos.responses;

import data.models.Ticket;

import java.util.ArrayList;

public class ViewTicketResponse {
    ArrayList<Ticket> tickets;

    @Override
    public String toString() {
        return "ViewTicketResponse{" +
                "tickets=" + tickets +
                '}';
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }
}
