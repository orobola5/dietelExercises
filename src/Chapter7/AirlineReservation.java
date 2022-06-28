package Chapter7;

import java.util.Scanner;

public class AirlineReservation {
    private static final int TOTAL_Seats = 10;
    private static boolean[] seats = new boolean[TOTAL_Seats];

    public enum airlineClass {
        FIRST, ECONOMY

    }
}

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int option = 0;
//        int seatNumber = 0;
//        while (option != 9) {
//            System.out.println("-please type\n" + "1 for first class and\n" +
//                    "2 for economy or\n" + "9 to quit.\n" + " -->Option :");
//            option = input.nextInt();
//            switch (option) {
//                case 1:
//                    seatNumber = checkAvailableSeat(airlineClass.FIRST);
//                    if (seatNumber != -1) {
//                        assignSeat(seatNumber);
//                        displayBoardingPass(seatNumber, airlineClass.FIRST);
//                    } else seatNumber = checkAvailableSeat(airlineClass.ECONOMY);
//                    if (seatNumber != -1) {
//                        System.out.println("\n\tfirst class is full!" +
//                                "\naccepts to be placed in the economy section?" +
//                                "\n1-yes\n2-Not\nEnter your prefer option ");
//                        option = input.nextInt();
//                        if (option == 1) {
//                            assignSeat(seatNumber);
//                            displayBoardingPass(seatNumber, airlineClass.ECONOMY);
//                        } else System.out.println("\nnext flight leaves in 1hour:45min.\n");
//                        else System.out.println("\nNo more seats available.The plane is full.\n");
//                    }}}}}
//            }case 2:
//                seatNumber = checkAvailableSeat(airlineClass.ECONOMY);
//                if (seatNumber != -1) {
//                    assignSeat(seatNumber);
//                    displayBoardingPass(seatNumber, airlineClass.ECONOMY);
//                } else seatNumber = checkAvailableSeat(airlineClass.FIRST);
//                if (seatNumber != -1) {
//                    System.out.println("\n\teconomy class is full!" +
//                            "\naccepts to be placed in the first section?" +
//                            "\n1-yes\n2-Not\nEnter your prefer option ");
//                    option = input.nextInt();
//                    if (option == 1) {
//                        assignSeat(seatNumber);
//                        displayBoardingPass(seatNumber, airlineClass.FIRST);
//                    } else System.out.println("\nnext flight leaves in 1hour:45min.\n");
//
//                } else System.out.println("\nNo more seats available.The plane is full.\n");
//        }
//        break;
//        case 3:
//        break;
//        default:
//        System.out.println("\nInvalid option.Try again.\n");
//        break;
//    }
//input.close();
//    }
//
//    private static void displayBoardingPass(int seatNumber, airlineClass first) {
//    }
//
//    private static void assignSeat(int seatNumber) {
//    }
//
//    private static int checkAvailableSeat(airlineClass first) {
//    }
