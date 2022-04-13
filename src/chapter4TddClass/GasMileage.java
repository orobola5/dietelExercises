package chapter4TddClass;

import java.util.Scanner;

public class GasMileage {
    private int miles;
    private int gallon;

    Scanner input = new Scanner(System.in);

    public GasMileage(int miles, int gallon) {
        this.miles = miles;
        this.gallon = gallon;
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
    public int calculateMilesPerGallon(){
        return getMiles()/getGallon();
    }
    public  void displayMilesPerGallon(int miles,int gallon){
      System.out.printf("the miles %d per gallon %d in each trips is %d%n:",miles,gallon,calculateMilesPerGallon());
    }

    public int combinedMilesPerGallon() {
        int sum = 0;
      if(miles%gallon==0){
          System.out.println(sum +=calculateMilesPerGallon());

      }
        return sum;
    }
}