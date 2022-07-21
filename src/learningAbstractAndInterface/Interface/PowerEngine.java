package learningAbstractAndInterface.Interface;

public class PowerEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Power engine start the car");
    }

    @Override
    public void stop() {
        System.out.println("Power engine stop the car");
    }

    @Override
    public void accelerate() {
        System.out.println("change the Power engine to accelerate");

    }
}
