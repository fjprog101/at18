package jalau.at18.azul;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FactorySenderToCenterBoardTest {

    @Test
    public void shouldSendTilesFromFactoryToCenterBoard() {
        CenterTileBoard centerBoard = new CenterTileBoard();
        centerBoard.add(Tile.FIRST_PLAYER);
        FactorySenderToCenterBoard senderToCenterBoard = new FactorySenderToCenterBoard(centerBoard);
        List<Tile> tilesToCenter = new ArrayList<>(){
            {
                add(Tile.DARK);
                add(Tile.DARK);
            }
        };
        List<Tile> expectedTilesCenter = new ArrayList<>(){
            {
                add(Tile.FIRST_PLAYER);
                add(Tile.DARK);
                add(Tile.DARK);
            }
        };
        assertEquals(expectedTilesCenter, senderToCenterBoard.sendTilesToCenterBoard(tilesToCenter));

        FactorySenderToCenterBoard senderToCenterBoard2 = new FactorySenderToCenterBoard(centerBoard);
        List<Tile> tilesToCenter2 = new ArrayList<>(){
            {
                add(Tile.WHITE);
                add(Tile.WHITE);
                add(Tile.YELLOW);
            }
        };
        List<Tile> expectedTilesCenter2 = new ArrayList<>(){
            {
                add(Tile.FIRST_PLAYER);
                add(Tile.DARK);
                add(Tile.DARK);
                add(Tile.WHITE);
                add(Tile.WHITE);
                add(Tile.YELLOW);
            }
        };
        assertEquals(expectedTilesCenter2, senderToCenterBoard2.sendTilesToCenterBoard(tilesToCenter2));

        FactorySenderToCenterBoard senderToCenterBoard3 = new FactorySenderToCenterBoard(centerBoard);
        List<Tile> tilesToCenter3 = new ArrayList<>(){
            {
                add(Tile.DARK);
                add(Tile.BLUE);
            }
        };
        List<Tile> expectedTilesCenter3 = new ArrayList<>(){
            {
                add(Tile.FIRST_PLAYER);
                add(Tile.DARK);
                add(Tile.DARK);
                add(Tile.WHITE);
                add(Tile.WHITE);
                add(Tile.YELLOW);
                add(Tile.DARK);
                add(Tile.BLUE);
            }
        };
        assertEquals(expectedTilesCenter3, senderToCenterBoard3.sendTilesToCenterBoard(tilesToCenter3));
    }
}
