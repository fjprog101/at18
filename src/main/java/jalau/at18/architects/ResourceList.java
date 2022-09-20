package jalau.at18.architects;

import java.util.LinkedList;

public class ResourceList {
    private LinkedList<String> listOfResources;

    public ResourceList() {
        this.listOfResources = new LinkedList<>();
    }

    public LinkedList<String> getListOfResources() {
        return listOfResources;
    }

    public void addResourceToList(GrayCard grayCard) {
        listOfResources.add(grayCard.getResource());
    }

    public boolean traverseTheResourceList() {
        return listOfResources.getFirst() == listOfResources.getLast();
    }

    public void removeResourceFromList() {
        listOfResources.remove();
    }

    public int sizeOfResourceList() {
        return listOfResources.size();
    }
}