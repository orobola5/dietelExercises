package Chapter9;

public class Chess extends Tabletenis  {
    private int noOfPlayer;
    private String instrument;


    public Chess(int noOfPlayer, String instrument, int noOfPlayer1, int noOfPlayer2, String instrument1) {
        super(noOfPlayer, instrument, noOfPlayer1);
        this.noOfPlayer = noOfPlayer2;
        this.instrument = instrument1;
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
