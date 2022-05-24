package tutorial;

public class ClassArray {
    public static void main(String[] args) {
        int[]arrays = new int[20];
        System.out.println();
        countdown(10);
        logarithms(0);
        gen(2);
        }
        public static void countdown(int n){
        while (n !=1){
            System.out.println(n);
            if(n % 2==0){n=n/2;}
            else {n = n*3+1;}
        }
            System.out.println("blastoff");

        }
        public static void logarithms(int n){
        while (n<10){
            double x =n;
            System.out.println(x+"    "+Math.log(x)/Math.log(2));
            n++;
        }
            System.out.println("its finished");
        }
        public static void gen(int n ){
        int i=0;
        while (i<=12){
            System.out.printf("%4d",i*n);
            i = i+1;
        }
            System.out.println();
        }
    }


