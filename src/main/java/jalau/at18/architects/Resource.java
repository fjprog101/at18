package jalau.at18.architects;

enum Resource {
    WATER("Water"),
    WOOD("Wood"),
    STONE("Stone"),
    PAPER("Paper"),
    BRICK("Brick");

    private String resource;

    Resource(String resource) {
        this.resource = resource;
    }

    public String getResource() {
        return resource;
    }
}
