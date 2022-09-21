package jalau.at18.azul;

public enum TileColor {

    RED(false,"RED"),
    YELLOW(false,"YELLOW"),
    DARK(false,"DARK"),
    BLUE(false,"BLUE"),
    WHITE(false,"WHITE"),
    FIRST_PLAYER(false,"FIRST"),
    EMPTY(false,"EMPTY"),
    NULL(false,"NULL");

    private final boolean statusTile;
    private String name;

    public boolean getStatusTile() {
        return statusTile;
    }

    TileColor(boolean statusTile, String newName) {
        this.statusTile = statusTile;
        this.name = newName;
    }

    public String getName() {
        return name;
    }
}