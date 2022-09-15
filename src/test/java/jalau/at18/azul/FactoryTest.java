package jalau.at18.azul;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FactoryTest {

    @Test
    public void shouldHaveTiles() {
        List<Tile> tiles = new ArrayList<>(){
            {
                add(Tile.RED);
                add(Tile.DARK);
                add(Tile.BLUE);
                add(Tile.BLUE);
            }
        };
        Factory factory = new Factory(tiles);
        assertNotNull(factory.getTiles());
    }

    @Test
    public void shouldRemoveTiles() {
        List<Tile> tiles = new ArrayList<>(){
            {
                add(Tile.RED);
                add(Tile.DARK);
                add(Tile.WHITE);
                add(Tile.DARK);
            }
        };

        List<Tile> factoryWithoutTilesSelected = new ArrayList<>(){
            {
                add(Tile.RED);
                add(Tile.WHITE);
            }
        };
        Factory factory = new Factory(tiles);
        factory.removeTilesSelected(Tile.DARK);
        assertEquals(factoryWithoutTilesSelected, factory.getTiles());
    }

    @Test
    public void shouldCreateListWithTilesSelected() {
        List<Tile> tiles = new ArrayList<>(){
            {
                add(Tile.RED);
                add(Tile.DARK);
                add(Tile.RED);
                add(Tile.DARK);
            }
        };
        List<Tile> listWithtTilesSelected = new ArrayList<>(){
            {
                add(Tile.RED);
                add(Tile.RED);
            }
        };
        Factory factory = new Factory(tiles);
        factory.addTilesSelected(Tile.RED);
        assertEquals(listWithtTilesSelected, factory.getTilesSelected());
    }

}
