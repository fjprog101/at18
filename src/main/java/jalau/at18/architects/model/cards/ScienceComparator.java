package jalau.at18.architects.model.cards;

public class ScienceComparator implements Comparator {
    public boolean compare(Card cardOne, Card cardTwo) {
        ScienceList scienceList = new ScienceList();
        scienceList.addElementToList((GreenCard) cardOne);
        scienceList.addElementToList((GreenCard) cardTwo);
        return scienceList.traverseTheScienceElementsList();
    }
}
