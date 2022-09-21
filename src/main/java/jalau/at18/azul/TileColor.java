package jalau.at18.azul;

public enum TileColor {

    RED(false),
    YELLOW(false),
    DARK(false),
    BLUE(false),
    WHITE(false),
    FIRST_PLAYER(false),
    EMPTY(false),
    NULL(false);

    private final boolean statusTile;

    public boolean getStatusTile() {
        return statusTile;
    }

    TileColor(boolean statusTile) {
        this.statusTile = statusTile;
    }
}