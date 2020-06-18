import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;
public class GameTest {
    @Test
    public void testCrashandMove() {
        Table board = new Table(3, 3);
        Snake initSnake = new Snake(board.getTable()[0][0]);
        Game newGame = new Game(initSnake, board, "Right");
        newGame.update();

        assertEquals(true,initSnake.crash(board.getTable()[1][0]));

    }
    public void eat() {
        Table board = new Table(3, 3);
        Snake initSnake = new Snake(board.getTable()[0][0]);
        Game newGame = new Game(initSnake, board, "Right");
        newGame.update();

        assertEquals(true,initSnake.crash(board.getTable()[1][0]));

    }
}
