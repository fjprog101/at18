package jalau.at18.azul.model;

import java.util.ArrayList;
import java.util.List;

public class RemainingTiles {

    private List<Tile> boxWithRemainingTiles;

    public RemainingTiles() {
        this.boxWithRemainingTiles = new ArrayList<>();
    }

    public void addTiles(List<Tile> remainingTiles) {
        boxWithRemainingTiles.addAll(remainingTiles);
    }

    public List<Tile> getRemainingTiles() {
        return boxWithRemainingTiles;
    }

    public void removeTiles() {
        boxWithRemainingTiles.clear();
    }

}
