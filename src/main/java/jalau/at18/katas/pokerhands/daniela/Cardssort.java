package jalau.at18.katas.pokerhands.daniela;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CardsSort {
    private CardsSortedFinal finalcards = new CardsSortedFinal();

    public Card[] sortCards(Card[] cards) {
        ArrayList<Card> cardsorted = new ArrayList<>();
        cardsorted = finalcards.addcardstoArray(cardsorted, cards);
        Collections.sort(cardsorted, new Comparator<Card>() {
            @Override
            public int compare(Card card1, Card card2) {
                return card1.getValue().compareTo(card2.getValue());
            }
        });
        return getCardsArray(cardsorted);
    }

    private Card[] getCardsArray(ArrayList<Card> cards) {
        Card[] ascendingcards = new Card[cards.size()];
        for (int index = 1; index <= cards.size(); index++) {
            ascendingcards[index - 1] = cards.get(cards.size() - index);
        }
        return ascendingcards;
    }

}
