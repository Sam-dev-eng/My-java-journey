package services.servicesInterfaces;

import data.models.Ticket;
import dtos.requests.RegisterVehicleRequest;
import dtos.requests.SettleTicketRequest;
import dtos.requests.ViewTicketsRequest;
import dtos.responses.RegisterVehicleResponse;
import dtos.responses.SettleTicketResponse;

import java.util.ArrayList;

public interface VehicleServices {
    RegisterVehicleResponse registerVehicle(RegisterVehicleRequest request);
    SettleTicketResponse settleTicket(SettleTicketRequest request);
    ArrayList<Ticket> viewTicets(ViewTicketsRequest request);
}
