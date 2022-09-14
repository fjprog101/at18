package jalau.at18.kingoftokyo;

public abstract class Card {
    protected String name;
    protected String description;

    public Card(String name) {
        this.name = name;
    }

    public Object getName() {
        return name;
    }

    abstract String setDescription();
}
