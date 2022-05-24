package Chapter7.AirlineReservationSystem;

public class FlightDetails {
    private String flightNo, dapartureLocation, arrivalLocation, flightDate, flightTime,
            seatAvailable, flightClass;
    private double fare;
    private String meal;

    public FlightDetails(String flightNo, String dapartureLocation, String arrivalLocation,
                         String flightDate, String flightTime, String seatAvailable,
                         String flightClass, double fare, String meal) {
        this.flightNo = flightNo;
        this.dapartureLocation = dapartureLocation;
        this.arrivalLocation = arrivalLocation;
        this.flightDate = flightDate;
        this.flightTime = flightTime;
        this.seatAvailable = seatAvailable;
        this.flightClass = flightClass;
        this.fare = fare;
        this.meal = meal;
    }
    FlightDetails(){

    }

    public static void add(FlightDetails details2) {

        FlightDetails flightDetails= details2;
    }


    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getDapartureLocation() {
        return dapartureLocation;
    }

    public void setDapartureLocation(String dapartureLocation) {
        this.dapartureLocation = dapartureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    public String getSeatAvailable() {
        return seatAvailable;
    }

    public void setSeatAvailable(String seatAvailable) {
        this.seatAvailable = seatAvailable;
    }

    public String getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

}