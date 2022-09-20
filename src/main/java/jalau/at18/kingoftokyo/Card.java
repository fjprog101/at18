package jalau.at18.kingoftokyo;

public abstract class Card {
    protected String name;
    protected String description;
    protected int cost;

    public Card(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }
}
