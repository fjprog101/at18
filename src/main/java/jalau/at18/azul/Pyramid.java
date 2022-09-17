package jalau.at18.azul;
public class Pyramid {
    private final int pyramidMatrixSize = 5;
    private final int dividePyramid = 4;
    private Tile[][] tilesMatrix = new Tile[pyramidMatrixSize][pyramidMatrixSize];

    public void initializePyramid() {
        for (int row = 0; row < pyramidMatrixSize; row++) {
            for (int column = 0; column < pyramidMatrixSize; column++) {
                tilesMatrix[row][column] = row + column >= dividePyramid ? Tile.EMPTY : Tile.NULL;
            }
        }
    }

    public Tile[][] getTilesMatrix() {
        return tilesMatrix;
    }

    public void addTileToPyramid(int row, int column, Tile newTile) {
        tilesMatrix[row][column] = newTile;
    }

    public void cleanPyramide() {
        initializePyramid();
    }
}