package com.company;

public class SumDigitsFromANumber {
    public static int sumDigits (int number ){

        int sum =0 ;
        if(number >= 10) {

            while (number > 0){
                // extract the least significant digit
                int extractedDigit = number % 10;
                // discard the least significant digit from the number
                number = number / 10;

                sum += extractedDigit;
            }
            return sum;

        }
        else if (number >= 0) {
            return number;
        }
        else {
            return -1;
        }
    }
}
