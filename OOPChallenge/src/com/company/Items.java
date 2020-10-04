package com.company;

import jdk.jfr.MemoryAddress;

public class Items {
    private Meat meat;
    private Tomato tomato;
    private Lectuce lectuce;
    private Carrot carrot;
    private Cheese cheese;
    private Chips chips;
    private Drink drink;
    private Double additionalPrice;
    private int numberOfItemAllowed;
    private int trackingNumber = 0;

    public static class Builder {
        //required parameter
        private int numberOfItemAllowed;
        // optional parameter
        private double additionalPrice = 0d;
        private Meat meat = new Meat(0);
        private Tomato tomato = new Tomato(0);
        private Lectuce lectuce = new Lectuce(0);
        private Carrot carrot = new Carrot(0);
        private Cheese cheese = new Cheese(0);
        private Chips chips = new Chips(0);
        private Drink drink = new Drink(0);

        public Builder(int numberOfItemAllowed){
            this.numberOfItemAllowed = numberOfItemAllowed;
        }

        public Builder additionalPrice(int val){
            additionalPrice = val;
            return this;
        }
        public Builder meat(int val){
            System.out.println("Added "+val+" meat when created");
            meat.setNumber(val);
            return this;
        }
        public Builder tomato(int val){
            System.out.println("Added "+val+" tomato when created");
            tomato.setNumber(val);
            return this;
        }
        public Builder lectuce(int val){
            System.out.println("Added "+val+" lectuce when created");
            lectuce.setNumber(val);
            return this;
        }
        public Builder carrot(int val){
            System.out.println("Added "+val+" carrot when created");
            carrot.setNumber(val);
            return this;
        }
        public Builder cheese(int val){
            System.out.println("Added "+val+" cheese when created");
            cheese.setNumber(val);
            return this;
        }
        public Builder chips(int val){
            System.out.println("Added "+val+" chips when created");
            chips.setNumber(val);
            return this;
        }
        public Builder drink(int val){
            System.out.println("Added "+val+" drinks when created");
            drink.setNumber(val);
            return this;
        }
        public Items build(){
            return  new Items(meat,tomato,lectuce,carrot,cheese,chips,drink,numberOfItemAllowed,additionalPrice);
        }
    }

    public Items(Meat meat, Tomato tomato, Lectuce lectuce, Carrot carrot, Cheese cheese, Chips chips, Drink drink, int numberOfItemAllowed, double additionalPrice) {
        this.meat = meat;
        this.tomato = tomato;
        this.lectuce = lectuce;
        this.carrot = carrot;
        this.cheese = cheese;
        this.chips = chips;
        this.drink = drink;
        this.numberOfItemAllowed = numberOfItemAllowed;
        this.additionalPrice = additionalPrice;

    }

    public double getAdditionalPrice(){
        return additionalPrice + meat.getPrice() + tomato.getPrice() + lectuce.getPrice() + carrot.getPrice() + cheese.getPrice() + chips.getPrice() + drink.getPrice();
    }

    public void setMeat(int val) {
        if(trackingNumber < numberOfItemAllowed) {
            trackingNumber += val;
            meat.setNumber(val);
            System.out.println("Added "+ val + " meat: " +meat.getPrice());
        }
        else {
            System.out.println("You are not allowed to add more item!!!");
        }
    }

    public void setTomato(int val) {
        if(trackingNumber < numberOfItemAllowed) {
            trackingNumber += val;
            tomato.setNumber(val);
            System.out.println("Added "+ val + " tomato: " +tomato.getPrice());
        }
        else {
            System.out.println("You are not allowed to add more item!!!");
        }
    }
    public void setLectuce(int val) {
        if(trackingNumber < numberOfItemAllowed) {
            trackingNumber += val;
            lectuce.setNumber(val);
            System.out.println("Added "+ val + " lectuce: " +lectuce.getPrice());

        }
        else {
            System.out.println("You are not allowed to add more item!!!");
        }
    }
    public void setCarrot(int val) {
        if(trackingNumber < numberOfItemAllowed) {
            trackingNumber += val;
            carrot.setNumber(val);
            System.out.println("Added "+ val + " carrot: " +carrot.getPrice());

        }
        else {
            System.out.println("You are not allowed to add more item!!!");
        }
    }

    public void setCheese(int val) {
        if(trackingNumber < numberOfItemAllowed) {
            trackingNumber += val;
            cheese.setNumber(val);
            System.out.println("Added "+ val + " cheese: " +cheese.getPrice());

        }
        else {
            System.out.println("You are not allowed to add more item!!!");
        }
    }

    public void setChips(int val) {
        if(trackingNumber < numberOfItemAllowed) {
            trackingNumber += val;
            chips.setNumber(val);
            System.out.println("Added "+ val + " chips: " +chips.getPrice());

        }
        else {
            System.out.println("You are not allowed to add more item!!!");
        }
    }

    public void setDrink(int val) {
        if(trackingNumber < numberOfItemAllowed) {
            trackingNumber += val;
            drink.setNumber(val);
            System.out.println("Added "+ val + " drinks: " +drink.getPrice());

        }
        else {
            System.out.println("You are not allowed to add more item!!!");
        }
    }

    public void setNumberOfItemAllowed(int numberOfItemAllowed) {
        this.numberOfItemAllowed = numberOfItemAllowed;
    }
}
