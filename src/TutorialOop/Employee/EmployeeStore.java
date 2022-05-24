package TutorialOop.Employee;
/*imagine a store taking data of all the employees,a cashier,salesPerson, storeManager,director is also an employee
and they have the same data that other employee have plus extra information */

public class EmployeeStore {
    private String name;
    private String id;
    private double salary;
    private double discount;

    public EmployeeStore(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;

    }
    public void setDiscount(double yearlyDiscount){
        this.discount = yearlyDiscount;
    }
    public double getDiscount(){
        return discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
    public  double getRaise(){
        return getSalary() * getDiscount();
    }

    public double calculateSalaryYearly(int numberOfMonths) {
        return getSalary()*numberOfMonths;

    }
}

