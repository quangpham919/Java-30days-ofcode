package com.quangpham;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BankAccount account = new BankAccount("12345-789",1000.00);

        Thread john = new Thread(() -> {
            account.deposit(300d);
            account.withdraw(50d);

        });

        Thread cena = new Thread(() -> {
            account.deposit(203.75);
            account.withdraw(100d);

        });

        john.start();
        cena.start();
        System.out.println(account.getBalance());
    }
}
