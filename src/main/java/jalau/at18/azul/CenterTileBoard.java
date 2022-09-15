package jalau.at18.azul;
import java.util.*;

public class CenterTileBoard extends ArrayList<Tile> {

    public CenterTileBoard removeTilesOfSpecificColor(Tile color) {
        this.removeAll(Collections.singleton(color));
        return this;
    }

    public CenterTileBoard addTilestoCenter(Tile tile, int count) {
        for (int position = 0; position < count; ++position) {
            this.add(tile);
        }
        return this;
    }


}
