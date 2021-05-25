package com.example.cartax.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Registration implements java.io.Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int registrationid;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "carid")
    private Car carid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "taxid")
    private Tax taxid;

    private LocalDate expiry;

    public Registration() {}

    public Registration(Car carid, Tax taxid, LocalDate expiry)
    {
        this.carid = carid;
        this.taxid = taxid;
        this.expiry = expiry;
    }

    public int getRegistrationid() {
        return registrationid;
    }

    public void setRegistrationid(int registrationid) {
        this.registrationid = registrationid;
    }

    public Car getCarid() {
        return carid;
    }

    public void setCarid(Car carid) {
        this.carid = carid;
    }

    public Tax getTaxid() {
        return taxid;
    }

    public void setTaxid(Tax taxid) {
        this.taxid = taxid;
    }

    public LocalDate getExpiry() {
        return expiry;
    }

    public void setExpiry(LocalDate expiry) {
        this.expiry = expiry;
    }

    public void setExpiry(String expiry) {
        setExpiry(LocalDate.parse(expiry));
    }
}
