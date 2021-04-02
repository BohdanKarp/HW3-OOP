package com.BohdanKarp.Task2;

public class Product implements Buyable{
    private static int quantity;
    protected AgeRestriction ageRestriction;
    protected String name;
    protected Double price;

    public Product(String name, Double price,AgeRestriction ageRestriction) {
        this.name = name;
        this.price = price;
        this.ageRestriction=ageRestriction;
    }

    public static int getQuantity() {
        return quantity;
    }

    public static void setQuantity(int quantity) {
        Product.quantity = quantity;
    }

    public AgeRestriction getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(AgeRestriction ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
}
