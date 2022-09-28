package jalau.at18.azul;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FactorySenderToCenterBoardTest {

    @Test
    public void shouldSendTilesFromFactoryToCenterBoard() {
        CenterTileBoard centerBoard = new CenterTileBoard();
        centerBoard.add(new Tile(TileColor.FIRST));
        FactorySenderToCenterBoard senderToCenterBoard = new FactorySenderToCenterBoard(centerBoard);
        List<Tile> tilesToCenter = new ArrayList<>(){
            {
                add(new Tile(TileColor.DARK));
                add(new Tile(TileColor.DARK));
            }
        };
        List<Tile> expectedTilesCenter = new ArrayList<>(){
            {
                add(new Tile(TileColor.FIRST));
                add(new Tile(TileColor.DARK));
                add(new Tile(TileColor.DARK));
            }
        };
        assertEquals(expectedTilesCenter, senderToCenterBoard.sendTilesToCenterBoard(tilesToCenter));

        FactorySenderToCenterBoard senderToCenterBoard2 = new FactorySenderToCenterBoard(centerBoard);
        List<Tile> tilesToCenter2 = new ArrayList<>(){
            {
                add(new Tile(TileColor.WHITE));
                add(new Tile(TileColor.WHITE));
                add(new Tile(TileColor.YELLOW));
            }
        };
        List<Tile> expectedTilesCenter2 = new ArrayList<>(){
            {
                add(new Tile(TileColor.FIRST));
                add(new Tile(TileColor.DARK));
                add(new Tile(TileColor.DARK));
                add(new Tile(TileColor.WHITE));
                add(new Tile(TileColor.WHITE));
                add(new Tile(TileColor.YELLOW));
            }
        };
        assertEquals(expectedTilesCenter2, senderToCenterBoard2.sendTilesToCenterBoard(tilesToCenter2));

        FactorySenderToCenterBoard senderToCenterBoard3 = new FactorySenderToCenterBoard(centerBoard);
        List<Tile> tilesToCenter3 = new ArrayList<>(){
            {
                add(new Tile(TileColor.DARK));
                add(new Tile(TileColor.BLUE));
            }
        };
        List<Tile> expectedTilesCenter3 = new ArrayList<>(){
            {
                add(new Tile(TileColor.FIRST));
                add(new Tile(TileColor.DARK));
                add(new Tile(TileColor.DARK));
                add(new Tile(TileColor.WHITE));
                add(new Tile(TileColor.WHITE));
                add(new Tile(TileColor.YELLOW));
                add(new Tile(TileColor.DARK));
                add(new Tile(TileColor.BLUE));
            }
        };
        assertEquals(expectedTilesCenter3, senderToCenterBoard3.sendTilesToCenterBoard(tilesToCenter3));
    }
}
