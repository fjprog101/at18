package jalau.at18.azul;

import java.util.List;

public class FactorySender {

    private Factory factory;
    private CenterTileBoard centerBoard;

    public FactorySender(Factory factory, CenterTileBoard centerBoard) {
        this.factory = factory;
        this.centerBoard = centerBoard;
    }

    public void sendTiles(Tile tileSelected) {
        factory.addTilesSelected(tileSelected);
        //sendTilesToFactory(factory.getTilesSelected());
        factory.removeTilesSelected(tileSelected);
        sendTilesToCenter(factory.getTiles());
        factory.getTiles().clear();
    }

    public Factory getFactory() {
        return factory;
    }

    public CenterTileBoard getCenterBoard() {
        return centerBoard;
    }

    public void sendTilesToCenter(List<Tile> tilesToCenter) {
        centerBoard.addTilestoCenter(tilesToCenter);
    }

}
