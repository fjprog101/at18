package jalau.at18.architects.model.cards;

enum Resource {
    WATER("Water"),
    WOOD("Wood"),
    STONE("Stone"),
    PAPER("Paper"),
    BRICK("Brick"),
    GOLD("Gold");

    private String resource;

    Resource(String resource) {
        this.resource = resource;
    }

    public String getResource() {
        return resource;
    }
}

