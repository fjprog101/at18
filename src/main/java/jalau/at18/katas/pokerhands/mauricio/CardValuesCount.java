package jalau.at18.katas.pokerhands.mauricio;

import java.util.LinkedHashMap;

public class CardValuesCount {

    private LinkedHashMap<CardValue, Integer> valuesCount;

    public CardValuesCount() {
        valuesCount = new LinkedHashMap<CardValue, Integer>();
    }

    public void add(CardValue cardValue) {
        int existingCount = 0;
        if (valuesCount.containsKey(cardValue)) {
            existingCount = get(cardValue);
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
