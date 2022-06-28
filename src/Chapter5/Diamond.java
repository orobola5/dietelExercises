package Chapter5;

public class Diamond {
    public static void main(String[] args) {
        diamondPrinting(5);


    }
    public static void diamondPrinting(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalcolsinrow = row > n ? 2 * n - row : row;

            int noOfSpace = n - totalcolsinrow;
            for (int i = 0; i < noOfSpace; i++) {
                System.out.print(" ");
            }
            for (int column = 0; column < totalcolsinrow; column++) {
                System.out.print("* ");
            }
            System.out.println();


        }
    }

}
