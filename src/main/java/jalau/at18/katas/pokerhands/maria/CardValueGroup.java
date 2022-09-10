package jalau.at18.katas.pokerhands.maria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CardValueGroup {
    private HashMap<CardValue, Integer> valuesCount;
    private HashMap<Integer, List<CardValue>> countCardsGroup;

    public CardValueGroup(HashMap<CardValue, Integer> valuesCount) {
        this.valuesCount = valuesCount;
    }

    public void initializeGroup() {
        countCardsGroup = new HashMap<>();
        for (Map.Entry<CardValue, Integer> element : valuesCount.entrySet()) {
            CardValue cardValue = element.getKey();
            int count = element.getValue();
            if (!countCardsGroup.containsKey(count)) {
                countCardsGroup.put(count, new ArrayList<>());
            }
            List<CardValue> cardValues = countCardsGroup.get(count);
            cardValues.add(cardValue);
        }
    }

    public List<CardValue> getCardValues(int count) {
        return countCardsGroup.get(count);
    }
}
