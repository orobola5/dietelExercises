package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingChargesTest {

    @Test
    void startCharging() {
        ParkingCharges charges = new ParkingCharges();
        charges.startCharging(12);
        assertEquals(0.5,charges.calculateCharges(12));


    }

    @Test
    void calculateCharges() {
        ParkingCharges charges = new ParkingCharges();
         double charge = charges.calculateCharges(12.0);
        assertEquals(6.5,charge);
    }
}