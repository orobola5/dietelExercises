package Chapter7.AirlineReservationSystem;

import java.io.FileNotFoundException;

public class SearchFlight {
    private  ShowFlight showFlight;
    public void searchFlight(FlightDetails[] flightDetail, String deptloc, String arrivalLoc, String date, String flightClass)throws FileNotFoundException {
        for (FlightDetails flightDetails:flightDetail) {
           if( flightDetails.getDapartureLocation().equalsIgnoreCase(deptloc)&&
                   flightDetails.getSeatAvailable().equalsIgnoreCase("y")&&
                   flightDetails.getArrivalLocation().equalsIgnoreCase(arrivalLoc)&&
                   flightDetails.getFlightDate().equalsIgnoreCase(date)&&
                   flightDetails.getFlightClass().equalsIgnoreCase(flightClass)||
                   flightDetails.getFlightClass().equalsIgnoreCase("EB")){

               FlightDetails details2 = new FlightDetails(flightDetails.getFlightTime(),
                       flightDetails.getDapartureLocation(), flightDetails.getArrivalLocation(),
                       flightDetails.getFlightDate(),flightDetails.getFlightNo(),
                       flightDetails.getSeatAvailable(),flightDetails.getMeal(),
                       flightDetails.getFare(),flightDetails.getFlightClass());

               if(flightDetail.equals("EB")){details2.setFare(flightDetails.getFare()+((0.4)*flightDetails.getFare()));
               }FlightDetails.add(details2);
           }

        }

    }
}