package com.quangpham;

import java.util.Map;
import java.util.Scanner;

public class Main {
    private static StockList stockList = new StockList();
    private static Scanner scanner = new Scanner(System.in);
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
        boolean quit = false;
        while(!quit){
            menu();
            int input = scanner.nextInt();
            switch (input){
                case 1:
                    System.out.println("Enter the name of item: ");
                    String name = scanner.next();
                    scanner.nextLine();
                    System.out.println("Enter the quantity: ");
                    int quantity = scanner.nextInt();

                    if(reserves(name,quantity,customerBasket) != 0){
                        System.out.println("Added "+ name + " to basket.");
                        break;
                    }else {
                        System.out.println("Please try again with valid input.");
                        break;
                    }

                case 2:
                    System.out.println("Enter the name of item: ");
                    name = scanner.next();
                    scanner.nextLine();
                    System.out.println("Enter the quantity: ");
                    quantity = scanner.nextInt();
                    scanner.nextLine();
                    if (unreserved(name,quantity,customerBasket) != 0) {
                        System.out.println("Deleted " + name + " from basket.");
                    }else {
                        System.out.println("Please try again with valid input.");
                    }
                    break;
                case 3:
                    System.out.println("Please check again your basket. Do you want to continue proceed ");
                    System.out.println("1. Yes, I want to continue");
                    System.out.println("2. No, I want to go back");
                    int decision = scanner.nextInt();
                    if (decision == 1) {
                        System.out.println("Checking out...");
                        sellStock(customerBasket);
                        System.out.println("Checking out completed.");
                        break;
                    }
                    if(decision ==2){
                        break;
                    }
                case 4:
                    System.out.println(customerBasket);
                    break;
                case 5:
                    quit= true;
                    break;

            }

        }

    }

    public static void menu(){
        System.out.println("======== W1elcome to quickmart ========");
        System.out.println(stockList);
        System.out.println("=========== Choose one of these options below");
        System.out.println("1. To add item into basket.");
        System.out.println("2. To remove item from basket.");
        System.out.println("3. To check out.");
        System.out.println("4. To see details of your basket.");
        System.out.println("5. To exit.");

    }

    public static int reserves (String name, int quantity, Basket basket){
        StockItem item = stockList.get(name);

        if(item == null) {
            System.out.println("We don't have " + name + " in our stock right now.");
            return 0;
        }

        if(stockList.reverseItem (name,quantity) != 0){
            basket.addToBasket(item,quantity);
            return quantity;
        }
        return 0;
    }

    public static int unreserved(String name, int quantity, Basket basket){
        StockItem item = stockList.get(name);

        if(item == null) {
            System.out.println("You haven't add  " + name + " to your basket.");
            return 0;
        }

        if (stockList.unreserveItem(name,quantity) != 0){
            int result = basket.removeFromBasket(item,quantity);
            if(result != 0) {
                return quantity;
            }
            else {
                return 0;
            }

        }
        return 0;
    }



    public static void sellStock(Basket basket){
       basket.checkout();
    }
}
