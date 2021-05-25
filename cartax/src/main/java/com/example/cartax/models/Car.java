package com.example.cartax.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Car implements java.io.Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int carid;
    private String regplate;
    private String make;
    private String model;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerid")
    private Customer customerid;

    @OneToOne(fetch = FetchType.LAZY, targetEntity = Registration.class, mappedBy = "carid")
    private Registration car;

    public Car() {}

    public Car(int carid, String regplate, String make, String model, Customer customerid)
    {
        this.regplate = regplate;
        this.make = make;
        this.model = model;
        this.customerid = customerid;
    }

    public int getCarid() {
        return carid;
    }

    public void setCarid(int carid) {
        this.carid = carid;
    }

    public String getRegplate() {
        return regplate;
    }

    public void setRegplate(String regplate) {
        this.regplate = regplate;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Customer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Customer customerid) {
        this.customerid = customerid;
    }

    public Registration getCar() { return car; }

    public void setCar(Registration car) { this.car = car; }
}
