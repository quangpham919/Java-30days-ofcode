package com.company;


import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Bank bank = new Bank("TD Bank");
    public static void main(String[] args) {
	// write your code here

    boolean quit = false;
    while (!quit){
        Menu();
        int input = scanner.nextInt();
        scanner.nextLine();
        switch (input){
            case 1:
                bank.printDetails();
                printCustomer();
                break;
            case 2:
                addBranch();
                break;
            case 3:
                addCustomer();
                break;
            case 4:
                addTransaction();
                break;
            case 5:
                System.out.println("Quitting...");
                quit = true;
                break;

        }

    }
    scanner.close();
    }

    private static void Menu(){
        System.out.println("Welcome to " + bank.getName() + " application");
        System.out.println("Please choose one of the options below... \n" +
                "           1. Print a list of customer \n" +
                "           2. Add a new branch \n" +
                "           3. Add a new customer \n" +
                "           4. Add a new transaction for a particular customer \n" +
                "           5. Quit application");
    }

   private static void addBranch(){
       System.out.print("Enter a new branch name: ");
       String name = scanner.nextLine();
       Branch branchToAdd = new Branch(name);
       boolean res = bank.addBranch(branchToAdd);
       if(res){
           System.out.println( name + " successfully added to our system.");
       }
       else {
           System.out.println("Failed to add " + name + ".");
       }
   }

    private static void addCustomer(){
        bank.printDetails();
        System.out.print("Choose a branch: ");
        String branchName = scanner.nextLine();
        Branch branchExist = bank.queryBranch(branchName);
        if(branchExist != null) {
            System.out.print("Enter a new customer: ");
            String customerName = scanner.nextLine();
            System.out.println("Enter an initial transaction: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            Customer newCustomer = new Customer(customerName, amount);
            boolean isAdded = bank.addCustomer(branchExist, newCustomer);
            if (isAdded) {
                System.out.println(customerName + "is added to " + branchName + " branch");
            } else {
                System.out.println("Failed to add " + customerName);
            }
        }
        else{
            System.out.println(branchName + "--> " +" branch is not existed in our system");
        }
    }

    private static void addTransaction() {
        bank.printDetails();
        System.out.print("Choose a branch: ");
        String branchName = scanner.nextLine();
        Branch branchExist = bank.queryBranch(branchName);
        if(branchExist != null){
            System.out.print("Enter customer name: ");
            String customerName = scanner.nextLine();
            System.out.println("Enter transaction amount: ");
            double amount = scanner.nextDouble();
            Customer customer = new Customer(customerName,amount);
            boolean res = bank.addTransaction(branchExist,customer,amount);
            if(res) {
                System.out.println(customerName + "--> Succesfully added transaction of " + amount );
            }
            else {
                System.out.println("Failed to Added");
            }
        }
    }
    private static void printCustomer(){
        System.out.print("Choose a branch or press enter to exit: ");
        String branchName = scanner.nextLine();
        if(branchName.equals("")){
            return;
        }
        Branch branchExist = bank.queryBranch(branchName);
        if(branchExist != null){
            bank.printCustomer(branchExist);
        }
    }
}
