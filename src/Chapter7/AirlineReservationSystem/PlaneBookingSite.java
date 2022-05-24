package Chapter7.AirlineReservationSystem;

import java.util.Scanner;

public class PlaneBookingSite {
    private FlightDetails flightDetails;
    private FlightArrayData flightArrayData;
    static Scanner input = new Scanner(System.in);


    public void bookFlightForFirstClass() {
        FlightArrayData data = new FlightArrayData();
        for (boolean seat : FlightArrayData.seats) {
            try {
                while (data.firstClass < 5 && data.economyClass < 10)
                    System.out.println("please type 1 for first_class");
                System.out.println("please type 2 for Economy class");
                System.out.println(" pick your choice :");
                int choice = input.nextInt();
                if (choice == 1) {
                    if (data.firstClass < 5) data.firstClass++;
                    System.out.println(data.getFirstClass());
                }
            } catch (Exception seats){
            if (data.economyClass < 10) display("firstClass is full, Economy class ?");
            display("""
                    1.yes
                    2.no.
                    pick your choice again :
                    """);
            int choice = input.nextInt();}

        }
    }

    public void bookFlightForEconomyClass() {
        FlightArrayData data = new FlightArrayData();
        for (boolean seat : FlightArrayData.seats) {
            try {
                while (data.firstClass<5 && data.economyClass < 10)
                    System.out.println("please type 1 for first_class");
                System.out.println("please type 2 for Economy class");
                System.out.println(" pick your choice :");
                int choice = input.nextInt();
                if(choice==2){data.economyClass++;
                    System.out.println("EConomy Class :" + data.getEconomy());}
            }catch (Exception seats)
            {if(data.economyClass<10){
                data.economyClass++;
                System.out.println(data.economyClass);
            }else if(data.firstClass<5) System.out.println("Economy is full, first class ? ");
                display("""
                        1.yes
                        2.no.
                        pick your choice :
                        """);
            int choice = input.nextInt();
            if (choice ==1){
                data.firstClass++;
                System.out.println(data.firstClass);
            }else System.out.println("next flight leaves in 1 hour 30 minute");}
        }
        display("the plane is full");
    }

    private void display(String prompt) {
        System.out.println(prompt);
    }

    }


