package jalau.at18.azul;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Factory {

    private List<Tile> tiles;
    private List<Tile> tilesSelected;

    public Factory(List<Tile> tiles) {
        this.tiles = tiles;
        this.tilesSelected = new ArrayList<>();
    }

    public List<Tile> getTiles() {
        return tiles;
    }

    public List<Tile> getTilesSelected() {
        return tilesSelected;
    }

    public void removeTilesSelected(Tile tileSelected) {
        tiles.removeAll(Collections.singleton(tileSelected));
    }

    public void addTilesSelected(Tile tileSelected) {
        for (int index = 0; index < tiles.size(); index++) {
            if (tileSelected.equals(tiles.get(index))) {
                tilesSelected.add(tiles.get(index));
            }
        }
    }

}
