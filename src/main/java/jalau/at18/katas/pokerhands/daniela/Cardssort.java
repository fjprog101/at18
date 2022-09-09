package jalau.at18.katas.pokerhands.daniela;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cardssort extends Cardssortedfinal {
    public Card[] sortCards(Card[] cards) {
        ArrayList<Card> cardssorted = new ArrayList<>();
        cardssorted = addcardstoArray(cardssorted, cards);
        Collections.sort(cardssorted, new Comparator<Card>() {
            @Override
            public int compare(Card card1, Card card2) {
                return card1.getValue().compareTo(card2.getValue()); // we compare two cards to determine the order
            }
        });
        return getCardsArray(cardssorted);
    }

    private Card[] getCardsArray(ArrayList<Card> cards) {
        Card[] ascendingcards = new Card[cards.size()];
        for (int index = 1; index <= cards.size(); index++) {
            ascendingcards[index - 1] = cards.get(cards.size() - index);
        }
        /*
         * for (int index = 0; areSameSuit && index < hand.getCards().length - 1;
         * index++) {
         * areSameSuit = comparer.haveSameSuit(hand.getCards()[index],
         * hand.getCards()[index + 1]);
         * }
         */
        return ascendingcards;
    }

}
