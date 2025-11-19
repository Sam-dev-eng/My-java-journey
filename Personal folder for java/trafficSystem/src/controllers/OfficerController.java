package controllers;

import dtos.requests.RegisterOfficerRequests;
import dtos.responses.RegisterOfficerResponse;
import services.OfficerServiceImpl;
import services.servicesInterfaces.OfficerServices;

public class OfficerController {

    public RegisterOfficerResponse registerOfficer(RegisterOfficerRequests requests){
        OfficerServices officerServices = new OfficerServiceImpl();
        return officerServices.registerOfficer(requests);
    }
}
