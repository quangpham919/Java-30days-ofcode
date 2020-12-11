package com.quangpham;

import java.util.Scanner;

public class X {
    private int x = 0;
    public X(Scanner x) {

        System.out.println("Please enter a number:");
        this.x = x.nextInt();

    }
    public boolean x(int x) {this.x = x; return true;}
    public void x(){
        for (int x=1; x<13 ; x++){
            System.out.println(this.x + " * " + x +" = " + (this.x * x) );
        }
    }

}
