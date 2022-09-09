package jalau.at18.katas.pokerhands.daniela;

import java.util.ArrayList;

public class Cardssortedfinal {

    // As same as countvaluescounter we add only the cards to the list array
    public ArrayList<Card> addcardstoArray(ArrayList<Card> array, Card[] cards) {
        for (Card card : cards) {
            array.add(card);
        }
        return array;
    }
}
