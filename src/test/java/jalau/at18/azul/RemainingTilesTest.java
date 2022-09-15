package jalau.at18.azul;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RemainingTilesTest {

    @Test
    public void shouldAddTiles() {
        RemainingTiles box = new RemainingTiles();
        List<Tile> remainingTiles = new ArrayList<>(){
            {
                add(Tile.RED);
                add(Tile.DARK);
                add(Tile.BLUE);
            }
        };
        box.addTiles(remainingTiles);
        assertEquals(remainingTiles, box.getRemainingTiles());

        List<Tile> remainingTiles2 = new ArrayList<>(){
            {
                add(Tile.RED);
                add(Tile.DARK);
                add(Tile.BLUE);
                add(Tile.RED);
                add(Tile.DARK);
                add(Tile.BLUE);
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
                add(Tile.RED);
                add(Tile.RED);
                add(Tile.YELLOW);
            }
        };
        box.addTiles(remainingTiles);
        assertEquals(remainingTiles, box.getRemainingTiles());

        box.removeTiles();
        assertEquals(0, box.getRemainingTiles().size());

    }

}
