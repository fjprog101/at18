package jalau.at18.katas.pokerhands.daniela;

//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;

public class CardValuesCount {

    private HashMap<CardValue, Integer> valuesCount;

    // private List<CardValue> sortedCards;

    public CardValuesCount() {
        valuesCount = new HashMap<CardValue, Integer>();
        // sortedCards = new ArrayList<CardValue>();
    }

    public void add(CardValue cardValue) {
        int existingCount = 0;
        if (valuesCount.containsKey(cardValue)) {
            existingCount = get(cardValue);
            // sortedCards.add(cardValue);
        }
        valuesCount.put(cardValue, existingCount + 1);
    }

    public int get(CardValue cardValue) {
        return valuesCount.get(cardValue);
    }

    public boolean exists(int count) {
        return valuesCount.containsValue(count);
    }

}