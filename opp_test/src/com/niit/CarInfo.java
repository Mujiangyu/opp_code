package com.niit;

public class CarInfo {

    private String brand;
    private int price;
    private String colour;

    public CarInfo() {
    }

    public CarInfo(String brand, int price, String colour) {
        this.brand = brand;
        this.price = price;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
