package com.example.epetpat;

import java.io.Serializable;

public class cats implements Serializable {
    private int image;
    private String name;
    private String information;

    public cats(int image, String name, String information) {
        this.image = image;
        this.name = name;
        this.information = information;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}

