package com.company;

public class Dimensions {
    private int width;
    private int length;
    private int height;

    public Dimensions(int width, int length) {
        this(width,length,0);
    }

    public Dimensions(int width, int length,int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public int getHeight(){
        return height;
    }
    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getArea(){
        return length * width;
    }
}
