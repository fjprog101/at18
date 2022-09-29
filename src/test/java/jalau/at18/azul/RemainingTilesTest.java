package jalau.at18.azul;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import jalau.at18.azul.model.RemainingTiles;
import jalau.at18.azul.model.Tile;
import jalau.at18.azul.model.TileColor;

public class RemainingTilesTest {

    @Test
    public void shouldAddTiles() {
        RemainingTiles box = new RemainingTiles();
        List<Tile> remainingTiles = new ArrayList<>(){
            {
                add(new Tile(TileColor.RED));
                add(new Tile(TileColor.DARK));
                add(new Tile(TileColor.BLUE));
            }
        };
        box.addTiles(remainingTiles);
        assertEquals(remainingTiles, box.getRemainingTiles());

        List<Tile> remainingTiles2 = new ArrayList<>(){
            {
                add(new Tile(TileColor.RED));
                add(new Tile(TileColor.DARK));
                add(new Tile(TileColor.BLUE));
                add(new Tile(TileColor.RED));
                add(new Tile(TileColor.DARK));
                add(new Tile(TileColor.BLUE));
            }
        };

        box.addTiles(remainingTiles);
        assertEquals(remainingTiles2, box.getRemainingTiles());
    }

    @Test
    public void shouldRemoveTiles() {
        RemainingTiles box = new RemainingTiles();
        List<Tile> remainingTiles = new ArrayList<>(){
            {
                add(new Tile(TileColor.RED));
                add(new Tile(TileColor.RED));
                add(new Tile(TileColor.YELLOW));
            }
        };
        box.addTiles(remainingTiles);
        assertEquals(remainingTiles, box.getRemainingTiles());

        box.removeTiles();
        assertEquals(0, box.getRemainingTiles().size());

    }

}
