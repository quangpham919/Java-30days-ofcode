package com.quangpham;

import java.util.*;


public class MapPractice {
    public static void main(String[] args) {
       Map<String, String> langues = new HashMap<>();
       langues.put("Java", "A high-level compiled, object-oriented, platform independent language ");
       langues.put("Python", "An interpreted, object-oriented, high-level programming language with dynamic semantics");
       langues.put("Algol", "An algorithmic language");
       langues.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
       langues.put("Lips", "Therein lies madness");

       if(langues.containsKey("Java")){
           System.out.println("Key is already existed");
       }
       else{
           langues.put("Java","This course is about Java");
       }

        System.out.println("==========");
        for (String key : langues.keySet()){
            System.out.println(langues.get(key));
        }
    }
}
