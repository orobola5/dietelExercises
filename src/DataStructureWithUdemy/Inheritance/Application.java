package DataStructureWithUdemy.Inheritance;

public class Application {
    public static void main(String[] args) {
        Factory factory1 = new Factory();
        factory1.design();
        factory1.build();

        Car myCar = new Car();
        myCar.design();
        myCar.build();
        myCar.brand();
    }


}
