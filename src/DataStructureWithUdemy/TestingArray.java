package DataStructureWithUdemy;

public class TestingArray {
    public static void main(String[] args) {
        int[] array=new int[7];
        array[0]=20;
        array[1]=35;
        array[2]=-15;
        array[3]=7;
        array[4]=55;
        array[5]=1;
        array[6]=-22;

        int index=-1;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==7) {
                index = i;
            }


        }
        System.out.println(index);
    }
}
