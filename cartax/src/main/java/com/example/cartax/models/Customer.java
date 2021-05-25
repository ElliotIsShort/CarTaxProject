package com.example.cartax.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Customer implements java.io.Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerid;
    private String fname;
    private String sname;
    private String address;
    private String postcode;

    @OneToMany(fetch = FetchType.LAZY, targetEntity = Car.class, mappedBy = "customerid")
    private List<Car> customer;

    public Customer() {}

    public Customer(int carid, String fname, String sname, String address, String postcode)
    {
        this.fname = fname;
        this.sname = sname;
        this.address = address;
        this.postcode = postcode;
    }

    public int getCustomerid() { return customerid; }

    public void setCustomerid(int customerid) { this.customerid = customerid; }

    public String getFname() { return fname; }

    public void setFname(String fname) { this.fname = fname; }

    public String getSname() { return sname; }

    public void setSname(String sname) { this.sname = sname; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public String getPostcode() { return postcode; }

    public void setPostcode(String postcode) { this.postcode = postcode; }

    public List<Car> getCustomer() { return customer; }

    public void setCustomer(List<Car> customer) { this.customer = customer; }
}
