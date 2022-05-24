package Chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlineReservationTest {
    @Test
    void test_that_airline_reservation_system_can_be_created() {
        AirlineReservation reservation = new AirlineReservation();
        assertNotNull(reservation);
    }
//    @Test void test_that_airline_reservation_system_class_can_be_created(){
//        AirlineReservation reservation = new AirlineReservation();}
//        reservation.airlineClass;
//       assertEquals("FIRSTCLASS",);
//    }
}