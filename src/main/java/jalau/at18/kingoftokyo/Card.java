package jalau.at18.kingoftokyo;

public abstract class Card {
    private String name;
    private int cost;
    protected String description;
    public Card(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
    public Object getName() {
        return name;
    }
    abstract void setDescription();
}
