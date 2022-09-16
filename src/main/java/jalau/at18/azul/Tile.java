package jalau.at18.azul;

public enum Tile {
    RED('R', false),
    YELLOW('Y', false),
    DARK('D', false),
    BLUE('B', false),
    WHITE('W', false),
    FIRST_PLAYER('F', false),
    EMPTY('E', false),
    NULL('N', false);

    private final char colorTile;
    private final boolean statusTile;

    public boolean getStatusTile() {
        return statusTile;
    }

    Tile(char colorTile, boolean statusTile) {
        this.colorTile = colorTile;
        this.statusTile = statusTile;
    }

    public char getColor() {
        return colorTile;
    }

}
