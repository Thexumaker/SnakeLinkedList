import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;
public class SnakeTest {
    @Test
    public void newSnake() {
        Cell start = new Cell(0,0,"Empty");

        Snake current = new Snake(start);
        Cell expectedFirstCell = new Cell(0,0,"Snake");
        assertEquals(current.head,start);
        assertEquals(current.getHead().getCelltype(), "Snake" );
    }
    @Test
    public void moving() {
        Cell start = new Cell(0,0,"Empty");
        Cell nextCell = new Cell(1,0,"Empty");

        Snake current = new Snake(start);
        current.move(nextCell);
        assertEquals(current.getHead(),nextCell);
        assertEquals(current.getHead().getRow(), 1);

    }
    @Test
    public void grow() {
        Cell start = new Cell(5,0,"Empty");
        Cell grown = new Cell(4,0,"Empty");




        Snake current = new Snake(start);
        current.grow(grown);
        LinkedList<Cell> result = new LinkedList<>();
        result.addLast(start);
        result.addLast(grown);
        assertEquals(current.getSnake(),result);


    }
}
