package jalau.at18.architects.model.cards;

public abstract class Card {
    protected String color;

    public Card(String color) {
        this.color = color;
    }

    public String color() {
        return color;
    }

    public abstract String getColor();
}
