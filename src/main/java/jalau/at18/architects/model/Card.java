package jalau.at18.architects.model;

public abstract class Card {
    protected String color;

    public Card(String color) {
        this.color = color;
    }

    public String color() {
        return color;
    }

    abstract String getColor();
}