package jalau.at18.architects.model;

public class ResourceComparator implements Comparator {
    public boolean compare(Card cardOne, Card cardTwo) {
        ResourceList resourceList = new ResourceList();
        resourceList.addResourceToList((GrayCard) cardOne);
        resourceList.addResourceToList((GrayCard) cardTwo);
        return resourceList.traverseTheResourceList();
    }
}
