package com.quangpham;

public class MainChallenge {
    private static StockList stockList = new StockList();
    public static void main(String[] args) {
        StockItem temp = new StockItem("apple", 0.40, 6);
        stockList.addStock(temp);

        temp = new StockItem("bread", 0.86, 10);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.8, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 20);
        stockList.addStock(temp);

        Basket customerBasket = new Basket("A new basket");
        customerBasket.addToBasket(temp,15);
        System.out.println(customerBasket.removeFromBasket(temp, 14));
        System.out.println(customerBasket.removeFromBasket(temp, 14));
        System.out.println(customerBasket);
    }
}
