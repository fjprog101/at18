package jalau.at18.kingoftokyo;

import java.util.HashMap;

public class DiceFaceIdentifier {
    private HashMap<DiceFace, Integer> diceCount;

    public DiceFaceIdentifier() {
        this.diceCount = new HashMap<>();
    }
    public void addDiceFaceWithCount(DiceFace diceFace) {
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
