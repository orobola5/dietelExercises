package Chapter9;

public class EmployeeSalary {
    private CommissionRate employeeCommissionRate;
    private BasePlusCommissionEmployee theBasePlus;


    public EmployeeSalary(CommissionRate employeeCommissionRate, BasePlusCommissionEmployee theBasePlus) {
        this.employeeCommissionRate = employeeCommissionRate;
        this.theBasePlus = theBasePlus;

    }

    public CommissionRate getEmployeeCommissionRate() {
        return employeeCommissionRate;
    }

    public BasePlusCommissionEmployee getTheBasePlus() {
        return theBasePlus;
    }

    public String toString() {
        return String.format("%s:  %s%n%s: %s%n%s: %.2f%n%s: %.2f","commission employee",employeeCommissionRate.getName(),
                "social security number",employeeCommissionRate.getSecurityNo(),
                "gross sales",employeeCommissionRate.getGrossSales(),
                "commission rate",employeeCommissionRate.getCommissionRate());
    }
}
