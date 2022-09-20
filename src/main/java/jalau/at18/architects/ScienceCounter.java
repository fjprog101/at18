package jalau.at18.architects;

import java.util.LinkedList;

public class ScienceCounter {
    private LinkedList<String> listOfScienceElements;

    public ScienceCounter(LinkedList<String> listOfScienceElements) {
        this.listOfScienceElements = listOfScienceElements;
    }

    public LinkedList<String> getListOfScienceElements() {
        return listOfScienceElements;
    }

    public void addElementToList(GreenCard greenCard) {
        listOfScienceElements.add(greenCard.getSymbol());
    }

    public boolean traverseTheScienceElementsList() {
        boolean sameValue = (listOfScienceElements.getFirst() == listOfScienceElements.getLast()) ? true : false;
        return sameValue;
    }

    public void removeElementFromList() {
        listOfScienceElements.remove();
    }

    public int sizeOfScienceELementsList() {
        return listOfScienceElements.size();
    }
}
