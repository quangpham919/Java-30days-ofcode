package com.quangpham;

import java.util.*;


public class Theatre {
    private final String theatreName;
    private final List<Seat> seats = new ArrayList<>();

    static final Comparator<Seat> PRICE_ORDER;

    static {
        PRICE_ORDER = new Comparator<Seat>() {
            @Override
            public int compare(Seat seat1, Seat seat2) {
                if (seat1.getPrice() > seat2.getPrice()) {
                    return 1;
                } else if (seat1.getPrice() < seat2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
    }

    public Theatre(String theatreName, int numberOfRow, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numberOfRow - 1);

        for (char row = 'A' ; row <= lastRow; row++){
            for (int seatNumb = 1 ; seatNumb <= seatsPerRow ; seatNumb++){
                double price = 12d;
                if(row<'D' && (seatNumb >= 4 && seatNumb <= 9)){
                    price =14d;
                }
                else if(row > 'F' || (seatNumb <=4 || seatNumb >=9)){
                    price = 7d;
                }

                Seat seat = new Seat(row + String.format("%02d",seatNumb),price);

                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }
    public double getSeatPrice(String seatNumber) {
        Seat requestSeat = new Seat(seatNumber,0);
        int isExist = Collections.binarySearch(seats,requestSeat,null);
        if(isExist>= 0){
            return seats.get(isExist).getPrice();
        }
        else{
            return -1;
        }
    }
    public boolean reserveSeat(String seatNumber ){
        Seat requestSeat = new Seat(seatNumber,0);
        int isExist = Collections.binarySearch(seats, requestSeat, null);
        if(isExist>=0){
            return seats.get(isExist).reserve();
        }
        else{
            System.out.println("There is no seat "+ seatNumber);
            return false;
        }


    }

    // for testing
    public List<Theatre.Seat> getSeats(){
        return this.seats;
    }

    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;
        private final double price;


        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }


        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean reserve(){
            if(!this.reserved){
                this.reserved = true;
                System.out.println("Seat "+this.seatNumber+" reserved");
                return true;
            }else{
                return false;
            }
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean cancel(){
            if(this.reserved){
                this.reserved = false;
                System.out.println("Seat "+this.seatNumber+" cancelled");
                return true;
            }
            else {
                return false;
            }
        }

        public double getPrice() {
            return price;
        }
    }
}
