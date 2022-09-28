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
                add(new Tile(TileColor.RED));
                add(new Tile(TileColor.DARK));
                add(new Tile(TileColor.RED));
                add(new Tile(TileColor.DARK));
            }
        };
        centerBoard.add(new Tile(TileColor.FIRST));
        factory.addTilesFromBag(tilesFromBag);
        FactorySender factorySender = new FactorySender(factory, centerBoard);
        factorySender.sendTiles(new Tile(TileColor.RED));
        List<Tile> expectedTilesCenter = new ArrayList<>(){
            {
                add(new Tile(TileColor.FIRST));
                add(new Tile(TileColor.DARK));
                add(new Tile(TileColor.DARK));
            }
        };
        assertEquals(expectedTilesCenter, factorySender.geCenterTileBoard());

        Factory factory2 = new Factory();
        List<Tile> tilesFromBag2 = new ArrayList<>(){
            {
                add(new Tile(TileColor.BLUE));
                add(new Tile(TileColor.BLUE));
                add(new Tile(TileColor.BLUE));
                add(new Tile(TileColor.YELLOW));
            }
        };
        factory2.addTilesFromBag(tilesFromBag2);
        FactorySender factorySender2 = new FactorySender(factory2, centerBoard);
        factorySender2.sendTiles(new Tile(TileColor.BLUE));
        List<Tile> expectedTilesCenter2 = new ArrayList<>(){
            {
                add(new Tile(TileColor.FIRST));
                add(new Tile(TileColor.DARK));
                add(new Tile(TileColor.DARK));
                add(new Tile(TileColor.YELLOW));
            }
        };
        assertEquals(expectedTilesCenter2, factorySender2.geCenterTileBoard());

        Factory factory3 = new Factory();
        List<Tile> tilesFromBag3 = new ArrayList<>(){
            {
                add(new Tile(TileColor.BLUE));
                add(new Tile(TileColor.WHITE));
                add(new Tile(TileColor.DARK));
                add(new Tile(TileColor.YELLOW));
            }
        };
        factory3.addTilesFromBag(tilesFromBag3);
        FactorySender factorySender3 = new FactorySender(factory3, centerBoard);
        factorySender3.sendTiles(new Tile(TileColor.YELLOW));
        List<Tile> expectedTilesCenter3 = new ArrayList<>(){
            {
                add(new Tile(TileColor.FIRST));
                add(new Tile(TileColor.DARK));
                add(new Tile(TileColor.DARK));
                add(new Tile(TileColor.YELLOW));
                add(new Tile(TileColor.BLUE));
                add(new Tile(TileColor.WHITE));
                add(new Tile(TileColor.DARK));
            }
        };
        assertEquals(expectedTilesCenter3, factorySender3.geCenterTileBoard());
    }
}
