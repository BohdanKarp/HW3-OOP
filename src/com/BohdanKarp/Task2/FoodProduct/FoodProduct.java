package com.BohdanKarp.Task2.FoodProduct;

import com.BohdanKarp.Task2.AgeRestriction;
import com.BohdanKarp.Task2.Expirable;
import com.BohdanKarp.Task2.Product;

import java.util.Date;

public class FoodProduct extends Product implements Expirable {

    public FoodProduct(String name, Double price, AgeRestriction ageRestriction) {
        super(name, price, ageRestriction);
    }

    @Override
    public Date getExpirationDate() {
        return null;
    }

    @Override
    public Double getPrice() {
        if (getExpirationDate().getDate() < new Date().getDay()){
            return price*0.7;
        }
        else
        return price;
    }
    @Override
    public String toString() {
        return "Product: " + getName() + "\nPrice: " + getPrice()
                + "\nShelf life: "
                + "\nGuantity: " + getQuantity() + "\nProduct's type: " + getAgeRestriction().name();
    }
}