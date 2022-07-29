package DataStructureWithUdemy.polymorphism;

public class App {
    public static void main(String[] args) {
 //polymorphism is a greek word which means many shape
        // polymorphism  means if u have a subclass of a superclass u could always use d subclass
        //where u normally u use the superclass
 Vehicle vehicle1 = new Vehicle();
 Car car1 = new Car();
 Vehicle vehicle2 = car1;
 vehicle2.design();
 //wat really matter when u call a method in polymorphism is not the type of the reference that u use
 //but the object which the reference is pointing out
        car1.ride();
        createDesign(car1);
    }
    public static  void createDesign(Vehicle vehicle){
        vehicle.design();

    }
}
