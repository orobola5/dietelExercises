package Chapter7;
/*Write Java statements to accomplish each of the following tasks:
a) Display the value of the tenth element of array r.
r[10]=;
b) Initialize each of the six elements of one-dimensional integer array g to -1.
int [] g = {-1,-1,-1,-1,-1};
c) Find the maximum of the first one-hundred elements of floating-point array c.
d) Copy a hundred-element array a into a hundred-element array b, but in reverse order.
e) Compute the product of the third to the tenth elements, both inclusive, in a hundred element integer array w.
* */

import java.util.Arrays;

public class Task8 {

        float [] c = new float [100];
        double max = c[0] ;

    public void findMax(int elements) {

        for (int i = 0; i < c.length; i++) {
            max = c[i];
            elements =i;
        }
        System.out.println(elements);
    }
    public void copyElement(){
        double []a = new double[100];
        double []b = new double[100];
        for (int i = 0; i < a.length; i++) {
            b[i] =a[i];
            System.out.println(Arrays.toString(new double[]{b[i]}));
        }
        a[3]= 56;
        a[3] = a[10];
        System.out.println(a[3]);
        System.out.println(a[10]);

        }


    public static void main(String[] args) {
        Task8 number8 = new Task8();
        number8.copyElement();
        number8.findMax(100);

    }
}

