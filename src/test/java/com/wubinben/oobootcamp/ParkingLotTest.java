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
            parkingLot.park("JA" + i);
        }

        assertFalse(parkingLot.isParkable());
    }

    @Test
    public void the_parking_lot_can_have_the_driver_pick_up_his_car_if_he_returns_the_parking_ticket() {
        ParkingLot parkingLot = new ParkingLot(10);
        ParkingTicket parkingTicket = parkingLot.park("JA12345");

        assertTrue(parkingLot.isAbleToPickUp(parkingTicket));
    }

}
