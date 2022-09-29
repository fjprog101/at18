package jalau.at18.azul.model;

import java.util.List;

public class FactorySenderToCenterBoard {

    private CenterTileBoard centerBoard;

    public FactorySenderToCenterBoard(CenterTileBoard center) {
        this.centerBoard = center;
    }

    public CenterTileBoard sendTilesToCenterBoard(List<Tile> tilesToCenter) {
        centerBoard.addTilestoCenter(tilesToCenter);
        return centerBoard;
    }

    public CenterTileBoard getCenterBoard() {
        return centerBoard;
    }
}
