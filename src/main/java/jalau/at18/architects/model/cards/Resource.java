package jalau.at18.architects.model.cards;

public enum Resource {
    WATER("water.png", "Water"),
    WOOD("wood.png", "Wood"),
    STONE("rock.png", "Stone"),
    PAPER("papiro.png", "Paper"),
    BRICK("ladrillo.png", "Brick"),
    GOLD("gold.png", "Gold");

    private String resource;
    private String image;

    Resource(String image, String resource) {
        this.image = image;
        this.resource = resource;
    }

    public String getResource() {
        return resource;
    }

    public String getImage() {
        return image;
    }
}
