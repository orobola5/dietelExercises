package Turtle;

public class Position {
   private int row;
   private int column;
    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }


    @Override
    public String toString() {
        return "Position{" +
                "row=" + row +
                ", column=" + column +
                '}';
    }

    public void setColumn(int column) {
        this.column = column;

    }
    public int getColumn() {
        return column;
    }
    @Override
    public boolean equals(Object obj){
        Position compared =(Position) obj;
        return compared.column == this.column && compared.row==this.row;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row= row;
    }
}
