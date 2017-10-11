package com.wubinben.oobootcamp;

import java.util.List;

public class ParkingBoy {
    private List<ParkingLot> parkingLots;

    public ParkingBoy(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public boolean isParkable() {
        boolean isParkable = false;
        for (ParkingLot parkingLot : this.parkingLots) {
            isParkable = parkingLot.isParkable();
            if (isParkable) {
                break;
            }
        }
        return isParkable;
    }
}
