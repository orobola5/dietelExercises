package TutorialOop.Employee;

//THE SUBCLASS(It is related to the superclass and inherit all the attribute and method)
public class PartTimeEmployee extends Employee<String, Number> {
    private double hourlyPay;

    public PartTimeEmployee(String name, String number, double hourlyPay) {
        super(name, number);
        this.hourlyPay = hourlyPay;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public double calculateWeeklyPay(int noOfHours) {
        /*calculate the no of hours the employee worked,knowing fully
         * that he/she cannot work for 24hours * the hourlyPay
         * i.e if she receive 200$ per hour and she works for 12hr
         * 12*200$ = 2400*/
        return noOfHours * hourlyPay;
    }
}
