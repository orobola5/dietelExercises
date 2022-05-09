package assignment;

public class TriangleProgram {
    public static void main(String[] args){

        for (int row = 0; row <= 10; row++) {
            for (int column = 0;column <= row; column++) {
                System.out.print(" *");

            }
            System.out.println();

        }

        System.out.println();

        for (int row = 0; row <= 10; row++) {
            for (int column = row; column <= 10; column++) {
                System.out.print(" *");

            }
            System.out.println();
        }
        System.out.println("  ");

        for (int row = 0; row <= 10; row++) {
            for (int column = row; column <= 10; column++) {
                System.out.print("  ");

            }
           for (int row1 = 0; row1 <= row; row1++) {
               System.out.print(" *");
           }

            System.out.println();

        }
        System.out.println();

        for (int row = 0; row <= 10; row++)  {
            for (int column = row; column <= 10; column++) {
                System.out.print(" *");

            }
            System.out.println("  ");
        }
        System.out.println();
    }
}
