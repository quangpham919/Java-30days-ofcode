package com.company;

public class Meat {
    private final double price = 2.0;
    private int number;

    public Meat( int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price * number;
    }
}
