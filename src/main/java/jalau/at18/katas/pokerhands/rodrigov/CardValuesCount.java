package jalau.at18.katas.pokerhands.rodrigov;

import java.util.HashMap;

public class CardValuesCount {

    private HashMap<CardValue, Integer> valuesCount;

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

    public HashMap<CardValue, Integer> getValuesCards() {
        return valuesCount;
    }

    public int get(CardValue cardValue) {
        return valuesCount.get(cardValue);
    }

    public boolean exists(int count) {
        return valuesCount.containsValue(count);
    }

    public int getGroupOfSize() {
        return valuesCount.size();
    }

    /*public int getBiggestSize() {
        int max = 0;
        for (HashMap.Entry<CardValue, Integer> pair: valuesCount.entrySet()) {
            max = comparator.getHighest(pair.getValue().intValue(), max);
        }
        return max;
    }*/
}
