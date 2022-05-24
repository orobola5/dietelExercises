package TutorialOop.Employee;

public class ManagerStore extends EmployeeStore {
    private int password;
    private int numberOfEmployeeManaged;


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
        return getSalary() * getDiscount();
    }
}
