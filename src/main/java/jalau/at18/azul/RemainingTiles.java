package jalau.at18.azul;

import java.util.ArrayList;
import java.util.List;

public class RemainingTiles {

    private List<Character> boxWithRemainingTiles;

    public RemainingTiles() {
        this.boxWithRemainingTiles = new ArrayList<>();
    }

    public void addTiles(List<Character> remainingTiles) {
        boxWithRemainingTiles.addAll(remainingTiles);
    }

    public List<Character> getRemainingTiles() {
        return boxWithRemainingTiles;
    }

    public void removeTiles() {
        boxWithRemainingTiles.clear();
    }

}
