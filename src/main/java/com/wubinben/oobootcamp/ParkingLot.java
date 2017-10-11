package com.wubinben.oobootcamp;

public class ParkingLot {
    private int allParkingSapces;
    private int occupiedParkingSpaces;

    public ParkingLot(int allParkingSpaces) {
        this.allParkingSapces = allParkingSpaces;
    }

    public boolean isParkable() {
        return occupiedParkingSpaces < allParkingSapces;
    }
}
