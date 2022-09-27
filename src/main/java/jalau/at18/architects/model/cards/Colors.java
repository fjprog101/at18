package jalau.at18.architects.model.cards;

public enum Colors {
    RED(1, "Red"),
    YELLOW(2, "Yellow"),
    GREEN(3, "Green"),
    BLUE(4, "Blue"),
    GRAY(5, "Gray");

    private int numberIdentifier;
    private String color;
    Colors(int numberIdentifier, String color) {
        this.color = color;
    }

    public int getNumberIdentifier() {
        return numberIdentifier;
    }
    public String getColor() {
        return color;
    }
}
