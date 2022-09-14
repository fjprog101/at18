package jalau.at18.kingoftokyo;

import java.util.HashMap;

public class DiceIndentifier {
    private HashMap<DiceFace, Integer> diceCount;

    public DiceIndentifier() {
        this.diceCount = new HashMap<DiceFace, Integer>();
    }
    public void addDiceWithCount(DiceFace diceFace) {
        int existingCount = 0;
        if (diceCount.containsKey(diceFace)) {
            existingCount = getDiceHashMap(diceFace);
        }
        diceCount.put(diceFace, existingCount + 1);
    }

    public int getDiceHashMap(DiceFace diceFace) {
        return diceCount.get(diceFace);
    }

    public HashMap<DiceFace, Integer> getDiceFaceCount() {
        return diceCount;
    }

    public int getCountDiceFace(DiceFace diceFace) {
        return diceCount.get(diceFace);
    }

    public boolean exists(int count) {
        return diceCount.containsValue(count);
    }
}
