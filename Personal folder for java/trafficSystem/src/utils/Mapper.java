package utils;


import data.models.*;
import dtos.requests.RegisterOfficerRequests;
import dtos.requests.RegisterVehicleRequest;
import dtos.responses.*;
import exceptions.OfficerExceptions.OfficerException;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Mapper {

    public static Vehicle map(RegisterVehicleRequest request) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName(request.getVehicleName());
        vehicle.setColour(request.getVehicleColour());
        vehicle.setModel(request.getVehicleModel());
        vehicle.setOwner(getOwner(request));
        return vehicle;
    }

    private static Owner getOwner(RegisterVehicleRequest request) {
        Owner owner = new Owner();
        owner.setName(request.getOwnerName());
        owner.setAddress(request.getOwnerAddress());
        owner.setEmail(request.getOwnerEmail());
        owner.setGender(request.getOwnerGender());
        owner.setPhone(request.getOwnerPhone());
        return owner;
    }

    public static Officer map(RegisterOfficerRequests requests) {
        Officer officer = new Officer();
        requests.setName(officer.getName());
        requests.setRank(officer.getRank());
        return officer;
    }

    public static BookTicketResponse map(Ticket ticket) {
        BookTicketResponse response = new BookTicketResponse();
        response.setVehicleName(ticket.getVehicleName());
        response.setId(ticket.getId());
        response.setDateOfBook(DateTimeFormatter.ofPattern("EEE DD:hh:mm a").format(ticket.getDateOfBook()));
        response.setIssuer(ticket.getIssuer().getName());
        response.setOfence(String.valueOf(Ofence.valueOf(ticket.getOfence() + "")));
        response.setDateOfPayment(DateTimeFormatter.ofPattern("EEE DD:hh:mm a").format(ticket.getDateOfPayment()));
        return response;
    }

    public static SettleTicketResponse mapSettleTicket(Ticket ticket) {
        SettleTicketResponse response = new SettleTicketResponse();
        response.setVehicleName(ticket.getVehicleName());
        response.setId(ticket.getId());
        response.setDateOfBook(DateTimeFormatter.ofPattern("EEE DD:hh:mm a").format(ticket.getDateOfBook()));
        response.setIssuer(ticket.getIssuer().getName());
        response.setOfence(String.valueOf(Ofence.valueOf(ticket.getOfence() + "")));
        response.setDateOfPayment(DateTimeFormatter.ofPattern("EEE DD:hh:mm a").format(ticket.getDateOfPayment()));
        return response;
    }

    public static RegisterOfficerResponse map(Officer officer) {
        RegisterOfficerResponse response = new RegisterOfficerResponse();
        response.setName(officer.getName());
        response.setRank(officer.getRank());
        response.setId(officer.getId());
        return response;

    }

    public static RegisterVehicleResponse map(Vehicle vehicle) {
        RegisterVehicleResponse response = new RegisterVehicleResponse();
        response.setColour(vehicle.getColour());
        response.setId(vehicle.getId());
        response.setModel(vehicle.getModel());
        response.setOwner(vehicle.getOwner().getName());
        response.setName(vehicle.getName());
        response.setYear(vehicle.getYear());
        response.setPlateNumber(vehicle.getPlateNumber());
        return response;

    }
    public static ViewTicketResponse mapViewTicket(Vehicle vehicle){
        ViewTicketResponse response = new ViewTicketResponse();
        ArrayList<Ticket> tickets = vehicle.getTickets();
        response.setTickets(tickets);
        return response;
    }
}
