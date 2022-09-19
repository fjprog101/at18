package jalau.at18.architects;

public class CardComparatorForResource implements Comparator {
    final String GRAY = "Gray";
    final String YELLOW = "Yellow";

    public boolean compare(Card c1, Card c2) {
        return ((c1.getColor() == GRAY && c2.getColor() == YELLOW)
                || (c1.getColor() == YELLOW && c2.getColor() == GRAY)
                || (c1.getColor() == YELLOW && c2.getColor() == YELLOW));
    }
}
