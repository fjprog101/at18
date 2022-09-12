package jalau.at18.katas.pokerhands.daniela;

import java.util.ArrayList;

public class CardsSortedFinal {

    public ArrayList<Card> addcardstoArray(ArrayList<Card> array, Card[] cards) {
        for (Card card : cards) {
            array.add(card);
        }
        return array;
    }
}
