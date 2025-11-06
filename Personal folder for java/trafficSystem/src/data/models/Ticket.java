package data.models;

import java.time.LocalDateTime;

public class Ticket {
    int id;
    Vehicle vehicle;
    Ofence ofence;
    boolean hasPaid;
    Officer issuer;
    LocalDateTime dateOfBook;
    LocalDateTime dateOfPayment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Ofence getOfence() {
        return ofence;
    }

    public void setOfence(Ofence ofence) {
        this.ofence = ofence;
    }

    public boolean isHasPaid() {
        return hasPaid;
    }

    public void setHasPaid(boolean hasPaid) {
        this.hasPaid = hasPaid;
    }

    public Officer getIssuer() {
        return issuer;
    }

    public void setIssuer(Officer issuer) {
        this.issuer = issuer;
    }

    public LocalDateTime getDateOfBook() {
        return dateOfBook;
    }

    public void setDateOfBook(LocalDateTime dateOfBook) {
        this.dateOfBook = dateOfBook;
    }

    public LocalDateTime getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(LocalDateTime dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }
}
