package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private final ArrayList<Customer> customers;

    public Branch(String branchName){
        this.name = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public boolean addCustomer(Customer customerToAdd){
        if(findCustomer(customerToAdd.getName()) == -1 )
        {
            customers.add(customerToAdd);
            return true;
        }
        System.out.println("Customer is already existed on " + name + " branch");
        return false;
    }

    public boolean addTransaction ( Customer customer, Double amount ) {
        int position = findCustomer(customer.getName());
        if (position >= 0)
        {
            // customer exists
           customers.get(position).addTransaction(amount);
           return true;
        }
        // customer didn't exist
        System.out.println(customer.getName() +" is not existed on system");
        return false;
    }

    private int findCustomer(String name){
        for (int i = 0 ; i < customers.size() ; i++) {
            if (customers.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public String getName() {
        return name;
    }

    public void printCustomer() {
        for (int i = 0 ; i < customers.size() ; i++){
            System.out.println(i+1 +": " + customers.get(i).getName()+ "\n");
            System.out.println("Transactions: ");
            customers.get(i).getTransactions();
            System.out.println("****");
        }
    }
}
