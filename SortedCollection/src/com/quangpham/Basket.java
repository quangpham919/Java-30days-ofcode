package com.quangpham;

import java.util.*;

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name){
        this.name = name;
        this.list = new TreeMap<>();
    }

    public void checkout(){
        for(Map.Entry<StockItem,Integer> item : list.entrySet()){
            Integer reservedItemNumb = item.getValue();
            item.getKey().adjustStock(-reservedItemNumb);
            item.getKey().unreserveStock(item.getKey().getReserved());
        }
        this.list.clear();
    }


    public int addToBasket ( StockItem item, int quantity)
    {
        if ((item != null) && (quantity > 0)){
            int itemInBasket= list.getOrDefault(item, 0);
            list.put(item, itemInBasket + quantity);
            return itemInBasket;
        }
        return 0;
    }

    public int removeFromBasket ( StockItem item, int quantity){
        int inBasket = list.getOrDefault(item,0);
        if ((item != null) && (quantity > 0) && (quantity <= inBasket) && (inBasket > 0) ) {
            inBasket = inBasket - quantity;
            if(inBasket > 0) {
                list.put(item, inBasket);
                return quantity;

            }
            else if (inBasket == 0) {
                list.remove(item);
                return quantity;
            }
        }
        return 0;
    }

    public Map<StockItem, Integer> Items(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString(){
        String s = "\nShopping basket "+ name + " contains "+ list.size() +( list.size() == 1 ? " item" : " items") +" \n";
        double totalCost = 0 ;
        for ( Map.Entry<StockItem, Integer> item : list.entrySet()){
            s = s + item.getKey() + ". "+ item.getValue() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + " Total Cost: " + totalCost;
    }
}
