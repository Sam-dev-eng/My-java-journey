package services;

import data.models.Ofence;
import data.models.Officer;
import data.models.Ticket;
import data.models.Vehicle;
import data.repositories.Officers;
import data.repositories.Tickets;
import data.repositories.Vehicles;
import dtos.requests.BookTicketRequests;
import dtos.requests.SettleTicketRequest;
import dtos.requests.ViewTicketsRequest;
import dtos.responses.BookTicketResponse;
import dtos.responses.SettleTicketResponse;
import dtos.responses.ViewTicketResponse;
import exceptions.TicketExceptions.TicketIdNotFoundException;
import services.servicesInterfaces.TicketServices;

import static utils.Mapper.*;

public class TicketServiceImpl implements TicketServices {
    Vehicles vehicles = new Vehicles();
    Officers officers = new Officers();
    Tickets tickets = new Tickets();
    @Override
    public BookTicketResponse bookTicketRequest(BookTicketRequests request) {
        Vehicle vehicle = vehicles.findById(request.getVehicleId());
        Officer officer = officers.findById(request.getOfficerId());

        Ticket ticket = new Ticket();
        ticket.setIssuer(officer);
        ticket.setVehicleName(vehicle.getName());
        ticket.setDateOfBook();
        ticket.setOfence(Ofence.valueOf(request.getOffence().toUpperCase()));
        vehicle.addTickets(ticket);
        Tickets tickets = new Tickets();
        tickets.save(ticket);
        return map(ticket);
    }

    @Override
    public SettleTicketResponse settleTicketRequest(SettleTicketRequest request) {
        Vehicle vehicle = vehicles.findById(request.getVehicleId());
        Ticket ticket = findTicket(vehicle, request.getTicketId());
        Officer officer = officers.findById(request.getOfficerId());
        ticket.setPaymentOfficer(officer);
        ticket.setHasPaid(true);
        ticket.setDateOfPayment();
        tickets.save(ticket);
        return mapSettleTicket(ticket);
    }
    private Ticket findTicket(Vehicle vehicle,int ticketId){
        for(Ticket ticket : vehicle.getTickets()){
            if(ticket.getId() == ticketId) return ticket;
        }
        throw new TicketIdNotFoundException("Cannot find ticket with this Id");
    }

    @Override
    public ViewTicketResponse viewTicketResponse(ViewTicketsRequest request) {
        Vehicle vehicle = vehicles.findById(request.getVehicleId());

        return mapViewTicket(vehicle);
    }
}
