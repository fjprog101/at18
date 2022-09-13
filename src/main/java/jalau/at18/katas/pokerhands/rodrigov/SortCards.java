package jalau.at18.katas.pokerhands.rodrigov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortCards {
    private CardListSorted cardListSorted = new CardListSorted();
    public Card[] sortCards(Card[] cards) {
        ArrayList<Card> cardsSort = new ArrayList<>();
        cardsSort = cardListSorted.addCardsArray(cardsSort, cards);
        sortingCardsCollections(cardsSort);
        return getCards(cardsSort);
    }

    public void sortingCardsCollections(ArrayList<Card> cardsSort) {
        Collections.sort(cardsSort, new Comparator<Card>() {
            @Override
            public int compare(Card firsrCard, Card secondCard) {
                return firsrCard.getValue().compareTo(secondCard.getValue());
            }
        });
    }

    public Card[] getCards(ArrayList<Card> cards) {
        Card[] sortedCards = new Card[cards.size()];
        for (int index = 0; index < sortedCards.length; index++) {
            sortedCards[index - 1] = cards.get(cards.size() - index);
        }
        return sortedCards;
    }
}