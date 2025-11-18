package services.servicesInterfaces;

import dtos.requests.BookTicketRequests;
import dtos.requests.RegisterOfficerRequests;
import dtos.responses.BookTicketResponse;
import dtos.responses.RegisterOfficerResponse;

public interface OfficerServices {
    RegisterOfficerResponse registerOfficer(RegisterOfficerRequests requests);

    BookTicketResponse ticketResponse(BookTicketRequests request);

}