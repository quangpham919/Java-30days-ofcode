package com.quangpham;

import java.util.*;

public class StockList {
    private final Map<String, StockItem> list ;

    public StockList(){
        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem item){
        if(item!=null){
            StockItem inStock = list.getOrDefault(item.getName(),item);
            // if there are already stocks on this item, adjust the quantity.
            if(inStock!=item){
                item.adjustStock(inStock.getQuantityStock());
            }

            list.put(item.getName(), item);
            return item.getQuantityStock();
        }
        return 0;
    }

    public int reverseItem(String name, int quantity){
        StockItem inStock = list.getOrDefault(name, null);
        if(inStock != null && quantity <= inStock.getQuantityStock() && quantity > 0){
            inStock.reserveStock(quantity);
            return quantity;
        }
        return  0;
    }

    public int unreserveItem(String name, int quantity){
        StockItem inStock = list.getOrDefault(name, null);
        if(inStock != null && quantity <= inStock.getQuantityStock() && quantity > 0){
            inStock.unreserveStock(quantity);
            return quantity;
        }
        return  0;
    }


    public int sellStock(String item, int quantity){
        StockItem inStock = list.getOrDefault(item, null);
        if(inStock!=null && inStock.getQuantityStock() >= quantity && quantity >0){
            inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;

    }

    public StockItem get(String name){
        return list.get(name);
    }

    public Map<String, StockItem> Items(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "Stock List \n";
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> itemEntry : list.entrySet()) {
            StockItem item = itemEntry.getValue();
            double itemValue = item.getPrice() * item.getQuantityStock();
            totalCost += itemValue;
            s = s + item + ". There are " + item.getQuantityStock()  + " in stock. Value of items: ";
            s = s + String.format("%.2f", itemValue) + "\n";
        }
        return s;
    }
}
