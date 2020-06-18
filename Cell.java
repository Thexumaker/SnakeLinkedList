public class Cell {
    private int row;
    private int column;
    private String cellType;
    public Cell(int x, int y,String type) {
        this.row = x;
        this.column = y;
        this.cellType = type;
    }
    public String getCelltype() {
        return this.cellType;
    }
    public void setCelltype(String cell) {
        this.cellType = cell;
    }
    public int getRow() {
        return this.row;

    }
    public int getColumn() {
        return this.column;
    }
}

