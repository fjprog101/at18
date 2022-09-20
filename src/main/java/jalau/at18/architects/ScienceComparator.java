package jalau.at18.architects;

public class ScienceComparator implements Comparator {
    private ScienceCounter scienceCounter;

    public ScienceComparator(ScienceCounter scienceCounter) {
        this.scienceCounter = scienceCounter;
    }

    public boolean compare(Card cardOne, Card cardTwo) {
        return scienceCounter.traverseTheScienceElementsList();
    }
}
