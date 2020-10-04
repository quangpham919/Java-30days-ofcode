package com.company;

public class FlourPacker {
    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int totalOfKilos = bigCount * 5 + smallCount;

        if (goal <= totalOfKilos ) {
            if (smallCount <= 0 && bigCount*5 > goal ){
                return false;
            }
            else if( smallCount > 0 && bigCount * 5 > goal){
                int remainKilo =goal - (goal / 5 * 5);
                if(remainKilo <= smallCount) {
                    return true;
                }
            }
            else {
                return true;
            }
        }

        return false; 
    }
}
