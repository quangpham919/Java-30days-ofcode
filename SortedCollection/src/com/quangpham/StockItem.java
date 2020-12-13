package com.quangpham;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityStock ;
    private int reserved;


    public StockItem(String name, double price){
        this(name,price,0);
    }

    public StockItem(String name, double price, int quantityStock){
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
        this.reserved = 0;
    }

    public int getReserved() {
        return reserved;
    }

    public void reserveStock(int reservedQuantity ){
       if (reservedQuantity <= this.quantityStock && reservedQuantity > 0) {
           this.reserved = reservedQuantity;
       }
    }

    public void unreserveStock (int reservedQuantity) {
        if ( reservedQuantity <= this.reserved && reservedQuantity >= 0) {
            this.reserved -= reservedQuantity;
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void setPrice(double price){
        if(price >= 0.0) {
            this.price += price;
        }
    }

    public void adjustStock(int quantity){
        int newQuantity = quantity + this.quantityStock;
        if (newQuantity >=0){
            this.quantityStock = newQuantity;
        }
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 41;
    }

    @Override
    public boolean equals(Object obj) {
        if ( this == obj){
            return true;
        }

        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }

        StockItem theObj = (StockItem) obj;

       return this.name.equals(theObj.getName());
    }

    @Override
    public int compareTo(StockItem o) {

        if (this == o ){
            return 0;
        }
        if(o!=null) {
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return "Name: "+ this.name + " - price: "+ this.price;
    }
}
