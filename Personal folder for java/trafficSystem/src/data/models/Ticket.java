package data.models;

import java.time.LocalDateTime;

public class Ticket {
    int id;
    String vehicleName;
    Ofence ofence;
    boolean hasPaid;
    Officer issuer;
    Officer paymentOfficer;
    LocalDateTime dateOfBook;
    LocalDateTime dateOfPayment;

    public Officer getPaymentOfficer() {
        return paymentOfficer;
    }

    public void setPaymentOfficer(Officer paymentOfficer) {
        this.paymentOfficer = paymentOfficer;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
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

    public void setDateOfBook() {
        this.dateOfBook = LocalDateTime.now();
    }

    public LocalDateTime getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment() {
        this.dateOfPayment = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", vehicle=" + vehicleName +
                ", offence=" + ofence +
                ", hasPaid=" + hasPaid +
                ", issuer=" + issuer +
                ", dateOfBook=" + dateOfBook +
                ", dateOfPayment=" + dateOfPayment +
                ", Payment Officer="+ paymentOfficer+
                '}';
    }
}
