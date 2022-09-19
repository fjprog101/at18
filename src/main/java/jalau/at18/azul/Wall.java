package jalau.at18.azul;
public class Wall {
    private final int wallMatrixSize = 5;
    private Tile[][] tiles = new Tile[wallMatrixSize][wallMatrixSize];
    private static final int two = 2;
    private static final int three = 3;
    private static final int four = 4;

    public Wall() {
        initializeWall();
    }

    public void initializeWall() {
        for (int row = 0; row < wallMatrixSize; row++) {
            for (int column = 0; column < wallMatrixSize; column++) {
                defineWallColor(row, column);
            }
        }
    }

    public void defineWallColor(int row, int column) {
        tiles[row][column] = column - row == four || column - row == -1 ? Tile.WHITE
                            : column - row == three || column - row == two * (-1) ? Tile.DARK
                            : column - row == two || column - row == three * (-1) ? Tile.RED
                            : column - row == 1 || column - row == four * (-1) ? Tile.YELLOW
                            : column - row == 0 ? Tile.BLUE : Tile.EMPTY;
    }

    public Tile[][] getTiles() {
        return tiles;
    }
}