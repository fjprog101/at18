package jalau.at18.azul;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FactoryTest {

    @Test
    public void shouldHaveTiles() {
        List<Tile> tiles = new ArrayList<>(){
            {
                add(new Tile(TileColor.RED));
                add(new Tile(TileColor.DARK));
                add(new Tile(TileColor.BLUE));
                add(new Tile(TileColor.BLUE));
            }
        };
        Factory factory = new Factory(tiles);
        assertNotNull(factory.getTiles());
    }

    @Test
    public void shouldRemoveTiles() {
        List<Tile> tiles = new ArrayList<>(){
            {
                add(new Tile(TileColor.RED));
                add(new Tile(TileColor.DARK));
                add(new Tile(TileColor.WHITE));
                add(new Tile(TileColor.DARK));
            }
        };

        List<Tile> factoryWithoutTilesSelected = new ArrayList<>(){
            {
                add(new Tile(TileColor.RED));
                add(new Tile(TileColor.WHITE));
            }
        };
        Factory factory = new Factory(tiles);
        factory.removeTilesSelected(new Tile(TileColor.DARK));
        assertEquals(factoryWithoutTilesSelected, factory.getTiles());
    }

    @Test
    public void shouldCreateListWithTilesSelected() {
        List<Tile> tiles = new ArrayList<>(){
            {
                add(new Tile(TileColor.RED));
                add(new Tile(TileColor.DARK));
                add(new Tile(TileColor.RED));
                add(new Tile(TileColor.DARK));
            }
        };
        List<Tile> listWithtTilesSelected = new ArrayList<>(){
            {
                add(new Tile(TileColor.RED));
                add(new Tile(TileColor.RED));
            }
        };
        Factory factory = new Factory(tiles);
        factory.addTilesSelected(new Tile(TileColor.RED));
        assertEquals(listWithtTilesSelected, factory.getTilesSelected());

        Factory factory2 = new Factory(tiles);
        factory.addTilesSelected(new Tile(TileColor.BLUE));
        assertTrue(factory2.getTilesSelected().isEmpty());
    }

}
