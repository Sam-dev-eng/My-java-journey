package services;
import data.models.*;
import data.repositories.*;
import dtos.requests.*;
import dtos.responses.*;
import services.servicesInterfaces.VehicleServices;



import static utils.Mapper.map;

public class VehicleServiceImpl implements VehicleServices {
    Vehicles vehicles = new Vehicles();

    @Override
    public RegisterVehicleResponse registerVehicle(RegisterVehicleRequest request) {
        Vehicle vehicle = map(request);
        vehicles.save(vehicle);
        return map(vehicle);
    }

}