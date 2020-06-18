import java.util.LinkedList;
public class Snake {
    public Cell head;
    public LinkedList<Cell> snake;
    public Snake(Cell initialPosition) {
        this.head = initialPosition;
        snake = new LinkedList<>();
        snake.addFirst(initialPosition);
        initialPosition.setCelltype("Snake");
    }
    public Cell getHead() {
        return this.head;
    }
    public void setHead(Cell Head) {
        this.head = Head;
        head.setCelltype("Snake");
    }
    public LinkedList<Cell> getSnake() {
        return this.snake;
    }
    public void setSnake(LinkedList<Cell> initSnake) {
        this.snake = initSnake;
    }
    public void grow(Cell newCell) {
        //When it eats an apple it should add to the back?


        head = newCell;
        snake.addFirst(head);
        newCell.setCelltype("Snake");
    }
    public void move(Cell nextCell) {
        Cell tail = snake.removeLast();
        tail.setCelltype("Empty");
        this.head = nextCell;
        nextCell.setCelltype("Snake");
        snake.addFirst(nextCell);

    }
    public boolean crash(Cell nextCell) {
        for (Cell cell : snake) {
            if (nextCell == cell) {
                return true;
            }
        }
        return false;


    }

}
