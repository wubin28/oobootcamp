package com.wubinben.oobootcamp;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ParkingLotTest {

    @Test
    public void the_parking_lot_can_have_the_driver_park_his_car_if_there_is_parking_space_available() {
        ParkingLot parkingLot = new ParkingLot(10);

        assertTrue(parkingLot.isParkable());
    }

    // The parking lot cannot have the driver park his car if it is full
    // The parking lot can have the driver pick up his car if he returns the parking ticket
}
