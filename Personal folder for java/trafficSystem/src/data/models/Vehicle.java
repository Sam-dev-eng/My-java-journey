package data.models;

import java.time.Year;
import java.util.ArrayList;

public class Vehicle {
   private int id;
   private String name;
   private String model;
   private String year;
   private String colour;
   private String plateNumber;
   private Owner owner;
   private final ArrayList<Ticket> tickets = new ArrayList<>();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void addTickets(Ticket tickets) {
        this.tickets.add(tickets);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", colour='" + colour + '\'' +
                ", plateNumber='" + plateNumber + '\'' +
                ", owner=" + owner +
                ", tickets=" + tickets +
                '}';
    }
}
