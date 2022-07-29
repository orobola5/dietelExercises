package Chapter9.SemicolonEmployee;

public class Main {
    public static void main(String[] args) {
        BaseplusCommissionEmployee baseplusCommissionEmployee=
                new BaseplusCommissionEmployee("bob," +
                                     "leiwis",
                                "333",
                        "500",
                                0.04,
                            300);
        baseplusCommissionEmployee.commissionRate=100;
        baseplusCommissionEmployee.grossSales=10;
        baseplusCommissionEmployee.setBaseSalary(1000.0);
        baseplusCommissionEmployee.earnings();
    }

}
