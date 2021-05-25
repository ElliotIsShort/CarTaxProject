package com.example.cartax.DTO;

import java.time.LocalDate;

public class CustomerDTO
{
    private int customerid;
    private String fname;
    private String sname;
    private String address;
    private String postcode;
    private String regplate;
    private String make;
    private String model;

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

    public String getRegplate() { return regplate; }

    public void setRegplate(String regplate) { this.regplate = regplate; }

    public String getMake() { return make; }

    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }
}
