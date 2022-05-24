package Chapter7.AirlineReservationSystem;

import java.util.Scanner;

public class FlightArrayData {
    private Object FlightDetails;
    static boolean [] seats = new boolean[10];
    int firstClass = 0;
    int economyClass = 5;

    public Object getFlightDetails() {
        return FlightDetails;
    }

    public boolean[] getSeats() {
        return seats;
    }

    private void display(String prompt) {
        System.out.println(prompt);
    }

    public int getFirstClass() {
        return firstClass;
    }

    public int getEconomy() {
        return economyClass;
    }
}
