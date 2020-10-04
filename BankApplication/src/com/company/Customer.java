package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount){
        this.name = name;
        this.transactions = new ArrayList<>();
        this.addTransaction(initialAmount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getTransactions() {
        System.out.println(transactions.toString());
    }

    public boolean addTransaction(double amount) {
        return this.transactions.add(amount);
    }
}
