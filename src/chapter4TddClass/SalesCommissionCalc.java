package chapter4TddClass;

import java.util.Scanner;

public class SalesCommissionCalc {
    private int itemCount;

    public void itemCount(double value) {
        if (this.itemCount == 1) {
            double v = itemCount * value;
        }

    }

    public double getItemCount() {
        return itemCount;
    }


}
//}
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int count =0;
//       System.out.println("enter -1 to exist");
//       int sentinel = input.nextInt();
//        System.out.println("how many product did  we sell ");
//        int itemCount = input.nextInt();
//        if (itemCount== 1) {
//            double v1 = 239.98 * itemCount;
//            System.out.println(v1);
//        }else if(itemCount==2){
//            double v2 = 129.75*itemCount;
//            System.out.println(v2);
//        }else if(itemCount==3){
//            double v3 = 99.95*itemCount;
//            System.out.println(v3);
//        }else{
//            double v4 = 350.89*itemCount;
//            System.out.println(v4);
//        }
//    }


