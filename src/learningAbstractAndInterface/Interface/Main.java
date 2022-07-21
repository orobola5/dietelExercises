package learningAbstractAndInterface.Interface;

public class Main {
    public static void main(String[] args) {
//        Car benz = new Car();
//       benz.start();
//       benz.accelerate();
//       benz.brake();
//       benz.stop();
//
//       Media car = new Car();
//       car.start();
//       car.stop();


        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.stopMusic();
        car.upgrading(new ElectricEngine());
        car.start();
    }


}
