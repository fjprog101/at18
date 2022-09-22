package jalau.at18.architects.model;

public class CardComparatorForResource implements Comparator {
    private final String gray = "Gray";
    private final String yellow = "Yellow";

    public boolean compare(Card cardOne, Card cardTwo) {
        return ((cardOne.getColor() == gray && cardTwo.getColor() == yellow)
                || (cardOne.getColor() == yellow && cardTwo.getColor() == gray)
                || (cardOne.getColor() == yellow && cardTwo.getColor() == yellow));
    }
}
