package dtos.responses;



public class SettleTicketResponse {
    private String vehicleName;
    private int id;
    private String ofence;
    private String hasPaid;
    private String  issuer;
    private String paymentOfficer;
    private String dateOfBook;
    private String dateOfPayment;


    @Override
    public String toString() {
        return "BookTicketResponse{" +
                "vehicleName='" + vehicleName + '\'' +
                ", id=" + id +
                ", offence=" + ofence +
                ", hasPaid='" + hasPaid + '\'' +
                ", issuer='" + issuer + '\'' +
                ", paymentOfficer='" + paymentOfficer + '\'' +
                ", dateOfBook='" + dateOfBook + '\'' +
                ", dateOfPayment='" + dateOfPayment + '\'' +
                '}';
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

    public String getOfence() {
        return ofence;
    }

    public void setOfence(String ofence) {
        this.ofence = ofence;
    }

    public String getHasPaid() {
        return hasPaid;
    }

    public void setHasPaid(String hasPaid) {
        this.hasPaid = hasPaid;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getPaymentOfficer() {
        return paymentOfficer;
    }

    public void setPaymentOfficer(String paymentOfficer) {
        this.paymentOfficer = paymentOfficer;
    }

    public String getDateOfBook() {
        return dateOfBook;
    }

    public void setDateOfBook(String dateOfBook) {
        this.dateOfBook = dateOfBook;
    }

    public String getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(String dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

}
