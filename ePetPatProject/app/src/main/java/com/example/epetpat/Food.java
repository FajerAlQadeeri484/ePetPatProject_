package com.example.epetpat;

import java.io.Serializable;

public class Food implements Serializable {
    private String foodName;
    private int price;
    private int foodimg;

    public Food(String foodName, int price, int foodimg) {
        this.foodName = foodName;
        this.price = price;
        this.foodimg = foodimg;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFoodimg() {
        return foodimg;
    }

    public void setFoodimg(int foodimg) {
        this.foodimg = foodimg;
    }
}
