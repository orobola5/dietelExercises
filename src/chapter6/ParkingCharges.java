package chapter6;

public class ParkingCharges {
    public void startCharging(double hours){
        double totalReceipts = 0.0;
        double fee;
           hours = 0;
       while ( hours >=0.0){
            fee = calculateCharges(hours);
            totalReceipts += fee;
            System.out.printf("the current charges is : $%.2f, Total Receipt : $%.2f\n",fee ,totalReceipts);

        }
        }

        public  double calculateCharges(double hours){
        double charge = 2.0;
        if(hours>3.0){charge = 2.0+0.5 * Math.ceil(hours-3.0);}
        if(charge > 10.0){charge = 10.0;}
        return charge;
    }
}
