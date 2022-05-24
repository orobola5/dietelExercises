package chapter4TddClass;

public class Trip {
    private int milesDriven;
    private int gallonsUsed;


    public int getGallonsUsed() {
        return gallonsUsed++;
    }

    public int getMilesDriven() {
        return milesDriven++;
    }
    public static double calculateMilesPerGallon(double milesDriven, double gallonsUsed){
//        Scanner input = new Scanner(System.in);
        int sentinel = 0;
        while(true){
            System.out.println("enter -1 to exit");
            if(milesDriven==-1){sentinel=+1;}break;
        }
        double mile = gallonsUsed/milesDriven;
        System.out.println(mile);
        return mile;
    }


}
