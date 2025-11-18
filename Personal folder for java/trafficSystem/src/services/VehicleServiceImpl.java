package services;
import data.models.*;
import data.repositories.*;
import dtos.requests.*;
import dtos.responses.*;
import exceptions.TicketExceptions.TicketIdNotFoundException;
import services.servicesInterfaces.VehicleServices;

import java.util.ArrayList;

import static utils.Mapper.map;

public class VehicleServiceImpl implements VehicleServices {
    Vehicles vehicles = new Vehicles();
    Officers officers = new Officers();
    Tickets tickets = new Tickets();


    @Override
    public RegisterVehicleResponse registerVehicle(RegisterVehicleRequest request) {
        Vehicle vehicle = map(request);
        vehicles.save(vehicle);
        return null;
    }

    @Override
    public SettleTicketResponse settleTicket(SettleTicketRequest request) {
        Vehicle vehicle = vehicles.findById(request.getVehicleId());
        Ticket ticket = findTicket(vehicle, request.getTicketId());
        Officer officer = officers.findById(request.getOfficerId());
        ticket.setPaymentOfficer(officer);
        ticket.setHasPaid(true);
        ticket.setDateOfPayment();
        tickets.save(ticket);
        return null;
    }

    @Override
    public ArrayList<Ticket> viewTicets(ViewTicketsRequest request) {
        Vehicle vehicle = vehicles.findById(request.getVehicleId());
        return vehicle.getTickets();
    }

    private Ticket findTicket(Vehicle vehicle,int ticketId){
        for(Ticket ticket : vehicle.getTickets()){
        if(ticket.getId() == ticketId) return ticket;
        }
        throw new TicketIdNotFoundException("Cannot find ticket with this Id");
    }



}