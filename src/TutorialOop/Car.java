package TutorialOop;

public class Car {
    public static void main(String[] args) {
        Car car1 = new Car("mazda", "6", "black", "ab1234");
        Car car2 = new Car("Toyota", "camry", "grey", "xy1098");
        Car car3 = new Car("Honda", "2022", "white", "h6gty09");
        System.out.println(car1.color);
        System.out.println(car1.brand);
        System.out.println(car2.turn_on());
        System.out.println(car2.park());
        car3.accelerate();
    }
    //define the field
    private String brand;
    private  String model;
    private String color;
    private String license_plate;

    // define constructor


    public Car(String brand, String model, String color, String license_plate) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.license_plate = license_plate;
    }
    //define method turn_off

    public boolean turn_off(){
        System.out.println("the car is off");
        return false;
    }

    //define method turn_on
    public boolean turn_on(){
        System.out.println("the car is on");
        return true;
    }

    //define method park
    public boolean park(){
        System.out.println("the car is parked at the Garage");
        return false;
    }

    //define method accelerate
    public void accelerate(){
        System.out.println("the car accelerates");
    }
}
