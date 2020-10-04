package com.company;

public class DeluxeBurger extends Burger {

    public DeluxeBurger (String breadType, Meat meat, Double basePrice){
        this("Deluxe Burger",breadType, meat, basePrice);
    }
    public DeluxeBurger(String name, String breadType, Meat meat, Double basePrice) {
        super(name,breadType,basePrice,new Items.Builder(0).drink(1).chips(1).build(),meat);
    }

    @Override
    public double getBasePrice() {
        System.out.println("Base price for "+ this.getName()+ ": ");
        System.out.println("Addons chips and drinks as combo: ");
        return super.getBasePrice();
    }

    @Override
    public void getFinalPrice() {
        System.out.println("___DELUXE BURGER with chips and drinks as addons___");
        super.getFinalPrice();
    }
}
