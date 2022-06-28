package assignment.NewTictactoe;

public enum GameCell{
        X,O,EMPTY;

        @Override
        public String toString() {
                switch (this){
                        case X -> {
                                return String.valueOf('X');
                        }
                        case O -> {
                                return String.valueOf('O');
                        }
                        case EMPTY -> {
                                return String.valueOf(EMPTY);
                        }

                }
                return "GameCell{}";
        }
}
