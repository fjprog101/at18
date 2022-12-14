package jalau.at18.azul.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Factory {

    private List<Tile> tiles;
    private List<Tile> tilesSelected;

    public Factory() {
        this.tiles = new ArrayList<>();
        this.tilesSelected = new ArrayList<>();
    }

    public void addTilesFromBag(List<Tile> tilesFromBag) {
        this.tiles = tilesFromBag;
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

    public List<Tile> addTilesSelected(Tile tileSelected) {
        for (int index = 0; index < tiles.size(); index++) {
            if (tileSelected.equals(tiles.get(index))) {
                tilesSelected.add(tiles.get(index));
            }
        }
        return tilesSelected;
    }

}
