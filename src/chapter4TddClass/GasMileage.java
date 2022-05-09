package chapter4TddClass;

import java.util.ArrayList;
import java.util.Scanner;

public class GasMileage {
    private int miles;
    private int gallon;

    ArrayList<GasMileage> gasMileages;

    public GasMileage(int miles, int gallon) {
        this.miles = miles;
        this.gallon = gallon;
        gasMileages = new ArrayList<>();
    }

    public static void main(String[] args) {


    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public int getGallon() {
        return gallon;
    }

    public void setGallon(int gallon) {
        this.gallon = gallon;
    }

    public int calculateMilesPerGallon() {

        return getMiles() / getGallon();
    }

    public void displayMilesPerGallon(int miles, int gallon) {
        System.out.printf("the miles %d per gallon %d in each trips is %d%n:", miles, gallon, calculateMilesPerGallon());
    }
}
//    public int combinedMilesPerGallon(int miles,int gallon) {
//        for (int i = 0; i < miles; i++) {
//            for (int j = 0; j < gallon; j++) {
//                if (miles == -1) {
//                    System.out.println();
//                }
//
//            }
//        }
//
//    }
//}