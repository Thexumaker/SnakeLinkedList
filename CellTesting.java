import org.junit.Test;
import static org.junit.Assert.*;
public class CellTesting {
    @Test
    public void testConstructor() {
        Cell first = new Cell(0,0,"Food");

        int expectedRow = 0;
        String exxpectedCellType = "Food";
        assertEquals(expectedRow, first.getRow());
        assertEquals(expectedRow, first.getColumn());
        assertEquals(exxpectedCellType,first.getCelltype());
    }
}
