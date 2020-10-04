package com.company;

import java.security.DigestException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions floorDimension = new Dimensions(20,20);
        Dimensions doorDimension = new Dimensions(5,5,5);
        Dimensions wallDimension = new Dimensions(15,40,15);

        Floor woodenFloor = new Floor(floorDimension,"wood","brown");
        Door woodenDoor = new Door("brown","wood",doorDimension);
        Wall bedroomWall = new Wall("brick",wallDimension);

        BedRoom smallBedRoom = new BedRoom(woodenDoor,woodenFloor,bedroomWall);


        smallBedRoom.enter();
        smallBedRoom.getTheDoor().unlock();
        smallBedRoom.enter();
        smallBedRoom.getRoomArea();
        System.out.println("Is door locked ? " +smallBedRoom.getTheDoor().isLocked());
        smallBedRoom.getTheDoor().lock();
    }
}
