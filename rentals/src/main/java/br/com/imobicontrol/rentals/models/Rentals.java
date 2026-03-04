package br.com.imobicontrol.rentals.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Rentals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nameProperty;
    private String nameUsers;
    private String dateStart;
    private String dateEnd;
    private double price;
    private double igpm;
    private double freeNegotiation;
    private double total;
    private double cleaningSupplies;
    private double iptu;
    private double garbageFee;
    private String pestControl;
    private double fees;
    private double discount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameProperty() {
        return nameProperty;
    }

    public void setNameProperty(String nameProperty) {
        this.nameProperty = nameProperty;
    }

    public String getNameUsers() {
        return nameUsers;
    }

    public void setNameUsers(String nameUsers) {
        this.nameUsers = nameUsers;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getIgpm() {
        return igpm;
    }

    public void setIgpm(double igpm) {
        this.igpm = igpm;
    }

    public double getFreeNegotiation() {
        return freeNegotiation;
    }

    public void setFreeNegotiation(double freeNegotiation) {
        this.freeNegotiation = freeNegotiation;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getCleaningSupplies() {
        return cleaningSupplies;
    }

    public void setCleaningSupplies(double cleaningSupplies) {
        this.cleaningSupplies = cleaningSupplies;
    }

    public double getIptu() {
        return iptu;
    }

    public void setIptu(double iptu) {
        this.iptu = iptu;
    }

    public double getGarbageFee() {
        return garbageFee;
    }

    public void setGarbageFee(double garbageFee) {
        this.garbageFee = garbageFee;
    }

    public String getPestControl() {
        return pestControl;
    }

    public void setPestControl(String pestControl) {
        this.pestControl = pestControl;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
