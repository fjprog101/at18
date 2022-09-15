package jalau.at18.azul;

public class WallBool {
    private final int wallBoolSize = 5;
    private boolean[][] tileBool = new boolean[wallBoolSize][wallBoolSize];

    public WallBool() {
    }

    public void intializeWallBoolean() {
        for (int row = 0; row < wallBoolSize; row++) {
            for (int column = 0; column < wallBoolSize; column++) {
                tileBool[row][column] = false;
            }
        }
    }

    public boolean[][] getTilesBool() {
        return tileBool;
    }

    public void setTilesBool(boolean[][] tilesBool) {
        this.tileBool = tilesBool;
    }
}