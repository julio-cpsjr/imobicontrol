package br.com.imobicontrol.myproperty.model;


import jakarta.persistence.*;

@Entity
public class MyProperty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String address;
    private double metric;
    private String instalationWater;
    private String instalationLight;
    private String fireDepartmentPermit;
    private String registryOfficeRegistration;

    @Enumerated
    private StatusProperty status;
    @Enumerated
    private StyleProperty style;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMetric() {
        return metric;
    }

    public void setMetric(double metric) {
        this.metric = metric;
    }

    public String getInstalationWater() {
        return instalationWater;
    }

    public void setInstalationWater(String instalationWater) {
        this.instalationWater = instalationWater;
    }

    public String getInstalationLight() {
        return instalationLight;
    }

    public void setInstalationLight(String instalationLight) {
        this.instalationLight = instalationLight;
    }

    public String getFireDepartmentPermit() {
        return fireDepartmentPermit;
    }

    public void setFireDepartmentPermit(String fireDepartmentPermit) {
        this.fireDepartmentPermit = fireDepartmentPermit;
    }

    public String getRegistryOfficeRegistration() {
        return registryOfficeRegistration;
    }

    public void setRegistryOfficeRegistration(String registryOfficeRegistration) {
        this.registryOfficeRegistration = registryOfficeRegistration;
    }

    public StatusProperty getStatus() {
        return status;
    }

    public void setStatus(StatusProperty status) {
        this.status = status;
    }

    public StyleProperty getStyle() {
        return style;
    }

    public void setStyle(StyleProperty style) {
        this.style = style;
    }
}
