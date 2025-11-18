package services;
import data.models.*;
import data.repositories.*;
import dtos.requests.*;
import dtos.responses.*;
import services.servicesInterfaces.OfficerServices;
import static utils.Mapper.map;

public class OfficerServiceImpl extends VehicleServiceImpl implements OfficerServices {
    private final Officers officers = new Officers();

    @Override
    public RegisterOfficerResponse registerOfficer(RegisterOfficerRequests requests) {
        Officer officer = map(requests);
        officers.save(officer);
        return null;
    }

    @Override
    public BookTicketResponse ticketResponse(BookTicketRequests request) {
        Ticket ticket = map(request);
        Tickets tickets = new Tickets();
        tickets.save(ticket);
        return null;
    }
}
