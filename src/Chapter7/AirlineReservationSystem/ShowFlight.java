package Chapter7.AirlineReservationSystem;

public class ShowFlight{

    public void showDetails(FlightDetails[] flightArrayData){
        for (FlightDetails details : flightArrayData){
            System.out.println();
            System.out.println("\t | \t" + details.getDapartureLocation());
            System.out.println("\t | \t" + details.getArrivalLocation());
            System.out.println("\t | \t" + details.getFlightClass());
            System.out.println("\t | \t" + details.getFlightNo());
            System.out.println("\t | \t" + details.getFlightDate());
            System.out.println("\t | \t" + details.getFlightTime());
            System.out.println("\t | \t" + details.getSeatAvailable());
            System.out.println("\t | \t" + details.getMeal());
            System.out.println("\t | \t" + details.getFare());

        }

    }
}
