package jalau.at18.kingoftokyo.model;

import java.util.ArrayList;
import java.util.List;

public class DiceFaceKeeper {
    private List<DiceFace> keepListDiceFace;

    public DiceFaceKeeper() {
        this.keepListDiceFace = new ArrayList<>();
    }

    public void saveListDiceFace(List<DiceFace> savePlayerListDiceFace) {
        keepListDiceFace.addAll(savePlayerListDiceFace);
    }

    public void saveDiceFace(DiceFace savePlayerDiceFace) {
        keepListDiceFace.add(savePlayerDiceFace);
    }

    public List<DiceFace> getListDiceFaceKeeper() {
        return keepListDiceFace;
    }
}
