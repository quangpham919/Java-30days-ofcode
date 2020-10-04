package com.company;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {

        if (number <= 10 && number >= -10) {
            return false ;
        }

        int reverse = 0;
        int temp = number > 0 ? number : number * -1;
        while (temp > 0) {
            int lastDigit = temp % 10;
            reverse = reverse * 10  + lastDigit;
            temp = temp / 10;
        }
        if (reverse == Math.abs(number)) {
            return true;
        }
        return false;
    }
}
