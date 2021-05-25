package com.example.cartax.DTO;

import java.time.LocalDate;

public class RegistrationDTO
{
    private int registrationid;
    private String type;
    private double price;
    private LocalDate expiry;
    private String regplate;

    public int getRegistrationid() { return registrationid; }

    public void setRegistrationid(int registrationid) { this.registrationid = registrationid; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public LocalDate getExpiry() { return expiry; }

    public void setExpiry(LocalDate expiry) { this.expiry = expiry; }

    public void setExpiry(String expiry) {
        setExpiry(LocalDate.parse(expiry));
    }

    public String getRegplate() { return regplate; }

    public void setRegplate(String regplate) { this.regplate = regplate; }
}
