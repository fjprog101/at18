package jalau.at18.azul;
import java.util.*;

public class CenterTileBoard extends ArrayList<Character> {

    public CenterTileBoard removeTilesOfSpecificColor(char color) {
        this.removeAll(Collections.singleton(color));
        return this;
    }

    public CenterTileBoard addTilestoCenter(char tile, int count) {
        for (int position = 0; position < count; ++position) {
            this.add(tile);
        }
        return this;
    }


}
