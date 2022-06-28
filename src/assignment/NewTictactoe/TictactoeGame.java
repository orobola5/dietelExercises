package assignment.NewTictactoe;

import static assignment.NewTictactoe.GameCell.*;

public class TictactoeGame {
    private BoardElement boardElement;
    private GamePlayer player;
    private GameCell cell;
    char[][] board = new char[3][3];

    public TictactoeGame(BoardElement boardElement, GamePlayer player, GameCell cell, char[][] board) {
        this.boardElement = boardElement;
        this.player = player;
        this.cell = cell;
        this.board =new char[][] {{' ', ' ', ' '},
                                  {' ', ' ', ' '},
                                  {' ', ' ', ' '}};
    }
    public TictactoeGame(){

    }

    public void printBoard ( char[][] board){
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }
    public  void playerTurn (char board, char input) {
        System.out.println("where would you like to play ? (1-9)");
        System.out.println(input);

        switch (input){
            case 1:
                GameCell board0 = X;
            case 2:
                GameCell  board1 = X;
            case 3:
                GameCell board2 = X;
            default:
                throw new IllegalStateException("Unexpected value: " + input);
        }

    }





}
