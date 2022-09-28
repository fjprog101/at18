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
    public List<Tile> selectedTilesList(Tile color) {
        List<Tile> selectedTiles = new ArrayList<Tile>();
        int occurrences = Collections.frequency(this, color);
        for (int index = 0; index < occurrences; index++) {
            selectedTiles.add(color);
        }
        return selectedTiles;
    }

    public CenterTileBoard addFirstPlayer() {
        this.add(new Tile(TileColor.FIRST));
        return this;
    }
}
