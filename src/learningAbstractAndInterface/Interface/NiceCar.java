package learningAbstractAndInterface.Interface;

public class NiceCar {
    private Engine engine;
    private Media player= new MediaPlayer();


    public NiceCar(){
            this.engine=new PowerEngine();
        }

    public NiceCar(Engine engine) {
            this.engine = engine;
        }
        public void start () {
            engine.start();
        }
        public void stop () {
            engine.stop();
        }
        public void startMusic () {
            player.start();

        }
        public void stopMusic () {
            player.stop();
        }
        public void upgrading (Engine engine){
            this.engine = engine;
        }

}
