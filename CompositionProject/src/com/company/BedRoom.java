package com.company;

public class BedRoom {
    private Door theDoor;
    private Floor theFloor;
    private Wall theWall;

    public BedRoom(Door theDoor, Floor theFloor, Wall theWall) {
        this.theDoor = theDoor;
        this.theFloor = theFloor;
        this.theWall = theWall;
    }

    public void enter() {
        if(theDoor.isLocked()) {
            System.out.println("Door is locked!!!, You cannot enter");
        }
        else
        {
            System.out.println("Welcome!!!");
        }
    }

    public void getRoomArea(){
        System.out.println("Dimension of the room is: "+theFloor.getArea());
    }

    public Door getTheDoor() {
        return theDoor;
    }

    public Floor getTheFloor() {
        return theFloor;
    }

    public Wall getTheWall() {
        return theWall;
    }
}
