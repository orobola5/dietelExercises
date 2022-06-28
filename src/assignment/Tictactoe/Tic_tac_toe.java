package assignment.Tictactoe;


import java.util.Objects;
import java.util.Scanner;

public class Tic_tac_toe {


        private static final String[][] array = new String[3][3];
        private static final Board board = new Board(array);
        private static Player player1;
        private static Player player2;
        private static final int[] validatePosition = new int[8];


        private static final Scanner userChoice = new Scanner(System.in);

        public static void main(String[] args) {
            playerChoiceOfMarker();

            ticTacGame();
        }

        private static void ticTacGame() {
            boolean cellCheck = false;
            for (int i = 0, j = 0; i + j < 9; i++, j++) {
                while (!cellCheck) {
                    try {
                        System.out.println("Player1.... choose your position between 1 and 9");
                        int position1 = userChoice.nextInt();
                        validatePosition[i] = position1;
                        position1 = validate(position1);
                        cellCheck = check(position1, player1.getPlayer());
                        printBoard();
                        if (checkForOAndX(Cell.X)) return;
                        if (checkForOAndX(Cell.O)) return;
                    } catch (IllegalAccessException ex) {
                        ex.getStackTrace();
                    }
                }

                cellCheck = false;

                while (!cellCheck) {
                    try {
                        System.out.println("Player2.... choose your position between 1 and 9");
                        int position2 = userChoice.nextInt();
                        position2 = validate(position2);
                        validatePosition[j] = position2;
                        cellCheck = check(position2, player2.getPlayer());
                        printBoard();
                        if (checkForOAndX(Cell.X)) return;
                        if (checkForOAndX(Cell.O)) return;
                    } catch (IllegalAccessException ex) {
                        ex.getStackTrace();
                    }
                }
                cellCheck = false;
                if (i + j == 9 && !checkForOAndX(Cell.X) && !checkForOAndX(Cell.O)) System.out.println("Draw");
            }

        }
        private static void playerChoiceOfMarker() {
            System.out.println("Choose a marker (either X or O)");

            String marker = userChoice.next();
            while (!marker.toUpperCase().equals("X") && !marker.toUpperCase().equals("O")) {
                System.out.println("Choose a marker (either X or O)");
                marker = userChoice.next();
            }

            if (Objects.equals(marker.toUpperCase(), "X")) {
                player1 = new Player(Cell.X);
                player2 = new Player(Cell.O);
            } else {
                player1 = new Player(Cell.O);
                player2 = new Player(Cell.X);
            }
        }

        private static boolean checkForOAndX(Cell cell) {
            if (Objects.equals(board.getBoard()[0][0], cell.name()) &&
                    Objects.equals(board.getBoard()[0][1], cell.name())
                    && Objects.equals(board.getBoard()[0][2], cell.name()) ||
                    Objects.equals(board.getBoard()[1][0], cell.name()) &&
                            Objects.equals(board.getBoard()[1][1], cell.name())
                            && Objects.equals(board.getBoard()[1][2], cell.name()) ||
                    Objects.equals(board.getBoard()[2][0], cell.name()) &&
                            Objects.equals(board.getBoard()[2][1], cell.name())
                            && Objects.equals(board.getBoard()[2][2], cell.name()) ||
                    Objects.equals(board.getBoard()[0][0], cell.name()) &&
                            Objects.equals(board.getBoard()[1][0], cell.name())
                            && Objects.equals(board.getBoard()[2][0], cell.name()) ||
                    Objects.equals(board.getBoard()[0][1], cell.name()) &&
                            Objects.equals(board.getBoard()[1][1], cell.name())
                            && Objects.equals(board.getBoard()[2][1], cell.name()) ||
                    Objects.equals(board.getBoard()[0][2], cell.name()) &&
                            Objects.equals(board.getBoard()[1][2], cell.name())
                            && Objects.equals(board.getBoard()[2][2], cell.name()) ||
                    Objects.equals(board.getBoard()[0][0], cell.name()) &&
                            Objects.equals(board.getBoard()[1][1], cell.name())
                            && Objects.equals(board.getBoard()[2][2], cell.name()) ||
                    Objects.equals(board.getBoard()[0][2], cell.name()) &&
                            Objects.equals(board.getBoard()[1][1], cell.name())
                            && Objects.equals(board.getBoard()[2][0], cell.name())

            ) {
                System.out.println(cell.name() + " wins");
                return true;
            }
            return false;
        }


        private static int validate(int position) {
            while (!(position >= 1) || !(position <= 9)) {
                System.out.println("Invalid input");
                System.out.println("Choose your position between 1 and 9");
                position = userChoice.nextInt();
            }
            return position;
        }

        private static boolean check(int position, Cell player) throws IllegalAccessException {
            switch (position) {
                case 1 -> {
                    if (checkCell(board.getBoard()[0][0])) throw new IllegalAccessException("cell played in");
                    else {
                        board.getBoard()[0][0] = String.valueOf(player);
                        return true;
                    }

                }
                case 2 -> {
                    if (checkCell(board.getBoard()[0][1])) throw new IllegalAccessException("cell played in");
                    else {
                        board.getBoard()[0][1] = String.valueOf(player);
                        return true;
                    }

                }
                case 3 -> {
                    if (checkCell(board.getBoard()[0][2])) throw new IllegalAccessException("cell played in");

                }
                case 4 -> {
                    if (checkCell(board.getBoard()[1][0])) throw new IllegalAccessException("cell played in");
                    else {
                    board.getBoard()[1][0] = String.valueOf(player);
                    return true;}
                }
                case 5 -> {
                    if (checkCell(board.getBoard()[1][1])) throw new IllegalAccessException("cell played in");
                    else board.getBoard()[1][1] = String.valueOf(player);
                    return true;
                }
                case 6 -> {
                    if (checkCell(board.getBoard()[1][2])) throw new IllegalAccessException("cell played in");
                    else{
                    board.getBoard()[1][2] = String.valueOf(player);
                    return true;}
                }

                case 7 -> {
                    if (checkCell(board.getBoard()[2][0])) throw new IllegalAccessException("cell played in");
                    else {
                    board.getBoard()[2][0] = String.valueOf(player);
                    return true;}
                }
                case 8 -> {
                    if (checkCell(board.getBoard()[2][1])) throw new IllegalAccessException("cell played in");
                    else {
                    board.getBoard()[2][1] = String.valueOf(player);
                    return true;}
                }
                case 9 -> {
                    if (checkCell(board.getBoard()[2][2])) throw new IllegalAccessException("cell played in");
                    else {
                    board.getBoard()[2][2] = String.valueOf(player);
                    return true;}

                }
            }
            return false;
        }

    private static boolean checkCell(String valueInCell){
        return !valueInCell.equals(Cell.EMPTY.toString());
        }

    private static void printBoard() {
        for (int i = 0; i < board.getBoard().length; i++) {
        for (int j = 0; j < board.getBoard()[i].length; j++) {
        System.out.print(board.getBoard()[i][j] + " ");}
        System.out.println("");}
        }

    public boolean isEmpty() {
            return true;
    }
}

