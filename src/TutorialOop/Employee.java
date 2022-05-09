package Chapter8oop;
/* imagine you been asked to work on an employee class and ur click already
* written the class but u discover that  some important attribute are not added
* instead of rewriting the code again we can create a class that is related to the former class
* and add our new attribute...they will share the same attribute and methods among themselves
* the new class we are working on will inherit the old class attribute and behaviour,but also have their own attribute and behaviour */
//This is the Superclass
public class Employee{
    private String name;
    private  String number;

    public Employee(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}
//THE SUBCLASS(It is related to the superclass and inherit all the attribute and method)
 class PartTimeEmployee extends Employee{
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
    public double calculateWeeklyPay(int noOfHours){
        /*calculate the no of hours the employee worked,knowing fully
        * that he/she cannot work for 24hours * the hourlyPay
        * i.e if she receive 200$ per hour and she works for 12hr
        * 12*200$ = 2400*/
        return noOfHours*hourlyPay;
    }
}
