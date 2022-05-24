package Chapter9.Sport;

public class IndoorSport extends Chess{
    private int players;

    public IndoorSport(int noOfPlayer, String instrument, int noOfPlayer1, int noOfPlayer2, String instrument1, int players) {
        super(noOfPlayer, instrument, noOfPlayer1, noOfPlayer2, instrument1);
        this.players = players;
    }

    public int getPlayers() {
        return players;
    }

}
