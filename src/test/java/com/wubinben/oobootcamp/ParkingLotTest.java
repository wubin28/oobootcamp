package com.wubinben.oobootcamp;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParkingLotTest {

    @Test
    public void the_parking_lot_can_have_the_driver_park_his_car_if_there_is_parking_space_available() {
        ParkingLot parkingLot = new ParkingLot(10);

        assertTrue(parkingLot.isParkable());
    }

    @Test
    public void the_parking_lot_cannot_have_the_driver_park_his_car_if_it_is_full() {
        ParkingLot parkingLot = new ParkingLot(10);
        for (int i = 0; i < 10; i++) {
            parkingLot.openEntranceDoor();
        }
        assertFalse(parkingLot.isParkable());
    }

    // The parking lot can have the driver pick up his car if he returns the parking ticket
}
