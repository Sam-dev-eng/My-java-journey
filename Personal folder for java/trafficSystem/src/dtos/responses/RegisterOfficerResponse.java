package dtos.responses;

public class RegisterOfficerResponse {
    String name;
    String rank;
    int id;

    @Override
    public String toString() {
        return "RegisterOfficerResponse{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                ", ID='" + id +'\''+
                '}';
    }
    public int get(){
        return id;
    }
    public void setId(int id ){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
