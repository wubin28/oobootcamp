package com.wubinben.oobootcamp;

import java.util.HashSet;
import java.util.Set;

public class ParkingLot {
    private Set<String> plates;
    private int allParkingSapces;
    private int occupiedParkingSpaces;

    public ParkingLot(int allParkingSpaces) {
        this.allParkingSapces = allParkingSpaces;
        this.occupiedParkingSpaces = 0;
        this.plates = new HashSet<String>(this.allParkingSapces);
    }

    public boolean isParkable() {
        return occupiedParkingSpaces < allParkingSapces;
    }

    public void openEntranceDoor() {
        this.occupiedParkingSpaces++;
    }

    public ParkingTicket park(String plateNumber) {
        this.plates.add(plateNumber);
        return new ParkingTicket(plateNumber);
    }

    public boolean isAbleToPickUp(ParkingTicket parkingTicket) {
        return plates.contains(parkingTicket.getPlateNumber());
    }
}
