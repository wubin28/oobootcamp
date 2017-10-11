package com.wubinben.oobootcamp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class ParkingBoyTest {

    @Test
    public void the_parking_boy_can_park_the_car_in_the_single_parking_lot() {
        List<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLot = new ParkingLot(10);
        parkingLots.add(parkingLot);
        ParkingBoy parkingBoy = new ParkingBoy(parkingLots);

        assertTrue(parkingBoy.isParkable());
    }

    @Test
    public void the_parking_boy_can_park_the_car_in_the_second_parking_lot_if_the_first_one_is_full() {
        List<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLot = new ParkingLot(10);
        parkingLots.add(parkingLot);
        ParkingLot anotherParkingLot = new ParkingLot(10);
        parkingLots.add(anotherParkingLot);
        ParkingBoy parkingBoy = new ParkingBoy(parkingLots);

        for (int i = 0; i < 10; i++) {
            parkingLot.park("JA" + i);
        }

        assertTrue(parkingBoy.isParkable());
    }

    @Test
    public void the_parking_boy_cannot_park_the_car_if_all_the_parking_lots_are_full() {
        List<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLot = new ParkingLot(10);
        parkingLots.add(parkingLot);
        ParkingLot anotherParkingLot = new ParkingLot(10);
        parkingLots.add(anotherParkingLot);
        ParkingBoy parkingBoy = new ParkingBoy(parkingLots);

        for (int i = 0; i < 10; i++) {
            parkingLot.park("JA" + i);
        }

        for (int i = 0; i < 10; i++) {
            anotherParkingLot.park("JB" + i);
        }

        assertFalse(parkingBoy.isParkable());
    }
    // The parking boy can pick up the car from the single parking lot
    // The parking boy can pick up the car from the second parking lot
}
