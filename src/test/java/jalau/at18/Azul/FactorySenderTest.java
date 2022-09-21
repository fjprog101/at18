package jalau.at18.azul;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FactorySenderTest {

    @Test
    public void shouldSendTilesFromFactoryToCenterBoard() {
        CenterTileBoard centerBoard = new CenterTileBoard();
        Factory factory = new Factory();
        List<Tile> tilesFromBag = new ArrayList<>(){
            {
                add(Tile.RED);
                add(Tile.DARK);
                add(Tile.RED);
                add(Tile.DARK);
            }
        };
        centerBoard.add(Tile.FIRST_PLAYER);
        factory.addTilesFromBag(tilesFromBag);
        FactorySender factorySender = new FactorySender(factory, centerBoard);
        factorySender.sendTiles(Tile.RED);
        List<Tile> expectedTilesCenter = new ArrayList<>(){
            {
                add(Tile.FIRST_PLAYER);
                add(Tile.DARK);
                add(Tile.DARK);
            }
        };
        assertEquals(expectedTilesCenter, factorySender.geCenterTileBoard());

        Factory factory2 = new Factory();
        List<Tile> tilesFromBag2 = new ArrayList<>(){
            {
                add(Tile.BLUE);
                add(Tile.BLUE);
                add(Tile.BLUE);
                add(Tile.YELLOW);
            }
        };
        factory2.addTilesFromBag(tilesFromBag2);
        FactorySender factorySender2 = new FactorySender(factory2, centerBoard);
        factorySender2.sendTiles(Tile.BLUE);
        List<Tile> expectedTilesCenter2 = new ArrayList<>(){
            {
                add(Tile.FIRST_PLAYER);
                add(Tile.DARK);
                add(Tile.DARK);
                add(Tile.YELLOW);
            }
        };
        assertEquals(expectedTilesCenter2, factorySender2.geCenterTileBoard());

        Factory factory3 = new Factory();
        List<Tile> tilesFromBag3 = new ArrayList<>(){
            {
                add(Tile.BLUE);
                add(Tile.WHITE);
                add(Tile.DARK);
                add(Tile.YELLOW);
            }
        };
        factory3.addTilesFromBag(tilesFromBag3);
        FactorySender factorySender3 = new FactorySender(factory3, centerBoard);
        factorySender3.sendTiles(Tile.YELLOW);
        List<Tile> expectedTilesCenter3 = new ArrayList<>(){
            {
                add(Tile.FIRST_PLAYER);
                add(Tile.DARK);
                add(Tile.DARK);
                add(Tile.YELLOW);
                add(Tile.BLUE);
                add(Tile.WHITE);
                add(Tile.DARK);
            }
        };
        assertEquals(expectedTilesCenter3, factorySender3.geCenterTileBoard());
    }
}
