import com.sun.jdi.connect.Connector;

public class Game {
    public Snake snake;
    public Table board;
    public int goal;
    public boolean gameOver;
    public String direction;
    public Game(Snake newSnake,Table newBoard, String direc) {
        this.snake = newSnake;
        this.board = newBoard;
        this.gameOver = false;
        this.direction = direc;
        goal = board.getSize();


    }
    public Cell getNextCell() {
        Cell cuurentCell = this.snake.getHead();
        Cell nextCell = update(this.direction, cuurentCell);
        return nextCell;

    }
    public void update() {
        if (!gameOver) {
            Cell nextCell = getNextCell();
            if (this.snake.crash(nextCell)) {
                this.gameOver = true;
            }
            else if (nextCell.getCelltype().equals("Food")) {
                snake.grow(nextCell);
                board.genFood();
            }
            else {
                snake.move(nextCell);
            }
        }




    }

    public Cell update(String direction, Cell current) {
        //Make it so that when it goes out of the box, the game doesn't end but actually just crosses the border
        int newRow;
        int newCol;
        if (direction == "Up") {
            int currentRow = current.getRow();
            int currentCol = current.getColumn();
            newRow = currentRow;
            newCol = (currentCol -1 ) % this.goal;
        }
        else if (direction == "Down") {
            int currentRow = current.getRow();
            int currentCol = current.getColumn();
            newRow = currentRow;
            newCol = (currentCol + 1 ) % this.goal;
        }
        else if (direction == "Right") {
            int currentRow = current.getRow();
            int currentCol = current.getColumn();
            newRow = (currentRow +1) % this.goal;
            newCol = currentCol;
        }
        else {
            int currentRow = current.getRow();
            int currentCol = current.getColumn();
            newRow = (currentRow - 1) % this.goal;
            newCol = currentCol;

        }
        Cell returnCell = board.getTable()[newRow][newCol];
        return(returnCell);
    }
    public static void main(String[] args)
    {

        System.out.println("Going to start game");



        Table board = new Table(3, 3);
        Snake initSnake = new Snake(board.getTable()[0][0]);
        Game newGame = new Game(initSnake, board, "Right");
        newGame.board.genFood();
        newGame.update();


    }

}
