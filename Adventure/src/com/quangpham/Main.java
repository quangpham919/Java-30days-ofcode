package com.quangpham;

import java.util.*;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> tempExits = new HashMap<>();
        
        locations.put(0,new Location(0,"You are facing the world tree...",null));

        
        tempExits.put("W",2);
        tempExits.put("N",5);
        tempExits.put("S",4);
        tempExits.put("E",3);
        locations.put(1,new Location(1,"You are at the end of the road before a small brick building", tempExits));
        
       // tempExits.put("Q",0);
        tempExits=new HashMap<>();
        tempExits.put("N",5);
        locations.put(2,new Location(2, "You are at the top of the hill", tempExits));
       // tempExits.put("Q",0);

        tempExits=new HashMap<>();
        tempExits.put("W",1);
        locations.put(3,new Location(3,"You are inside the building, a well house for a small spring", tempExits));
       // tempExits.put("Q",0);

        tempExits=new HashMap<>();
        tempExits.put("N",1);
        tempExits.put("W",2);
        locations.put(4,new Location(4, "You are in a valley beside the stream", tempExits));
        //tempExits.put("Q",0);
        
        tempExits=new HashMap<>();
        tempExits.put("S",1);
        tempExits.put("W",2);
        locations.put(5, new Location(5,"You are in the forest", tempExits));

        // exits.put("Q",0);


        Map<String, String> vocabulary = new HashMap<String,String>();

        vocabulary.put("WEST","W");
        vocabulary.put("NORTH","N");
        vocabulary.put("EAST","E");
        vocabulary.put("SOUTH","S");
        vocabulary.put("QUIT","Q");

        int loc = 1;
        while(true){
            System.out.println("\n"+locations.get(loc).getDescription());


            if(loc==0){
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();

            System.out.println("=============");
            System.out.println("Available exits are ");
            for(String exit: exits.keySet()){
                System.out.print(exit + ", ");
            }
            System.out.println("Choose 1 direction to go:");
            System.out.println("=============");
            System.out.println();
            String direction = scanner.nextLine().toUpperCase();

            if (direction.length()>1){
                String[] words = direction.split(" ");
                direction = validationInput(words,vocabulary);
            }

            if (exits.containsKey(direction)){
                loc = exits.get(direction);
            }
            else{
                System.out.println("You cannot go in that location.");
            }


        }

    }

    public static String validationInput(String[] input, Map<String,String> vocabulary){
        String direction="INVALID";
        for (String value:input){
            direction = vocabulary.getOrDefault(value, "INVALID");

        }
        return direction;
    }


}
