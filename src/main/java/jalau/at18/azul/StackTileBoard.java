package jalau.at18.azul;
import java.util.*;

public class StackTileBoard extends ArrayList<Tile> {
    public StackTileBoard removeTilesOfColor(Tile color) {
        this.removeAll(Collections.singleton(color));
        return this;
    }

    public StackTileBoard addTilesToStack(List<Tile> newStackTiles) {
        this.addAll(newStackTiles);
        return this;
    }

    public boolean isItFirstPlayer(){
        List<Tile> first = new ArrayList<>();
        first.add(new Tile(TileColor.FIRST));
        first.add(new Tile(TileColor.EMPTY));
        first.add(new Tile(TileColor.EMPTY));
        first.add(new Tile(TileColor.EMPTY));
        first.add(new Tile(TileColor.EMPTY));
        first.add(new Tile(TileColor.EMPTY));
        if(this == (first)) {
            return true;
        }
        return false;
    }
}
