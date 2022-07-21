package learningAbstractAndInterface.Interface;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric engine start the car");
    }

    @Override
    public void stop() {
        System.out.println(" Electric engine stop the car");
    }

    @Override
    public void accelerate() {
        System.out.println(" change the engine to accelerate");

    }
}
