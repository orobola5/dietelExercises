package Chapter7;

import java.util.Arrays;

public class Table4 {
 //   int [][] table = new int[3][3];
    // the array contain 9 element;
    final int Array_Size = 3;
    int [][] table = new int[Array_Size][Array_Size];

    public void setTable() {
        for (int x = 0; x< table.length; x++) {
            for (int y = 0; y < table[x].length; y++) {
                table[x][y] =x +y;
                System.out.println(Arrays.deepToString(table));

            }

        }
    }


    public static void main(String[] args) {
        Table4 table4 = new Table4();
        table4.setTable();

    }
}
