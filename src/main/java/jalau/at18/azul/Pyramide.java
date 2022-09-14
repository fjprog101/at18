package jalau.at18.azul;

public class Pyramide {
    private final int pyramideSize = 5;
    private final int pyramideLimit = 4;
    private char[][] tile = new char[pyramideSize][pyramideSize];

    public void initializePyramide() {
        for (int row = 0; row < pyramideSize; row++) {
            for (int column = 0; column < pyramideSize; column++) {
                tile[row][column] = row + column >= pyramideLimit ? 'O' : ' ';
            }
        }
    }

    public char[][] getTile() {
        return tile;
    }
}
