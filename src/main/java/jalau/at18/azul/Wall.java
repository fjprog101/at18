package jalau.at18.azul;
public class Wall {
    private final int wallMatrixSize = 5;
    private char[][] tiles = new char[wallMatrixSize][wallMatrixSize];
    private final int two = 2;
    private final int three = 3;
    private final int four = 4;

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
        tiles[row][column] = column - row == four || column - row == -1 ? 'W'
                            : column - row == three || column - row == two * (-1) ? 'D'
                            : column - row == two || column - row == three * (-1) ? 'R'
                            : column - row == 1 || column - row == four * (-1) ? 'Y'
                            : column - row == 0 ? 'B' : ' ';
    }

    public char[][] getTiles() {
        return tiles;
    }
}