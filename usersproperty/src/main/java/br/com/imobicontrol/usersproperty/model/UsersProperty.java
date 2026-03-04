package br.com.imobicontrol.usersproperty.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class UsersProperty {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY )
    private long id;

    private String name;
    private String address;
    private String phone;
    private String email;

    private String nameGuarantor;
    private String phoneGuarantor;
    private String emailGuarantor;


    @Enumerated
    private StatusUsers status;


    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNameGuarantor() {
        return nameGuarantor;
    }

    public void setNameGuarantor(String nameGuarantor) {
        this.nameGuarantor = nameGuarantor;
    }

    public String getPhoneGuarantor() {
        return phoneGuarantor;
    }

    public void setPhoneGuarantor(String phoneGuarantor) {
        this.phoneGuarantor = phoneGuarantor;
    }

    public String getEmailGuarantor() {
        return emailGuarantor;
    }

    public void setEmailGuarantor(String emailGuarantor) {
        this.emailGuarantor = emailGuarantor;
    }

    public StatusUsers getStatus() {
        return status;
    }

    public void setStatus(StatusUsers status) {
        this.status = status;
    }
}
