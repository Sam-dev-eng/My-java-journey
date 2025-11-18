package data.repositories;
import data.models.Vehicle;
import data.repositories.Interfaces.VehicleRepository;
import exceptions.VehicleExceptions.DeleteVehicleException;
import exceptions.VehicleExceptions.EmptyVehiclesException;
import exceptions.VehicleExceptions.VehicleIdNotFoundException;

import java.util.HashMap;


public class Vehicles implements VehicleRepository {
    private static final HashMap<Integer,Vehicle> vehicles = new HashMap<>();
    private static long count = 0;

    @Override
    public Vehicle save(Vehicle vehicle) {
        if(vehicles.containsValue(vehicle))return updateVehicle(vehicle);
        int id = generateId();
        vehicle.setId(id);
        vehicles.put(id,vehicle);
        count++;
        return vehicle;
    }
    private Vehicle updateVehicle(Vehicle vehicle){
        int id = vehicle.getId();
        vehicles.put(id,vehicle);
        return vehicle;
    }
    private int generateId(){
        return (int)count + 1;
    }

    @Override
    public Vehicle findById(int id) {
        validateId(id);
        return vehicles.get(id);
    }
    private void validateId(int id){
        if (!vehicles.containsKey(id)){
        throw new VehicleIdNotFoundException("Vehicle id not found");
        }
    }

    @Override
    public HashMap<Integer, Vehicle> findAll() {
        validateList();
        return vehicles;
    }
    private void validateList(){
        if(vehicles.isEmpty()) throw new EmptyVehiclesException("vehicle list is empty");
    }

    @Override
    public void deleteById(int id) {
        vehicles.remove(id);
        count--;
    }

    @Override
    public void deleteAll() {
        vehicles.clear();
        count = 0;
    }

    @Override
    public void delete(Vehicle vehicle) {
        if(!vehicles.containsValue(vehicle)){
            throw new DeleteVehicleException("The vehicle does not exist");
        }
        int id = vehicle.getId();
        vehicles.remove(id);
        count--;
    }

    @Override
    public long count() {
        return count;
    }
}
