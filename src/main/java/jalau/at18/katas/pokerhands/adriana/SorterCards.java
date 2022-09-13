package jalau.at18.katas.pokerhands.adriana;

import java.util.*;


public class SorterCards {

    public Card[] sortCards(Card[] cards) {
        ArrayList<Card> array = new ArrayList<>();
        array = initArray(array, cards);
        Collections.sort(array, new Comparator<Card>() {
            @Override
            public int compare(Card card1, Card card2) {
                return card1.getValue().compareTo(card2.getValue());
            }
        });
        return getCardsArray(array);
    }
    private Card[] getCardsArray(ArrayList<Card> array) {
        Card[] arrangedCards = new Card[array.size()];
        for (int index = 1; index <= array.size(); index++) {
            arrangedCards[index - 1] = array.get(array.size() - index);
        }
        return arrangedCards;
    }
    public ArrayList<Card> initArray(ArrayList<Card> array, Card[] cards) {
        for (Card card : cards) {
            array.add(card);
        }
        return array;
    }
}
