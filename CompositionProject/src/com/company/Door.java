package com.company;

public class Door {
    private String color;
    private String material;
    private Dimensions dimensions;
    private boolean isLocked;

    public Door(String color, String material,Dimensions dimensions) {
        this.color = color;
        this.material = material;
        this.isLocked = true;
        this.dimensions = dimensions;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }


    public Dimensions getDimensions() {
        return dimensions;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void lock(){
       this.isLocked = true;
        System.out.println("Door is locked");
    }

    public void unlock(){
        this.isLocked = false;
        System.out.println("Door is unlocked");
    }

}
