package jalau.at18.azul;
public class Wall {
    private final int wallMatrixSize = 5;
    private Tile[][] tiles = new Tile[wallMatrixSize][wallMatrixSize];
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int FOUR = 4;

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
        tiles[row][column] = column - row == FOUR || column - row == -1 ? new Tile(TileColor.WHITE)
                            : column - row == THREE || column - row == TWO * (-1) ? new Tile(TileColor.DARK)
                            : column - row == TWO || column - row == THREE * (-1) ? new Tile(TileColor.RED)
                            : column - row == 1 || column - row == FOUR * (-1) ? new Tile(TileColor.YELLOW)
                            : column - row == 0 ? new Tile(TileColor.BLUE) : new Tile(TileColor.EMPTY);
    }

    public Tile[][] getTiles() {
        return tiles;
    }
}