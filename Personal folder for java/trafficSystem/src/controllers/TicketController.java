package controllers;

import dtos.requests.BookTicketRequests;
import dtos.requests.SettleTicketRequest;
import dtos.requests.ViewTicketsRequest;
import dtos.responses.BookTicketResponse;
import dtos.responses.SettleTicketResponse;
import dtos.responses.ViewTicketResponse;
import services.TicketServiceImpl;
import services.servicesInterfaces.TicketServices;

public class TicketController {
    TicketServices ticketServices = new TicketServiceImpl();

    public BookTicketResponse bookTicket(BookTicketRequests requests){
        return ticketServices.bookTicketRequest(requests);
    }

    public SettleTicketResponse settleTicket(SettleTicketRequest request){
        return ticketServices.settleTicketRequest(request);
    }
    public ViewTicketResponse viewAllTickets(ViewTicketsRequest request){
        return ticketServices.viewTicketResponse(request);
    }
}
