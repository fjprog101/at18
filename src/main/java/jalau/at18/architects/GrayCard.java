package jalau.at18.architects;

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
    public String getResource() {
        return resource.getResource();
    }

}
