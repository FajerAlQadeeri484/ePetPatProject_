package com.example.epetpat;

import java.io.Serializable;

public class Other implements Serializable {
    private String otherName;
    private int otherprice;
    private int otherimg;

    public Other(String otherName, int otherprice, int otherimg) {
        this.otherName = otherName;
        this.otherprice = otherprice;
        this.otherimg = otherimg;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public int getOtherprice() {
        return otherprice;
    }

    public void setOtherprice(int otherprice) {
        this.otherprice = otherprice;
    }

    public int getOtherimg() {
        return otherimg;
    }

    public void setOtherimg(int otherimg) {
        this.otherimg = otherimg;
    }
}
