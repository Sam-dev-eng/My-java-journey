package dtos.responses;

public class RegisterVehicleResponse {
    private int id;
    private String name;
    private String model;
    private String year;
    private String colour;
    private String plateNumber;
    private String owner;


    @Override
    public String toString() {
        return "RegisterVehicleResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", colour='" + colour + '\'' +
                ", plateNumber='" + plateNumber + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
