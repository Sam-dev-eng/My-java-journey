package services.servicesInterfaces;


import data.repositories.*;
import dtos.requests.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.*;


import static org.junit.jupiter.api.Assertions.*;

class VehicleServicesTest {
    RegisterOfficerRequests officerRequests;
    RegisterVehicleRequest vehicleRequest;
    BookTicketRequests ticketRequest;
    SettleTicketRequest settleTicketRequest;
    Officers officers;
    VehicleServices vehicle;
    OfficerServices officer;
    RegisterVehicleRequest request;
    Vehicles vehicles;
    Tickets tickets;
    ViewTicketsRequest viewTicketsRequest;

    @BeforeEach
    void setUp() {
        settleTicketRequest = new SettleTicketRequest();
        vehicleRequest = new RegisterVehicleRequest();
        ticketRequest = new BookTicketRequests();
        officerRequests = new RegisterOfficerRequests();
        officers = new Officers();
        officer = new OfficerServiceImpl();
        vehicle = new VehicleServiceImpl();
        request = new RegisterVehicleRequest();
        tickets = new Tickets();
        vehicles = new Vehicles();
        viewTicketsRequest = new ViewTicketsRequest();
    }
    @Test
    void testToAddVehicle(){
        request.setVehicleName("Lamborghini");
        request.setOwnerAddress("lagos");
        request.setOwnerEmail("sam@gmail.com");
        request.setVehicleColour("Black");
        request.setVehicleModel("cal");
        request.setOwnerGender("male");
        request.setOwnerName("sam");
        request.setOwnerPhone("080555888");
        request.setProductionYear("2025");
        vehicle.registerVehicle(request);
        assertEquals(1,vehicles.count());
    }



    @Test
    void testToSettleTickets(){
        officer.registerOfficer(officerRequests);
        assertEquals(1,officers.count());

        vehicle.registerVehicle(vehicleRequest);
        assertEquals(1,vehicles.count());

        ticketRequest.setOfficerId(1);
        ticketRequest.setVehicleId(1);
        ticketRequest.setOffence("one way");
        officer.ticketResponse(ticketRequest);
        assertEquals(1,tickets.count());

        settleTicketRequest.setTicketId(1);
        settleTicketRequest.setOfficerId(1);
        settleTicketRequest.setVehicleId(1);
        viewTicketsRequest.setVehicleId(1);
        System.out.println(vehicle.viewTickets(viewTicketsRequest));
        //System.out.println(vehicles.findById(1));
        vehicle.settleTicket(settleTicketRequest);
        viewTicketsRequest.setVehicleId(1);
        System.out.println(vehicle.viewTickets(viewTicketsRequest));


    }

}