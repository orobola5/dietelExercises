package tutorial;

public class Time {
    private int hour;
    private int minute;
    private int seconds;

    public Time(int hour, int minute, int seconds) {
        validate(hour, minute, seconds);
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public Time() {
    }

    public Time(int seconds) {
        validateSeconds(seconds);
        this.seconds = seconds;
    }

    public Time(int minute, int seconds) {
        validateMinute(minute);
        validateSeconds(seconds);
        this.minute = minute;
        this.seconds = seconds;
    }


    public void setTime(int hour, int minute, int seconds) {
        validate(hour, minute, seconds);
        this.hour =hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        validateSeconds(seconds);
        this.seconds = seconds;
    }

    private static void validate(int hour, int minute, int seconds){
        validateHour(hour);
        validateMinute(minute);
        validateSeconds(seconds);

    }


    private static void validateHour(int hour) {
        boolean hourIsInvalid =  hour < 0|| hour>=24;
        if (hourIsInvalid) throw new IllegalArgumentException("Invalid hour");
    }
    private static void validateMinute(int minute) {
        boolean minuteIsInvalid =  minute < 0|| minute>=24;
        if (minuteIsInvalid) throw new IllegalArgumentException("Invalid minute");
    }
    private static void validateSeconds(int seconds) {
        boolean secondsIsInvalid =  seconds < 0|| seconds>=24;
        if (secondsIsInvalid) throw new IllegalArgumentException("Invalid seconds");
    }


    public double calculateTakeHomePay(double basicSalary){
        double takeHomePay = basicSalary+calculateTransportAllowanceFrom(basicSalary)
        +getFeedAllowanceFrom(basicSalary)-calculateTaxFrom(basicSalary);
        /*takeHomePay += calculateTransportAllowanceFrom(basicSalary);
        takeHomePay += getFeedAllowanceFrom(basicSalary);
        takeHomePay += calculateTaxFrom(basicSalary);

      double transportAllowance = (10/(100*1.0)*basicSalary);
       takeHomePay+=transportAllowance;
      double feedingAllowance =(3/(100*1.0)*basicSalary);
      takeHomePay+=feedingAllowance;
        double tax = (2/(100*1.0)*basicSalary);
      takeHomePay+=tax;*/

        return takeHomePay;
    }
    private double calculateTransportAllowanceFrom(double basicSalary){
        double transportAllowance = (10/(100*1.0)*basicSalary);
        return transportAllowance*basicSalary;
    }
    private double getFeedAllowanceFrom(double basicSalary){
        double feedingAllowance = (3/(100*1.0)*basicSalary);
        return feedingAllowance*basicSalary;
    }
    private double calculateTaxFrom(double basicSalary){
        double tax = (2/(100*1.0)*basicSalary);
        return tax * basicSalary;
    }
}

