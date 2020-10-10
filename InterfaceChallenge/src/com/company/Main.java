package com.company;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player player1 = new Player("Quang", "Sword",50);
        System.out.println(player1);
        saveObject(player1);

        player1.setWeapon("Arrow");
        player1.setHitpoint(8);
        System.out.println(player1);
        saveObject(player1);
        loadObject(player1);
        System.out.println(player1);
    }


    public static void saveObject(ISaveable object){
        for (int i = 0 ; i < object.write().size() ; i++){
            System.out.println("Saving " + object.write().get(i) + " to storage device");
            
        }
    }

    public static void loadObject (ISaveable object) {
        ArrayList<String> value = readValues();
        object.read(value);

    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1. Enter a String\n" +
                "0. Quit");

        while (!quit){
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
}
