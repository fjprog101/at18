package jalau.at18.katas.pokerhands.adriana;

import java.util.ArrayList;
import java.util.HashMap;

public class PairsCount {
    private PokerHand hand;
    private ArrayList<CardValue> arrayPairs;
    public PairsCount(PokerHand hand) {
        this.hand = hand;
        arrayPairs = new ArrayList<CardValue>();
        addPairs();
    }

    public int get() {
        return arrayPairs.size();
    }

    public void addPairs() {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        HashMap<CardValue, Integer> counterValues = count.getValuesCount();
        for (CardValue card : counterValues.keySet()) {
            if (counterValues.get(card) == 2) {
                arrayPairs.add(card);
            }
        }
    }
    public ArrayList<CardValue> getArrayPairs() {
        return arrayPairs;
    }

}
