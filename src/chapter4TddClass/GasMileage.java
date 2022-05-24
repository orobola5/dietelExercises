package chapter4TddClass;

import java.util.ArrayList;
import java.util.Scanner;

public class GasMileage {
    private double miles;
    private double gallon;
    ArrayList<Double> tripArrayList;

    public GasMileage(double miles, double gallon) {
        this.miles = miles;
        this.gallon = gallon;
        tripArrayList = new ArrayList<Double>();
    }


    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    public double getGallon() {
        return gallon;
    }

    public void setGallon(double gallon) {
        this.gallon = gallon;
    }

    public void displayMilesPerGallon() {
        System.out.printf("the gallon %f per miles %f in each Trip is %f%n:", getGallon(), getMiles(), calculateMilesPerGallon());
    }
    public double calculateMilesPerGallon(){

       double value =Trip.calculateMilesPerGallon(miles, gallon);
       return value  ;
    }


    public  void combinedMilesPerGallon(double miles,double gallon) {
        tripArrayList.add(calculateMilesPerGallon());

    }

    public void tripArrayList(double miles,double gallon) {



        }

    }



