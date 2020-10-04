package com.company;

public class Burger {
    private String name;
    private String breadType;
    private Double basePrice;

    private Items items;
    private Meat meat ;

    public Burger( String breadType, Meat meat, Double basePrice) {
       this("Classic Burger", breadType, meat, basePrice);
    }


    public Burger(String name, String breadType, Meat meat, Double basePrice) {
        this(name, breadType, basePrice, new Items.Builder(4).build(),meat);
    }

    public Burger(String name, String breadType, Double basePrice, Items items, Meat meat) {
        this.name = name;
        this.breadType = breadType;
        this.basePrice = basePrice;
        this.items = items;
        this.meat = meat;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public Meat getMeat() {
        return meat;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    public Items getItems() {
        return items;
    }

    public double getBasePrice(){return this.basePrice;}

    public void getFinalPrice() {
        System.out.println(name+" with base price: "+basePrice );
        System.out.println("Addons price: "+items.getAdditionalPrice() );
        System.out.println("Final price: "+ (items.getAdditionalPrice() + basePrice) + "\n");
    }
}
