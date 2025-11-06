package data.repositories;

import data.models.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehiclesTest {
    Vehicles vehicles;
    @BeforeEach
    void setUp() {
        vehicles = new Vehicles();
    }
    @Test
    public void testIfListOfMyVehiclesIsEmpty(){
        assertEquals(0, vehicles.count());
    }
    @Test
    public void testTheCountOfTheVehicleWhenAddedOne(){
        Vehicle vehicle = new Vehicle();
        vehicles.save(vehicle);
        assertEquals(1,vehicles.count());
    }
    @Test
    public void testIfTheCountIncreasesWhen_AddedTwoObjects(){
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle();
        vehicles.save(vehicle1);
        vehicles.save(vehicle2);
        assertEquals(2,vehicles.count());
    }
    @Test
    public void testIfICanGetWhatIHaveSaved_WithTheId(){
        Vehicle vehicle = new Vehicle();
        Vehicle initial =  vehicles.save(vehicle);
        Vehicle expected = vehicles.findById(1);
        assertEquals(initial,expected);
    }

}