package com.company;

public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber){
        if(firstNumber < 10 || secondNumber < 10 || firstNumber > 99 || secondNumber > 99) {
            return  false;
        }
        for (int i = 0 ; i < 2 ; i++) {

            int digit = firstNumber % 10 ;

            int tempSecondDigit = secondNumber;
            for ( int y = 0 ; y < 2 ; y++) {
                int secondDigit = tempSecondDigit % 10;
                if (digit == secondDigit ) {
                    return  true;
                }
                tempSecondDigit = tempSecondDigit / 10;
            }
            firstNumber = firstNumber /10 ;
        }
        return false;
    }
}
