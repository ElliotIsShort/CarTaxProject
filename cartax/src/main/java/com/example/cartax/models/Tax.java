package com.example.cartax.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Tax implements java.io.Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taxid;
    private String type;
    private double price;

    @OneToMany(fetch = FetchType.LAZY, targetEntity = Registration.class, mappedBy = "taxid")
    private List<Registration> tax;

    public Tax() {}

    public Tax(String type, double price)
    {
        this.type = type;
        this.price = price;
    }

    public int getTaxid() {
        return taxid;
    }

    public void setTaxid(int taxid) {
        this.taxid = taxid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Registration> getTax() {
        return tax;
    }

    public void setTax(List<Registration> tax) { this.tax = tax; }
}
