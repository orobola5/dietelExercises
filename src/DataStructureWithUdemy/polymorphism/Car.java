package DataStructureWithUdemy.polymorphism;

public class Car extends Vehicle{
    @Override
    public void design() {
        System.out.println("cars design");
    }
    public  void ride(){
        System.out.println("riding the car");
    }
}
