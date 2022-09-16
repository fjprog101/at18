package jalau.at18.architects;

public class GrayCard extends Card {
    private Resource resource;
    private String color;
    public GrayCard(Resource resource) {
        this.color = "Gray";
        this.resource = resource;
    }

    @Override
    String getColor() {
        return color;
    }
    String getResource() {
        return resource.getResource();
    }

}
