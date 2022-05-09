package Chapter9;

public class Main {
    public static void main(String[] args) {

        CommissionRate cR = new CommissionRate("john", "call", 25, 3456,
                500.00, 0.04);
        BasePlusCommissionEmployee bE = new BasePlusCommissionEmployee("lauretta", "Hilly", 38,
                56567, 500.00, 0.06, 1000);
        EmployeeSalary employeeSalary = new EmployeeSalary(cR,bE);
        System.out.println(employeeSalary.getEmployeeCommissionRate().getGrossSales());
        System.out.println(employeeSalary.toString());

    }
}