package jalau.at18.azul;
import java.util.*;

public class CenterTileBoard extends ArrayList<Tile> {

    public CenterTileBoard removeTilesOfSpecificColor(Tile color) {
        this.removeAll(Collections.singleton(color));
        return this;
    }

    public CenterTileBoard addTilestoCenter(List<Tile> newCenterTiles) {
        this.addAll(newCenterTiles);
        return this;
    }


}
