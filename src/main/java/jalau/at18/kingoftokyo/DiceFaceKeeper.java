package jalau.at18.kingoftokyo;

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

    public List<DiceFace> getListDiceFaceKeeper() {
        return keepListDiceFace;
    }
}
