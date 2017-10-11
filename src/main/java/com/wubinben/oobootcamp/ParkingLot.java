package com.wubinben.oobootcamp;

public class ParkingLot {
    private int allParkingSapces;
    private int occupiedParkingSpaces;

    public ParkingLot(int allParkingSpaces) {
        this.allParkingSapces = allParkingSpaces;
        this.occupiedParkingSpaces = 0;
    }

    public boolean isParkable() {
        return occupiedParkingSpaces < allParkingSapces;
    }

    public void openEntranceDoor() {
        this.occupiedParkingSpaces++;
    }
}
