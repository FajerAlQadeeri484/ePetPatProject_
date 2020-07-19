package com.example.epetpat;

import java.io.Serializable;

public class Toys implements Serializable {
    private String toyName;
    private int toyprice;
    private int toyimg;

    public Toys(String toyName, int toyprice, int toyimg) {
        this.toyName = toyName;
        this.toyprice = toyprice;
        this.toyimg = toyimg;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public int getToyprice() {
        return toyprice;
    }

    public void setToyprice(int toyprice) {
        this.toyprice = toyprice;
    }

    public int getToyimg() {
        return toyimg;
    }

    public void setToyimg(int toyimg) {
        this.toyimg = toyimg;
    }
}
