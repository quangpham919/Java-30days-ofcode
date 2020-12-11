package com.quangpham;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Theatre theatre = new Theatre("CGV", 8, 12 );
//        theatre.getSeats();

        if(theatre.reserveSeat("D12")){
            System.out.println("Please pay for " + theatre.getSeatPrice("D12") );
        }
        else{
            System.out.println("Unfortunately, seat is taken.");
        }

        if(theatre.reserveSeat("D12")){
            System.out.println("Please pay for " + theatre.getSeatPrice("D12") );
        }
        else{
            System.out.println("Unfortunately, seat is taken.");
        }

        if(theatre.reserveSeat("B12")){
            System.out.println("Please pay for " + theatre.getSeatPrice("B12"));
        }
        else{
            System.out.println("Unfortunately, seat is taken.");
        }

        printSeats(theatre.getSeats());

        List<Theatre.Seat> reverseSeat = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeat);
        printSeats(reverseSeat);

        List<Theatre.Seat> seatByPrice = new ArrayList<>(theatre.getSeats());
        Collections.sort(seatByPrice,theatre.PRICE_ORDER);
        printSeats(seatByPrice);

    }

    public static void printSeats(List<Theatre.Seat> list){

        for (Theatre.Seat seat: list){
            System.out.print(" "+ seat.getSeatNumber()+ " -- $" + seat.getPrice() +", " );

        }
        System.out.println();
        System.out.println("========================");


    }

}
