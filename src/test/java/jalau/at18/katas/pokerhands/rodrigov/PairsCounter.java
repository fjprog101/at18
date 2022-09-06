package jalau.at18.katas.pokerhands.rodrigov;

import java.util.ArrayList;
import java.util.HashMap;

public class PairsCounter {
    private ArrayList<CardValue> pairsFoundedArray;
    private PokerHand hand;
    public PairsCounter(PokerHand hand){
        this.hand=hand;
        pairsFoundedArray = new ArrayList<CardValue>();
        getPairs();
    }

    public void getPairs(){
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        HashMap<CardValue, Integer> counterValues = count.getValuesCards();
        fillArray(counterValues);
    }
    
    public void fillArray(HashMap<CardValue, Integer> counterValues){
        for (CardValue card : counterValues.keySet()) {
            if (counterValues.get(card) == 2)
                pairsFoundedArray.add(card);
        }
    }

    public int getArraySize(){
        return pairsFoundedArray.size();
    }

    public ArrayList<CardValue> getPairsArray(){
        return pairsFoundedArray;
    }
    
}
