import java.util.stream.IntStream;

public class Testing {
    public static void main(String[] args) {
        int [] num = new int[]{12, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        average(num);
        averageLambda(num);
//            int count =0;
//        for (int i = 0; i < num.length; i++) {
//        if(num[i]%2==0) {
//            count ++;}
//        }
//        System.out.println("Even number is :" + count);
//        for (int i = 0; i < num.length; i++) {
//            if (num[i] % 2 == 1) {
//                count++;
//            }
//        }
//             System.out.println("the number is :"+count);
//        for (int i = num.length-1; i >=0; i--) {
//            if (num[i] % 4 == 0) {
//                count++;
//            }
//        }
//                System.out.println("Number is  divisible:"+count);


        }
        public static  void  average(int[]list){
        int sum = 0;
            for (int i = 0; i < list.length; i++) {
                sum+= list[i];

            }
            System.out.println("the sum is :"+sum);
            int average = sum / list.length;
            System.out.println("the average is :"+average);


        }

    public static  void  averageLambda(int[]list){
        int arraySum = IntStream.of(list).sum();
        int average = arraySum/ list.length;
        System.out.println("the sum is :"+arraySum);
        System.out.println("the average is :"+average);
    }
    }

