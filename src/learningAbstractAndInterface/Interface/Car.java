package learningAbstractAndInterface.Interface;

public class Car implements Engine,Brake,Media{
    @Override
    public void brake() {
        System.out.println("brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("start the car");

    }

    @Override
    public void stop() {
        System.out.println("stop the car");
    }

    @Override
    public void accelerate() {
        System.out.println("change the gear to accelerate");

    }
}
