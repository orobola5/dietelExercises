package chapter2;

import java.util.Scanner;

 public class TemperatureConverter{

  public static void main(String[]args){
   Scanner temperatureConverter=new Scanner(System.in);
    System.out.println("Enter a number:");
	double celsiusNumber=temperatureConverter.nextDouble();
	double fahrenheitNumber=9.0/5*celsiusNumber+32;

System.out.println("fahrenheit is "+ fahrenheitNumber);}
}
