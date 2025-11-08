package data.repositories;
import data.models.Vehicle;
import java.util.HashMap;


public class Vehicles implements VehicleRepository{
//    List<Vehicle> vehicles = new ArrayList<>();
    private static final HashMap<Integer,Vehicle> vehicles = new HashMap<>();
    private long count = 0;

    @Override
    public Vehicle save(Vehicle vehicle) {
        vehicle.setId(id());
        vehicles.put(id(),vehicle);
        count++;
        return vehicle;
    }
    private int id(){
        return (int)count + 1;
    }

    @Override
    public Vehicle findById(int id) {
        if (!vehicles.containsKey(id)){
            return null;
        }
        return vehicles.get(id);
    }

    @Override
    public HashMap<Integer, Vehicle> findAll() {
        if(vehicles.isEmpty()) return null;
        return vehicles;
    }

    @Override
    public void deleteById(int id) {
        vehicles.remove(id);
        count--;
    }

    @Override
    public void deleteAll() {
        vehicles.clear();
    }

    @Override
    public void delete(Vehicle vehicle) {
        if(!vehicles.containsValue(vehicle)){
            throw new RuntimeException("The vehicle does not exist");
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
