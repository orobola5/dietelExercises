package Chapter9.SemicolonEmployee;

public class BaseplusCommissionEmployee extends  CommissionEmployee{
    private double baseSalary;

    public BaseplusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary<0.0){
            throw new IllegalArgumentException("base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return baseSalary +(commissionRate*grossSales);
    }

    @Override
    public String toString() {
        return String.format(
                "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "base-salaried commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", grossSales, "commission rate", commissionRate,
                "base salary", baseSalary);
    }
}
