package assignment.Tictactoe;

public enum Cell {
    X,O,EMPTY;


    @Override
    public String toString() {
        switch (this){
            case X -> {
                return "X";
            }
            case O -> {
                return "O";
            }
            case EMPTY -> {
                return "EMPTY";
            }
        }
        return "GameStatus{}";
    }
}


