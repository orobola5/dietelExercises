package DataStructureWithUdemy.Encapsulation;

public class Car {
    private String type;
    public String getType() {
        return type;
    }
    public String getRevenueData() {
        String data ="revenue :" + calculateRevenue();

        return data;
    }
    public int calculateRevenue() {
        return 100;
    }


    public void setType(String type) {
        this.type = type;
    }



}
