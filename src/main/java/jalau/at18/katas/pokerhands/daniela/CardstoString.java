package jalau.at18.katas.pokerhands.daniela;

import java.util.ArrayList;
import java.util.List;

public class CardstoString {

    private StringBuilder totaldigits = new StringBuilder();
    private List<CardValue> sortedCards;

    public CardstoString() {
        sortedCards = new ArrayList<CardValue>();
    }

    public void add(CardValue cardValue) {
        totaldigits.append(cardValue.getScore(cardValue));
    }

    public String get(CardValue cardValue) {
        return totaldigits.toString();
    }

    public int highCard(CardValue cardValuefinal) {
        String sorted = get(cardValuefinal);
        String[] arrOfStr = sorted.split("");
        int tiebreaker = 0;
        for (String cards : arrOfStr) {
            tiebreaker += Integer.parseInt(cards);
        }
        return tiebreaker;
    }
}
