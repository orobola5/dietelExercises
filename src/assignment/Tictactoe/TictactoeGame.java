package assignment.Tictactoe;

import java.util.Random;
import java.util.Scanner;

public class TictactoeGame {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] board = {{' ', ' ', ' '},
                          {' ', ' ', ' '},
                          {' ', ' ', ' '}};
        printBoard(board);
        while (true) {
            playerTurn(board, input);
          if(isGameFinished(board)){break;}
            printBoard(board);
            computerTurn(board);
            if(isGameFinished(board)){break;}
            printBoard(board);
        }
    }
    private static boolean hasContestantWon(char[][]board,char symbol) {
        if ((board[0][0] == 'x' && board[0][1] == 'x' && board[0][2] == 'x') ||
                (board[1][0] == 'x' && board[1][1] == 'x' && board[1][2] == 'x') ||
                (board[2][0] == 'x' && board[2][1] == 'x' && board[2][2] == 'x') ||

                (board[0][0] == 'x' && board[1][0] == 'x' && board[2][0] == 'x') ||
                (board[0][1] == 'x' && board[1][1] == 'x' && board[2][1] == 'x') ||
                (board[0][2] == 'x' && board[1][2] == 'x' && board[2][2] == 'x') ||

                (board[0][0] == 'x' && board[1][1] == 'x' && board[2][2] == 'x') ||
                (board[0][2] == 'x' && board[1][1] == 'x' && board[2][0] == 'x')) {
            return true;
        }
        return false;
    }

    private static boolean isGameFinished(char[][]board) {

          if(hasContestantWon(board,'x')) {
              printBoard(board);
              System.out.println("players wins!");
              return true;
          }
          if(hasContestantWon(board,'o')) {
            printBoard(board);
            System.out.println("computer wins!");
            return true;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] ==' '){
                    return false;
                }
            }

        }
        printBoard(board);
        System.out.println("the game ended in a tie!");
        return true;
    }

    private static void computerTurn(char[][]board){
        Random rand = new Random();
        int computerPlay;
        while (true) {
            computerPlay = rand.nextInt(9) + 1;
            if(isValidMove(board, computerPlay))
                break;
        }
        System.out.println("computer chose "+computerPlay);
        placeMove(board, Integer.toString(computerPlay),'o');

    }
    private static void placeMove(char[][]board,String position,char symbol) {
        switch (position) {
            case "1" -> board[0][0] = symbol;
            case "2" -> board[0][1] = symbol;
            case "3" -> board[0][2] = symbol;
            case "4" -> board[1][0] = symbol;
            case "5" -> board[1][1] = symbol;
            case "6" -> board[1][2] = symbol;
            case "7" -> board[2][0] = symbol;
            case "8" -> board[2][1] = symbol;
            case "9" -> board[2][2] = symbol;
            default -> System.out.println(" :");


        }
    }

    private static boolean isValidMove(char[][] board, int position) {
        switch (position) {
            case 1 -> {
                return (board[0][0] == ' ');
            }
            case 2 -> {
                return board[0][1] == ' ';
            }
            case 3 -> {
                return board[0][2] == ' ';
            }
            case 4 -> {
                return board[1][0] == ' ';
            }
            case 5 -> {
                return board[1][1] == ' ';
            }
            case 6 -> {
                return board[1][2] == ' ';
            }
            case 7 -> {
                return board[2][0] == ' ';
            }
            case 8 -> {
                return board[2][1] == ' ';
            }
            case 9 -> {
                return board[2][2] == ' ';
            }
            default -> {
                return false;
            }


        }
    }

        private static void printBoard ( char[][] board){
            System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
            System.out.println("-+-+-");
            System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
            System.out.println("-+-+-");
            System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        }

        private static void playerTurn ( char[][] board, Scanner input) {
            String userInput;
            while (true) {
                System.out.println("where would you like to play ? (1-9)");
                userInput = input.nextLine();
                if (isValidMove(board, Integer.parseInt(userInput))) {
                    break;
                }else System.out.println(userInput+" is not a valid move");
            }
            placeMove(board, userInput, 'x');
            input.close();


        }


}