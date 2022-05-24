package Turtle;
import java.util.Objects;

import static Turtle.Direction.*;

public class Turtle {
    private final Pen pen = new Pen();
    private Direction direction = EAST;
   private final Position position = new Position(0,0);


    public boolean isPenDown() {
            return pen.isDown();
        }

        public void turnRight() {
            if (direction == Direction.SOUTH) direction = Direction.WEST;
            else if (direction == Direction.EAST) direction = Direction.SOUTH;
            else direction =Direction.NORTH;

        }

        public void turnLeft() {
            if (direction == NORTH) direction = Direction.WEST;
            else if (direction == EAST) direction = (NORTH);
            else direction=SOUTH;

        }

        public void moveForward(int noOfSteps) {
            if (direction == EAST) increaseColumnBy(noOfSteps);
            if (direction == SOUTH) increaseRowBy(noOfSteps);
            if (direction == WEST) decreaseColumnBy(noOfSteps);
            if (direction == NORTH) decreaseRowBy(noOfSteps);

    }

    private void increaseColumnBy(int noOfSteps) {
        int currentColumnPosition = position.getColumn();
        position.setColumn(currentColumnPosition+noOfSteps-1);

    }
    private void increaseRowBy(int noOfSteps) {
        int currentRowPosition = position.getRow();
        position.setRow(currentRowPosition+noOfSteps-1);

    }
    private void decreaseColumnBy(int noOfSteps) {
        int currentColumnPosition = position.getColumn();
        position.setColumn(currentColumnPosition+noOfSteps+1);

    }
    private void decreaseRowBy(int noOfSteps) {
        int currentRowPosition = position.getColumn();
        position.setRow(currentRowPosition+noOfSteps+1);

    }

    public void penDown() {
            pen.penDown();

        }

        public void penUp() {
            pen.penUp();

        }

        public Direction getCurrentDirection() {
            return direction;
        }

        public Position getCurrentPosition() {
        return position;
    }



}