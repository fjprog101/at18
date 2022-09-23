package jalau.at18.azul;

public enum TileColor {

    RED(false, "RED", "red.png"),
    YELLOW(false, "YELLOW", "yellow.png"),
    DARK(false, "DARK", "dark.png"),
    BLUE(false, "BLUE", "blue.png"),
    WHITE(false, "WHITE", "white.png"),
    FIRST_PLAYER(false, "FIRST", "first.png"),
    EMPTY(false, "EMPTY", "empty.png"),
    NULL(false, "NULL", "null.png");

    private final boolean statusTile;
    private String name;
    private String imagepath;

    public boolean getStatusTile() {
        return statusTile;
    }

    TileColor(boolean statusTile, String newName, String newpath) {
        this.statusTile = statusTile;
        this.name = newName;
        this.imagepath = newpath;
    }

    public String getName() {
        return name;
    }

    public String getColorPath() {
        return imagepath;
    }
}