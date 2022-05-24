package Chapter7;

public class Class3 {
    static final  int Array_Size = 10;
     static double[] fractions = new double[Array_Size];


    public  static void setFractions() {
        double[] fractions = new double[Array_Size];
        Class3.fractions = fractions;
       fractions[4] =0;
        fractions[9] = 1.667;
        fractions[6]=3.33;
        System.out.println("fraction[9]="+fractions[9]);
        System.out.println("fraction[6]="+fractions[6]);

    }

    public static int getArray_Size() {
        return Array_Size;
    }
    public static void sum(){
        double sum = 0.0;
        for (int i = 0;i< fractions.length;i++) {
            sum += fractions[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        setFractions();
        Class3.sum();

    }

}
