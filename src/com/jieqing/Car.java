package com.jieqing;

public class Car {

    private String make;
    private int year;
    private int price;

    // Constructor
    public Car() {
        this.make = "";
        this.year = 0;
        this.price = 0;
    }

    public Car(String make, int year, int price) {
        this.make = make;
        this.year = year;
        this.price = price;
    }

    // Getter and Setter
    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public void setMake(String m) {
        make = m;
    }

    public void setYear(int y) {
        year = y;
    }

    public void setPrice(int p) {
        price = p;
    }

    public String toString() {
        return String.format("Make = %-8s Year = %-6d Price = %6d", make, year, price);
    }
}
