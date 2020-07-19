package com.example.epetpat;

import java.io.Serializable;

public class CartClass implements Serializable {
    private String NameInCart;
    private int priceInCart;


    public CartClass(String nameInCart, int priceInCart) {
        NameInCart = nameInCart;
        this.priceInCart = priceInCart;
    }

    public String getNameInCart() {
        return NameInCart;
    }

    public void setNameInCart(String nameInCart) {
        NameInCart = nameInCart;
    }

    public int getPriceInCart() {
        return priceInCart;
    }

    public void setPriceInCart(int priceInCart) {
        this.priceInCart = priceInCart;
    }
}
