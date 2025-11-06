package data.repositories;

import data.models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Vehicles implements VehicleRepository{
    List<Vehicle> vehicles = new ArrayList<>();
    private long count = 0;
    @Override
    public Vehicle save(Vehicle vehicle) {
        vehicles.add(vehicle);
        count++;
        return vehicle;
    }

    @Override
    public Vehicle findById(int id) {
        return null;
    }

    @Override
    public List<Vehicle> findAll() {
        return List.of();
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void delete(Vehicle vehicle) {

    }

    @Override
    public long count() {
        return count;
    }
}
