package assignment;

public class TriangleProgram {
    public static void main(String[] args) {
//        for (int row = 0; row<= 10; row++) {
//                    for (int column = 0; column<= row; column++) {
//                        System.out.print(" *");

        for (int a = 0; a <= 10; a++) {
            for (int b = 0; b <= a; b++) {
                System.out.print(" *");

            }
            System.out.println();

        }

        System.out.println();
        //for (int row = 0; row<= 10; row++) {
        //            for (int column = row; column<= 10; column++) {
        //                System.out.print(" *");

        for (int b = 0; b <= 10; b++) {
            for (int c = b; c <= 10; c++) {
                System.out.print(" *");

            }
            System.out.println();
        }
        System.out.println();

        for (int b = 0; b <= 10; b++) {
            for (int c = b; c <= 10; c++) {
                System.out.print("  ");

            }
           for (int d = 0; d <= b; d++) {
               System.out.print(" *");
           }

            System.out.println();

        }
        System.out.println();

        for (int d = 0; d <= 10; d++)  {
            for (int e = d; e <= 10; e++) {
                System.out.print(" *");

            }
            System.out.println("  ");
        }
        System.out.println();
    }
}
