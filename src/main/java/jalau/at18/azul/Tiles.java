package jalau.at18.azul;

public enum Tiles {

    RED('R'),
    YELLOW('Y'),
    DARK('D'),
    BLUE('B'),
    WHITE('W');

    private char value;

    Tiles(char value) {
        this.value = value;
    }

    public char getTileColor() {
        return value;
    }
}
