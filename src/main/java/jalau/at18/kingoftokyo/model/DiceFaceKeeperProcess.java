package jalau.at18.kingoftokyo.model;

import java.util.HashMap;

public class DiceFaceKeeperProcess {
    private DiceFaceKeeper diceFaceKeeper;
    private HashMap<DiceFace, Integer> diceFaceCount;

    public DiceFaceKeeperProcess(DiceFaceKeeper diceFaceKeeper) {
        this.diceFaceKeeper = diceFaceKeeper;
        diceFaceCount = new HashMap<>();
    }

    public HashMap<DiceFace, Integer> countDiceFace() {
        for (DiceFace diceFace : diceFaceKeeper.getListDiceFaceKeeper()) {
            sumCountDiceFace(diceFace);
        }
        return getDiceFaceCount();
    }

    private void sumCountDiceFace(DiceFace diceFace) {
        int existingCount = 0;
        if (diceFaceCount.containsKey(diceFace)) {
            existingCount = getDiceFaceHashMap(diceFace);
        }
        diceFaceCount.put(diceFace, existingCount + 1);
    }

    private HashMap<DiceFace, Integer> getDiceFaceCount() {
        return diceFaceCount;
    }

    private int getDiceFaceHashMap(DiceFace diceFace) {
        return diceFaceCount.get(diceFace);
    }
}
