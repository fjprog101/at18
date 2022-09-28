package jalau.at18.architects.model.cards;

public class GrayCard extends Card {
    private Resource resource;
    public GrayCard(Resource resource) {
        super("Gray");
        this.resource = resource;
    }

    @Override
    public String getColor() {
        return super.color();
    }
    String getResource() {
        return resource.getResource();
    }

}
