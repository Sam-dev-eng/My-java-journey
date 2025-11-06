package data.models;

public enum Ofence {
    ONEWAY("one way","20_000"),
    DRUNKDRIVING("Drinking while driving", "25_000"),
    NOSEATBELT("No seat belt","2_000"),
    OVERSPEEDING("over speeding","50_000");

    private final String ofence;
    private final String payment;
    Ofence(String ofence,String payment){
       this.ofence = ofence;
       this.payment = payment;
    }
    public String getOfence(){
        return ofence+" "+payment;
    }
}
