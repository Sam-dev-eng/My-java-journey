package controllers;

import dtos.requests.RegisterVehicleRequest;
import dtos.responses.RegisterVehicleResponse;
import services.VehicleServiceImpl;
import services.servicesInterfaces.VehicleServices;

public class VehicleController {

    public RegisterVehicleResponse registerVehicle(RegisterVehicleRequest request){
        VehicleServices vehicleServices = new VehicleServiceImpl();
        return vehicleServices.registerVehicle(request);
    }



}
