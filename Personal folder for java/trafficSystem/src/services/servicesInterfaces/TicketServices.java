package services.servicesInterfaces;

import dtos.requests.BookTicketRequests;
import dtos.requests.SettleTicketRequest;
import dtos.requests.ViewTicketsRequest;
import dtos.responses.BookTicketResponse;
import dtos.responses.SettleTicketResponse;
import dtos.responses.ViewTicketResponse;

public interface TicketServices {
    BookTicketResponse bookTicketRequest(BookTicketRequests request);
    SettleTicketResponse settleTicketRequest(SettleTicketRequest request);
    ViewTicketResponse viewTicketResponse(ViewTicketsRequest request);

}
