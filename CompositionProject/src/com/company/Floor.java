package com.company;




public class Floor {
    private Dimensions dimension;
    private String material;
    private String color;

    public Floor(Dimensions dimension, String material, String color) {
        this.dimension = dimension;
        this.material = material;
        this.color = color;
    }

    public int getArea(){
        return dimension.getArea();
    }

    public Dimensions getDimension() {
        return dimension;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }
}
