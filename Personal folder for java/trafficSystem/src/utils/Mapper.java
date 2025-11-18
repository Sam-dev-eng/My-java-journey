package utils;


import data.models.*;
import data.repositories.Officers;
import data.repositories.Vehicles;
import dtos.requests.BookTicketRequests;
import dtos.requests.RegisterOfficerRequests;
import dtos.requests.RegisterVehicleRequest;
import exceptions.TicketExceptions.NoMatchOffenceException;

public class Mapper {

    public static Vehicle map(RegisterVehicleRequest request){
        Vehicle vehicle = new Vehicle();
        vehicle.setName(request.getVehicleName());
        vehicle.setColour(request.getVehicleColour());
        vehicle.setModel(request.getVehicleModel());
        vehicle.setOwner(getOwner(request));
        return vehicle;
    }
    private static Owner getOwner(RegisterVehicleRequest request){
        Owner owner = new Owner();
        owner.setName(request.getOwnerName());
        owner.setAddress(request.getOwnerAddress());
        owner.setEmail(request.getOwnerEmail());
        owner.setGender(request.getOwnerGender());
        owner.setPhone(request.getOwnerPhone());
        return owner;
    }

    public static Officer map(RegisterOfficerRequests requests){
        Officer officer = new Officer();
        requests.setName(officer.getName());
        requests.setRank(officer.getRank());
        return officer;
    }
    public static Ticket map(BookTicketRequests requests){
        Vehicles vehicles = new Vehicles();
        Officers officers = new Officers();


        Vehicle vehicle = vehicles.findById(requests.getVehicleId());
        Officer officer = officers.findById(requests.getOfficerId());

        Ticket ticket = new Ticket();
        ticket.setIssuer(officer);
        ticket.setVehicleName(vehicle.getName());
        ticket.setDateOfBook();
        ticket.setOfence(offence(requests.getOffence()));
        vehicle.addTickets(ticket);
        return ticket;
    }
    private static Ofence offence(String offence){
        String setOffence = offence.toLowerCase();
        return switch (setOffence) {
            case "one way" -> Ofence.ONEWAY;
            case "drinking while driving" -> Ofence.DRUNKDRIVING;
            case "no seat belt" -> Ofence.NOSEATBELT;
            case "over speeding" -> Ofence.OVERSPEEDING;
            default -> throw new NoMatchOffenceException("No offence match your input");
        };

    }

}
