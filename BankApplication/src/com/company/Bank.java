package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private final ArrayList<Branch> branches;

    public Bank( String name){
        this.name = name;
        branches = new ArrayList<Branch>();
    }

    public boolean addBranch(Branch branch){
        int position = findBranch(branch.getName());
        if(position == -1){
            branches.add(branch);
            return true;
        }
        System.out.println(branch.getName() + " is existed on our system.");
        return false;

    }

    public boolean addCustomer(Branch branch, Customer customer) {
        int position = findBranch(branch.getName());
        if (position >= 0 ) {
           Branch branchToAdd = branches.get(position);
           return branchToAdd.addCustomer(customer);
        }
        return false;
    }

    public boolean addTransaction(Branch branch, Customer customer, Double amt){
        int position = findBranch(branch.getName());
        if(position >= 0) {
            Branch branchToExecute = branches.get(position);
            return branchToExecute.addTransaction(customer, amt);
        }
        System.out.println(branch.getName() + " is not existed on system");
        return false;
    }

    public void printDetails(){
        System.out.println("List of branches of " + name + " bank : " );
        for (int i = 0 ; i < this.branches.size() ; i++){
            System.out.println(i+1 + ": " + branches.get(i).getName());
        }
        System.out.println("\n");
    }

    public Branch queryBranch (String name){
        int position = findBranch(name);
        if(position >= 0) {
        return branches.get(position);
        }
        else {
            return null;
        }
    }


    private int findBranch(String nameOfBranch) {
        for (int i=0 ; i < branches.size() ; i++){
            if(branches.get(i).getName().equals(nameOfBranch)){
                return i;
            }
        }
        return  -1;
    }

    public String getName() {
        return name;
    }

    public void printCustomer( Branch branch) {
        System.out.println("List of customer of branch: "+ branch.getName());
        branch.printCustomer();
    }
}
