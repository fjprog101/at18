package jalau.at18.architects.model;

import java.util.LinkedList;

public class ScienceList {
    private LinkedList<String> listOfScienceElements;

    public ScienceList() {
        this.listOfScienceElements = new LinkedList<>();
    }

    public LinkedList<String> getListOfScienceElements() {
        return listOfScienceElements;
    }

    public void addElementToList(GreenCard greenCard) {
        listOfScienceElements.add(greenCard.getSymbol());
    }

    public boolean traverseTheScienceElementsList() {
        return listOfScienceElements.getFirst() == listOfScienceElements.getLast();
    }

    public void removeElementFromList() {
        listOfScienceElements.remove();
    }

    public int sizeOfScienceELementsList() {
        return listOfScienceElements.size();
    }
}
