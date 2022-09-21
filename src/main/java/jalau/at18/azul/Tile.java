package jalau.at18.azul;

import java.util.Objects;

public class Tile {

    private TileColor currentTile;

    public Tile(TileColor color) {
        currentTile = color;
    }

    public void setColor(TileColor newColor) {
        currentTile = newColor;
    }

    public TileColor getColor() {
        return currentTile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tile tile = (Tile) o;
        return Objects.equals(currentTile, tile.currentTile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentTile);
    }
}
