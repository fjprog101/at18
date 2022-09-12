package jalau.at18.katas.pokerhands.alvaro;
import java.util.HashMap;
public class CardValuesCount {

    private HashMap<CardValue, Integer> valuesCount;
    private int cont = 0;
    public CardValuesCount() {
        valuesCount = new HashMap<CardValue, Integer>();

    }
    public void add(CardValue cardValue) {
        int existingCount = 0;
        if (valuesCount.containsKey(cardValue)) {
            existingCount = get(cardValue);
            cont++;
        }
        valuesCount.put(cardValue, existingCount + 1);
    }
    public int get(CardValue cardValue) {
        return valuesCount.get(cardValue);
    }
    public boolean exists(int count) {
        return valuesCount.containsValue(count);
    }
    public int getCont() {
        return cont;
    }
}
