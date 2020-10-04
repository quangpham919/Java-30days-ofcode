package com.company;

public class HealthyBurger extends Burger {

    public HealthyBurger( Meat meat, Double basePrice, Items items) {
       super("Healthy Burger","Brown Rye Bread Roll",basePrice,items,meat);
       this.getItems().setNumberOfItemAllowed(6);
    }

    @Override
    public double getBasePrice() {
        System.out.println("Base price for "+ this.getName()+ ": ");
        return super.getBasePrice();
    }

    @Override
    public void getFinalPrice() {
        System.out.println("HEALTHY BURGER with :");
        super.getFinalPrice();
    }


}
