package Chapter9;

public class BasePlusCommissionEmployee {
    private String firstName;
    private String lastName;
    private int Age;
    private  int securityNo;
    private double grossSales;
    private  double commissionRate;
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, int age, int securityNo,
                                      double grossSales, double commissionRate, double baseSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        Age = age;
        this.securityNo = securityNo;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return firstName+""+lastName;
    }

    public void setName(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getSecurityNo() {
        return securityNo;
    }

    public void setSecurityNo(int securityNo) {
        this.securityNo = securityNo;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales<0.0){ throw new IllegalArgumentException("Gross Sales cannot be less than 0 ");}
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate<=0.0 || commissionRate>=1.0){}
        this.commissionRate = commissionRate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary<0.0){ throw new IllegalArgumentException(" Base Salary can not be less than 0");}
        this.baseSalary = baseSalary;
    }
    public double earning(){
        return  getBaseSalary() + getGrossSales() * getCommissionRate();
    }
    public String toString() {
        return String.format("%s:  %s%n%s: %s%n%s: %.2f%n%s: %.2f", "basePlus commission employee", getName(),
                "social security number", getSecurityNo(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }
}
