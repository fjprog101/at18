package jalau.at18.katas.pokerhands.rodrigov;

import java.util.ArrayList;

public class CardListSorted {
    public ArrayList<Card> addCardsArray(ArrayList<Card> arrayList, Card[] cards) {
        for (Card card : cards) {
            arrayList.add(card);
        }
        return arrayList;
    }
}
