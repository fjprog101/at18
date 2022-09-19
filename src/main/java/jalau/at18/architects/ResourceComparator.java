package jalau.at18.architects;

public class ResourceComparator implements Comparator {
    private ResourceCounter resourceCounter;

    public ResourceComparator(ResourceCounter resourceCounter) {
        this.resourceCounter = resourceCounter;
    }

    public boolean compare(Card cardOne, Card cardTwo) {
        return resourceCounter.traverseTheResourceList();
    }
}
