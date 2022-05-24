package Chapter9.Sport;

public class Badminton  {
    private int NoOfPlayer;
    private String instrument;


    public Badminton(int noOfPlayer, String instrument) {
        NoOfPlayer = noOfPlayer;
        this.instrument = instrument;
    }

    public int getNoOfPlayer() {
        return NoOfPlayer;
    }

    public void setNoOfPlayer(int noOfPlayer) {
        NoOfPlayer = noOfPlayer;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }
}
