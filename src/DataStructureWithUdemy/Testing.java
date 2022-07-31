package DataStructureWithUdemy;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your instructions :");
        String Text = input.nextLine();
        switch (Text){
            case "run":
                System.out.println("program is running");
                break;
            case "stop":
                System.out.println("program stop");
                break;
            default:
                System.out.println("instruction not recognizrd");
        }
    }
}
