package Turtle;

import org.junit.jupiter.api.Test;
import static Turtle.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    @Test void test_that_turtle_can_be_created(){
        Turtle turtle = new Turtle();
        assertNotNull(turtle);
    }
    @Test void turtle_has_a_pen_by_default(){
        Turtle turtle = new Turtle();
       boolean isPenDown = turtle.isPenDown();
       assertFalse(isPenDown);
    }
    @Test void turtle_can_move_pen_down() {
        Turtle turtle = new Turtle();
        assertFalse(turtle.isPenDown());
        turtle.penDown();
        boolean isPenDown = turtle.isPenDown();
        assertTrue(isPenDown);
    }
    @Test void turtle_can_move_pen_up() {
        Turtle turtle = new Turtle();
        turtle.penDown();
        turtle.penUp();
    }
    @Test void test_that_turtle_can_faceEast(){
        Turtle turtle = new Turtle();
        assertEquals(Direction.EAST,turtle.getCurrentDirection());
    }

    @Test void test_that_turtle_can_TurnRight_from_East(){
        Turtle turtle = new Turtle();
        turtle.turnRight();
        assertSame(Direction.SOUTH,turtle.getCurrentDirection());
    }
    @Test void test_that_turtle_can_TurnRight_from_SOUTH(){
        Turtle turtle = new Turtle();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(Direction.WEST,turtle.getCurrentDirection());
    }
    @Test void test_that_turtle_can_TurnRight(){
        Turtle turtle = new Turtle();
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(Direction.NORTH,turtle.getCurrentDirection());
    }

    @Test void test_that_turtle_can_TurnLeft_While_FacingEast(){
        Turtle turtle = new Turtle();
        turtle.turnLeft();
        assertSame(Direction.NORTH,turtle.getCurrentDirection());
    }
    @Test void test_that_turtle_can_TurnLeft_While_Facing(){
        Turtle turtle = new Turtle();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(Direction.WEST,turtle.getCurrentDirection());
    }
    @Test void test_that_turtle_can_TurnLeft(){
        Turtle turtle = new Turtle();
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(Direction.SOUTH,turtle.getCurrentDirection());
    }

    @Test void testToMoveForward(){
        Turtle turtle = new Turtle();
        turtle.moveForward(5);
        assertEquals(new Position(0,4),turtle.getCurrentPosition());
    }
    @Test void testToMoveForward_facing_East(){
        Turtle turtle = new Turtle();
        turtle.penDown();
        turtle.moveForward(5);
        turtle.turnRight();
        turtle.turnLeft();
        turtle.moveForward(5);
        assertEquals(new Position(4,4),turtle.getCurrentPosition());
    }


    @Test void testToMoveForward_facing_South(){
        Turtle turtle = new Turtle();
        turtle.penDown();
        turtle.moveForward(5);
        turtle.turnLeft();
        assertEquals(new Position(0,4),turtle.getCurrentPosition());
    }

    @Test void testToMoveForward_facing_West(){
        Turtle turtle = new Turtle();
        turtle.penDown();
        turtle.turnRight();
        turtle.moveForward(5);
        assertEquals(new Position(4,0),turtle.getCurrentPosition());
    }




}
