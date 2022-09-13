package jalau.at18.azul;

import java.util.List;

public class Factory {

    private List<Character> tiles;

    public Factory(List<Character> tiles) {
        this.tiles = tiles;
    }

    public List<Character> getTiles() {
        return tiles;
    }

    public int getNumberTiles() {
        return tiles.size();
    }

}
