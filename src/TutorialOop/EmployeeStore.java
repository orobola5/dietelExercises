package TutorialOop;
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
class ManagerStore extends EmployeeStore{
    private int password;
    private  int numberOfEmployeeManaged;


    public ManagerStore(String name, String id, double salary, int password, int numberOfEmployeeManaged) {
        super(name, id, salary);
        this.password = password;
        this.numberOfEmployeeManaged = numberOfEmployeeManaged;

    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setNumberOfEmployeeManaged(int numberOfEmployeeManaged) {
        this.numberOfEmployeeManaged = numberOfEmployeeManaged;
    }

    public String getPassword(int password) {
        if (this.password == password) {
            return "Access granted";
        } else
            return "Access denied";

    }
    public int getNumberOfEmployeeManaged() {
        return numberOfEmployeeManaged;
    }

    @Override
    public double getRaise() {
//        return super.getRaise()*getDiscount();
        return getSalary()*getDiscount();
    }
}
class DirectorStore extends ManagerStore{


    public DirectorStore(String name, String id, double salary, int password,
                         int numberOfEmployeeManaged) {
        super(name, id, salary, password, numberOfEmployeeManaged);

    }


}
