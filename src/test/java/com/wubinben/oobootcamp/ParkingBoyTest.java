package com.wubinben.oobootcamp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class ParkingBoyTest {

    @Test
    public void the_parking_boy_can_park_the_car_in_the_single_parking_lot() {
        List<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLot = new ParkingLot(10);
        parkingLots.add(parkingLot);
        ParkingBoy parkingBoy = new ParkingBoy(parkingLots);

        assertTrue(parkingBoy.isParkable());
    }
    // The parking boy can park the car in the second parking lot if the first one is full
    // The parking boy can pick up the car from the single parking lot
    // The parking boy can pick up the car from the second parking lot
}
