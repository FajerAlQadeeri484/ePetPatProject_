package com.example.epetpat;

import java.io.Serializable;

public class Litter implements Serializable {
    private String litterName;
    private int litterprice;
    private int litterimg;

    public Litter(String litterName, int litterprice, int litterimg) {
        this.litterName = litterName;
        this.litterprice = litterprice;
        this.litterimg = litterimg;
    }

    public String getLitterName() {
        return litterName;
    }

    public void setLitterName(String litterName) {
        this.litterName = litterName;
    }

    public int getLitterprice() {
        return litterprice;
    }

    public void setLitterprice(int litterprice) {
        this.litterprice = litterprice;
    }

    public int getLitterimg() {
        return litterimg;
    }

    public void setLitterimg(int litterimg) {
        this.litterimg = litterimg;
    }
}
