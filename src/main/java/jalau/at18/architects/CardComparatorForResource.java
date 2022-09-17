package jalau.at18.architects;

public class CardComparatorForResource implements Comparator {
    public boolean compare(Card c1, Card c2) {
        return ((c1.getColor() == "Gray" && c2.getColor() == "Yellow")
                || (c1.getColor() == "Yellow" && c2.getColor() == "Gray")
                || (c1.getColor() == "Yellow" && c2.getColor() == "Yellow"));
    }
}
