package data.repositories.Interfaces;

import data.models.Vehicle;
import data.repositories.Vehicles;
import exceptions.VehicleExceptions.EmptyVehiclesException;
import exceptions.VehicleExceptions.VehicleIdNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleRepositoryTest {
    VehicleRepository vehicles;
    @BeforeEach
    void setUp() {
        vehicles = new Vehicles();
        vehicles.deleteAll();
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
    @Test
    public void testToAddTwoItemsAndFindTheTwo(){
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle();
        Vehicle initial1 = vehicles.save(vehicle1);
        Vehicle expected1 = vehicles.findById(1);
        assertEquals(initial1,expected1);
        Vehicle initial2 = vehicles.save(vehicle2);
        Vehicle expected2 = vehicles.findById(2);
        assertEquals(initial2,expected2);

    }
    @Test
    public void testToAddInNoOderAndFindTheTwo(){
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle();
        Vehicle initial1 = vehicles.save(vehicle1);
        Vehicle initial2 = vehicles.save(vehicle2);
        Vehicle expected2 = vehicles.findById(2);
        Vehicle expected1 = vehicles.findById(1);
        assertEquals(initial1,expected1);
        assertEquals(initial2,expected2);

    }
    @Test
    public void testToDeleteItemWithTheId(){
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle();
        Vehicle initial1 = vehicles.save(vehicle1);
        Vehicle initial2 = vehicles.save(vehicle2);
        Vehicle expected2 = vehicles.findById(2);
        Vehicle expected1 = vehicles.findById(1);
        assertEquals(initial1,expected1);
        assertEquals(initial2,expected2);
        vehicles.deleteById(2);
        assertThrows(VehicleIdNotFoundException.class,()->vehicles.findById(2));
        vehicles.deleteById(1);
        assertThrows(VehicleIdNotFoundException.class,()->vehicles.findById(1));

    }
    @Test
    public void testToDeleteBy_vehicleObject(){
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle();
        Vehicle initial1 = vehicles.save(vehicle1);
        Vehicle initial2 = vehicles.save(vehicle2);
        Vehicle expected2 = vehicles.findById(2);
        Vehicle expected1 = vehicles.findById(1);
        assertEquals(initial1,expected1);
        assertEquals(initial2,expected2);
        vehicles.delete(vehicle1);
        assertThrows(VehicleIdNotFoundException.class,()->vehicles.findById(1));
    }

    @Test
    public void testToDeleteEverythingInTheListOfVehicles(){
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle();
        Vehicle initial1 = vehicles.save(vehicle1);
        Vehicle initial2 = vehicles.save(vehicle2);
        Vehicle expected2 = vehicles.findById(2);
        Vehicle expected1 = vehicles.findById(1);
        assertEquals(initial1,expected1);
        assertEquals(initial2,expected2);
        vehicles.deleteAll();
        assertThrows(EmptyVehiclesException.class,()-> vehicles.findAll());
    }



}