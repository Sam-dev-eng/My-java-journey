package services.servicesInterfaces;

import data.repositories.Officers;
import data.repositories.Tickets;
import data.repositories.Vehicles;
import dtos.requests.BookTicketRequests;
import dtos.requests.RegisterOfficerRequests;
import dtos.requests.RegisterVehicleRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.OfficerServiceImpl;
import services.VehicleServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class OfficerServicesTest {
    OfficerServices officer;
    RegisterOfficerRequests officerRequests;
    Officers officers;
    VehicleServices vehicle;
    RegisterVehicleRequest vehicleRequest;
    Vehicles vehicles;
    BookTicketRequests ticketRequest;
    Tickets tickets;

    @BeforeEach
    void setUp() {
       officer = new OfficerServiceImpl();
       officerRequests = new RegisterOfficerRequests();
       officers = new Officers();
       vehicle = new VehicleServiceImpl();
       vehicleRequest = new RegisterVehicleRequest();
       vehicles = new Vehicles();
       ticketRequest = new BookTicketRequests();
       tickets = new Tickets();
    }
    @Test
    void testIfICanAddAnOfficer(){
        officerRequests.setName("Officer sam");
        officerRequests.setRank("A-Rank");
        officer.registerOfficer(officerRequests);
        assertEquals(1,officers.count());
        officers.deleteAll();
    }
    @Test
    void testIfICanAddAnotherOfficer(){
        officerRequests.setName("Officer sam");
        officerRequests.setRank("A-Rank");
        officer.registerOfficer(officerRequests);
        assertEquals(1,officers.count());
        officers.deleteAll();

    }
    @Test
    void testIfOfficerIssueTicketToAVehicle(){
        officer.registerOfficer(officerRequests);
        assertEquals(1,officers.count());

        vehicle.registerVehicle(vehicleRequest);
        assertEquals(1,vehicles.count());

        ticketRequest.setOfficerId(1);
        ticketRequest.setVehicleId(1);
        ticketRequest.setOffence("one way");
        officer.ticketResponse(ticketRequest);
        assertEquals(1,tickets.count());
        System.out.println(vehicles.findById(1));
    }
    @Test
    void testIfOfficerCanSettleTicketToAVehicle(){
        officer.registerOfficer(officerRequests);
        assertEquals(1,officers.count());

        vehicle.registerVehicle(vehicleRequest);
        assertEquals(1,vehicles.count());

        ticketRequest.setOfficerId(1);
        ticketRequest.setVehicleId(1);
        ticketRequest.setOffence("one way");
        officer.ticketResponse(ticketRequest);
        assertEquals(1,tickets.count());

        System.out.println(vehicles.findById(1));
    }

}