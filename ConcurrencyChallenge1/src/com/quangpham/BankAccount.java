package com.quangpham;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance;
    private String accountNumber;
    private Lock lock;

    public BankAccount(String accountNumber, double balance){
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.lock = new ReentrantLock();
    }

    public double getBalance(){return balance;}
    public void  deposit(double amount ){
        lock.lock();
        try{
            this.balance += amount;
            System.out.println(balance);
        }
        finally {
            lock.unlock();
        }
    }

    public void withdraw(double amount) {
        lock.lock();
        try{
            this.balance -= amount;
            System.out.println(balance);
        }
        finally {
            lock.unlock();
        }
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void printAccountNumber(){
        System.out.println("Account number = "+ accountNumber );
    }
}
