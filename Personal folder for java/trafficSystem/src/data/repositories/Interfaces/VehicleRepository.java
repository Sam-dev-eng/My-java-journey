package data.repositories.Interfaces;

import data.models.Vehicle;

import java.util.HashMap;

public interface VehicleRepository {
    Vehicle save(Vehicle vehicle);
    Vehicle findById(int id);
    HashMap<Integer,Vehicle> findAll();
    void deleteById(int id);
    void deleteAll();
    void delete(Vehicle vehicle);
    long count();
}
