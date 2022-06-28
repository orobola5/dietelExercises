package assignment.Tictactoe;

import static assignment.Tictactoe.Cell.EMPTY;

public class Board {

        private  String [][] board = new String[3][3];

        public Board(String [] [] board) {

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    board[i][j] = Cell.EMPTY.name();

                    this.board = board;
                }

            }

        }


        public String[][] getBoard() {
            return board;
        }


    }



