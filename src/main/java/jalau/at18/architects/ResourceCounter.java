package jalau.at18.architects;

import java.util.LinkedList;

public class ResourceCounter {
    private LinkedList<String> listOfResources;

    public ResourceCounter(LinkedList<String> listOfResources) {
        this.listOfResources = listOfResources;
    }

    public LinkedList<String> getListOfResources() {
        return listOfResources;
    }

    public void addResourceToList(GrayCard grayCard) {
        listOfResources.add(grayCard.getResource());
    }

    public boolean traverseTheResourceList() {
        boolean sameValue = (listOfResources.getFirst() == listOfResources.getLast()) ? true : false;
        return sameValue;
    }

    public void removeResourceFromList() {
        listOfResources.remove();
    }

    public int sizeOfResourceList() {
        return listOfResources.size();
    }
}
