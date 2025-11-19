package services.servicesInterfaces;

import data.models.Ticket;
import dtos.requests.RegisterVehicleRequest;

import dtos.responses.RegisterVehicleResponse;




public interface VehicleServices {
    RegisterVehicleResponse registerVehicle(RegisterVehicleRequest request);

}
