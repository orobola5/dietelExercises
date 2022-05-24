package tutorial;

import java.util.Arrays;
import java.util.Scanner;

public class SingleArray {
    static Scanner input = new Scanner(System.in);
    public void goods() {
        String[] goods = {"Biscuit", "Detergent", "Hand_wash", "Disinfectant", "Provisions"};
        for (int i = 0; i <= goods.length - 1; i++) {
            String good = goods[i];
        }
        System.out.println(Arrays.deepToString(goods));
    }
    public void average(int number){
        double total = 0;
        System.out.println("enter the number :");
        number= input.nextInt();
        double[] values = new double[ number];
        for (double value:values) {
            System.out.println("enter a value");
            values[(int) value] = input.nextDouble();
            total +=value;
        }
        double average = total/number;
        if(average< 10){
            System.out.println("average value is less than 10"+ average);

        }



    }

    public void biscuit() {
        int[] biscuits = {80, 90, 87, 65, 60, 45};
        for (int i = 0; i <= biscuits.length - 1; i++) {
            biscuits[i] = biscuits[i] * 2;

        }
        System.out.println(Arrays.toString(biscuits));
    }

    public void grades() {
        String[] grades = {"A", "B", "A+", "C", "B+"};
        for (String grade : grades) {
        }
        System.out.println(Arrays.deepToString(grades));
    }

    public void sum() {
        int[] numbers = {56, 12, 33, 8, 3, 2, 98};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];


        }
        System.out.println(sum);
    }

    public void total() {
        int[] values = {56, 78, 90};
        int total = 0;
        for (int value : values) {
            total += value;
        }
        System.out.println(total);
    }
    public void words(int index) {
        System.out.println("enter the index no :");
        index = input.nextInt();
        String[] words = new String[index];
        System.out.println("enter words no");
        for (int i = 0; i <= index-1; i++) {
            words[i] = input.nextLine();
            
        }
        for (int i = index-1; i >= 0; i--) {

            System.out.print(words[i]);
        }

    }
    public void names(int elements){
        elements = 4;
        String[] names = new String[elements];
        for (int i = 0; i <elements -1; i++) {
            System.out.println("enter name no "+(i +1)+":");
            names[i]=input.nextLine();

        }
       System.out.println(Arrays.deepToString(names));
    }


    public static void main(String[] args){
        SingleArray array=new SingleArray();
        array.biscuit();
        array.goods();
        array.grades();
        array.sum();
        array.total();
        array.names(4);
        array.words(4);
        array.average(4);

        }

    }
