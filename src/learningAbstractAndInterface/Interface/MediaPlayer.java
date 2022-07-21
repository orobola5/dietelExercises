package learningAbstractAndInterface.Interface;

public class MediaPlayer implements Media{
    @Override
    public void start() {
        System.out.println("la la la la ");

    }

    @Override
    public void stop() {
        System.out.println("please dont stop the music");
    }
}
