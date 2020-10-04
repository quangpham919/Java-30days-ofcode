package com.company;

import simple.solution.Addition;
import simple.solution.Burger;
import simple.solution.DeluxeBurger;
import simple.solution.HealthyBurger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Burger classic = new Burger("classic burger","brown",10.5,"chicken");
        classic.getDetails();
        Addition lectuce = new Addition("Lectuce", 1.5);
        Addition tomato = new Addition("Tomato", 1.5);
        classic.setAddition1(lectuce);
        classic.setAddition2(tomato);
        classic.getDetails();

        HealthyBurger healthyBurger = new HealthyBurger(10.5,"Sausage");
        healthyBurger.setAddition5(new Addition("Lectuce",10.0));
        healthyBurger.getDetails();

        DeluxeBurger deluxe = new DeluxeBurger("white",20d,"Sausage");
        deluxe.setAddition1(new Addition("should not be added",20d));
        deluxe.getDetails();

    }
}
