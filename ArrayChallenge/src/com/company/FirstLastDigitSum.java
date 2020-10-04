package com.company;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit (int number ) {
        int sum = number % 10  ;
        if(number < 0 ) {
            return -1;

        }
        else if (number <=9 ){
            return number + number;
        }
        else {
            while (number > 0 ){
                number = number /10;
                if ( number < 10 ) {
                    sum += number;
                    break;
                }
            }
        }
        return sum;
    }
}
