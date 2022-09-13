package jalau.at18.azul;

public enum Tiles {
    RED('R'),
    YELLOW('Y'),
    DARK('D'),
    BLUE('B'),
    WHITE('W'),
    FIRST_PLAYER('F');

    private final char colorTile;

    Tiles(char colorTile) {
        this.colorTile = colorTile;
    }

    public char getColor() {
        return colorTile;
    }

}
