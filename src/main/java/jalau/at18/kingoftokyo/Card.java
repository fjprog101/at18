package jalau.at18.kingoftokyo;

public abstract class Card {
    protected String name;
    protected String imagePath;
    protected String description;
    protected int cost;

    public Card(String name, int cost, String imagePath) {
        this.name = name;
        this.cost = cost;
        this.imagePath = imagePath;
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

    public String getImagePath() {
        return imagePath;
    }
}
