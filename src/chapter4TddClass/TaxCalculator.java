package chapter4TddClass;

public class TaxCalculator {
    private String names;
    private double earning;
    private int year;


    public TaxCalculator(String names,double earning,int year){
        this.names = names;
        this.earning = earning;
        this.year = year;

    }
    public TaxCalculator(){

    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getNames() {
        return names;
    }

    public int number_of_citizen(int noOfCitizen) {
        for (int i = 0; i >= noOfCitizen ; i++) {
           noOfCitizen+=i;
        }
        return noOfCitizen;
    }


    public void setEarning(double earning) {
        this.earning = earning;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public double getEarning() {
        return earning;
    }

    public double calculatedTax(int taxRate) {
        double earningTax = 0;
        if(earning > 30000){
            double excessEarning = (taxRate * getEarning()) / 100;
             earningTax += excessEarning;
            System.out.println("tax is "+ earningTax);
        }else {
            earningTax = (taxRate * getEarning()) / 100;
            System.out.println(earning);
        }
        return earningTax;
    }



    }


