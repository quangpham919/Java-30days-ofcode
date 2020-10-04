package com.company;

public class Wall {
    private String material;
    private Dimensions dimensions;

    public Wall(String material, Dimensions dimensions) {
        this.material = material;
        this.dimensions = dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
