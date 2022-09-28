package jalau.at18.azul;

public enum TileColor {

    RED(false, "RED", "red.png", "redOpacity.png"),
    YELLOW(false, "YELLOW", "yellow.png", "yellowOpacity.png"),
    DARK(false, "DARK", "dark.png", "darkOpacity.png"),
    BLUE(false, "BLUE", "blue.png", "blueOpacity.png"),
    WHITE(false, "WHITE", "white.png", "whiteOpacity.png"),
    FIRST_PLAYER(false, "FIRST", "first.png", "first.png"),
    EMPTY(false, "EMPTY", "empty.png", "empty.png"),
    NULL(false, "NULL", "null.png", "null.png");

    private final boolean statusTile;
    private String name;
    private String imagepath;
    private String imagepathOpacity;


    public boolean getStatusTile() {
        return statusTile;
    }

    TileColor(boolean statusTile, String newName, String newpath, String newpathOpacity) {
        this.statusTile = statusTile;
        this.name = newName;
        this.imagepath = newpath;
        this.imagepathOpacity = newpathOpacity;
    }

    public String getName() {
        return name;
    }

    public String getColorPath() {
        return imagepath;
    }

    public String getColorPathOpacity() {
        return imagepathOpacity;
    }
}