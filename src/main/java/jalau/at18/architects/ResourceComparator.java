package jalau.at18.architects;

public class ResourceComparator implements Comparator {
    private ResourceCounter resourceCounter;

    public ResourceComparator(ResourceCounter resourceCounter) {
        this.resourceCounter = resourceCounter;
    }

    public boolean comparer(Card c1, Card c2) {
        Boolean wildCardCase = ((c1.getColor() == "Gray" && c2.getColor() == "Yellow")
                || (c1.getColor() == "Yellow" && c2.getColor() == "Gray")) ? true : false;
        return wildCardCase || resourceCounter.traverseTheResourceList();
    }
}
