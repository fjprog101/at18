package jalau.at18.katas.pokerhands.libertad;

import java.util.Comparator;

public class CardOrder implements Comparator<Card> {
    @Override
    public int compare(Card c1, Card c2) {
        int result;
        result = (c1.getValue().getIntValue() > c2.getValue().getIntValue()) ? 1
                : ((c1.getValue().getIntValue() < c2.getValue().getIntValue()) ? -1
                : 0);
        return result;
    }
}
