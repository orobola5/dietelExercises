package Chapter9.Sport;

public class Tabletenis extends Badminton  {
    private int noOfPlayer;
    private String instrument;

    public Tabletenis(int noOfPlayer, String instrument, int noOfPlayer1) {
        super(noOfPlayer, instrument);
        this.noOfPlayer = noOfPlayer1;
    }

    public int getNoOfPlayer() {
        return noOfPlayer;
    }

    public void setNoOfPlayer(int noOfPlayer) {
        this.noOfPlayer = noOfPlayer;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }
}
