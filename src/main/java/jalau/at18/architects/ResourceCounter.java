package jalau.at18.architects;

import java.util.LinkedList;

public class ResourceCounter {
    private LinkedList<String> listOfResources;
    private GrayCard grayCard;

    public ResourceCounter(Resource resource, LinkedList<String> listOfResources) {
        this.grayCard = new GrayCard(resource);
        this.listOfResources = listOfResources;
    }

    public LinkedList<String> getListOfResources() {
        return listOfResources;
    }

    public void addResourceToList() {
        listOfResources.add(grayCard.getResource());
    }

    public boolean traverseTheResourceList() {
        int counter = 0;
        for (String element : listOfResources) {
            boolean sameValue = (listOfResources.get(counter + 1) == element) ? true : false;
            return sameValue;
        }
        return false;
    }

    public void removeResourceFromList() {
        listOfResources.remove();
    }

    public int sizeOfResourceList() {
        return listOfResources.size();
    }
}
