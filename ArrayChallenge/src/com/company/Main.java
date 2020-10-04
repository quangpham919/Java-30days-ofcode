package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(FlourPacker.canPack(5,3,24));
    }

    public static void calculateNumber(){
        int sum = 0;
        int count =0;
        for (int i=1; i<=1000; i++){
            if(i % 3 ==0 && i % 5 == 0){
                sum += i;
                count += 1;
                System.out.println("Number that meet requirement: "+i);
                if(count == 5 ){
                    System.out.println("Sum of 5 number divisable for 3 and 5: "+sum);
                    break;
                }
            }
        }
    }

    public static boolean isOdd(int number){
        if(number < 0 ) {
            return false;
        }
        if(number % 2 == 0){
            return false;
        }
        return true;
    }

    public static int sumOdd (int start, int end ){
        int sum=0;
        if(start <0 || end <0 || end < start){
            return -1;
        }
        for(; start <= end; start++){
            if(isOdd(start)){
                sum += start;
            }
        }
        return sum;
    }




}
