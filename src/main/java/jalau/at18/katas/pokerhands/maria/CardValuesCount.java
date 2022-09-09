package jalau.at18.katas.pokerhands.maria;

import java.util.HashMap;
import java.util.Map;

public class CardValuesCount {

    private HashMap<CardValue, Integer> valuesCount;
    private HashMap<Integer, CardValue> invertData;

    public CardValuesCount() {
        valuesCount = new HashMap<CardValue, Integer>();
    }

    public void add(CardValue cardValue) {
        int existingCount = 0;
        if (valuesCount.containsKey(cardValue)) {
            existingCount = get(cardValue);
        }
        valuesCount.put(cardValue, existingCount + 1);
    }

    public void invertMap() {
        invertData = new HashMap<>();
        for (Map.Entry<CardValue, Integer> element : valuesCount.entrySet()) {
            invertData.put(element.getValue(), element.getKey());
        }
    }

    public int get(CardValue cardValue) {
        return valuesCount.get(cardValue);
    }

    public boolean exists(int count) {
        return valuesCount.containsValue(count);
    }

    public int getSize() {
        return valuesCount.size();
    }

    public boolean existCountKeyInvertData(int count) {
        return invertData.containsKey(count);
    }

    public CardValue getCardValueInvertData(int count) {
        return invertData.get(count);
    }
}
