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
        Tile tile = (Tile) o;
        return currentTile == tile.currentTile;
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentTile);
    }

}
