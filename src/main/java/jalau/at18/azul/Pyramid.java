package jalau.at18.azul;

public class Pyramid {
    private final int pyramidMatrixSize = 5;
    private final int dividePyramid = 4;
    private char[][] tiles = new char[pyramidMatrixSize][pyramidMatrixSize];

    public Pyramid() {
        initializePyramid();
    }
    public void initializePyramid() {
        for (int row = 0; row < pyramidMatrixSize; row++) {
            for (int column = 0; column < pyramidMatrixSize; column++) {
                tiles[row][column] = row + column >= dividePyramid ? 'O' : ' ';
            }
        }
    }

    public char[][] getTiles() {
        return tiles;
    }

    public void addTileToPyramid(int row, int column, char color) {
        tiles[row][column] = color;
    }

    public void cleanPyramide() {
        initializePyramid();
    }
}