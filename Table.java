public class Table {
    public int size;
    public int rows;
    public int columms;
    public Cell[][] table;
    public Table(int x, int y){
        this.rows = x;
        this.columms = y;
        this.size = x * y;
        table = new Cell[x][y];
        for (int i = 0; i < table.length;i++) {
            for (int j = 0; j <table[i].length;j++) {
                table[i][j] = new Cell(i,j,"Empty");
            }

        }
    }
    public Cell[][] getTable() {
        return this.table;

    }
    public void setTable(Cell[][] newTable) {
        this.table = newTable;
    }
    public int getSize() {
        return this.size;
    }
    public void genFood() {
        int randomTile = (int)(Math.random() * size);
        int rowresult = randomTile/rows;
        int colresult = randomTile % columms;
        System.out.println(rowresult);
        System.out.println(colresult);
        while (!table[rowresult][colresult].getCelltype().equals("Empty")) {
            System.out.println(1);
            randomTile = (randomTile + 1) % size;
            rowresult = randomTile/rows;
            colresult = randomTile % columms;

        }
        table[rowresult][colresult].setCelltype("Food");

    }
    public static void main(String[] args) {
        Table test = new Table(3,3);
        test.genFood();
        test.genFood();
        test.genFood();
    }
}
