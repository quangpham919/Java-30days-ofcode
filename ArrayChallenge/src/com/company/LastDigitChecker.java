package com.company;

public class LastDigitChecker {
    public static  boolean hasSameLastDigit(int first, int second, int third) {
        if(!isValid(first) || !isValid(second) || !isValid(third) ){
            return false;
        }
        int firstDigit = first % 10;
        int secondDigit = second % 10;
        int thirdDigit = third % 10;
        return (firstDigit==secondDigit) || (secondDigit == thirdDigit) || (thirdDigit == firstDigit);
    }

    public static boolean isValid(int number){
        if(number >= 10 && number <= 1000) {
            return true;
        }
        return false;
    }
}
