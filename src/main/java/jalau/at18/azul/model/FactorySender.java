package jalau.at18.azul.model;

public class FactorySender {

    private Factory factory;
    private FactorySenderToCenterBoard factorySenderToCenterBoard;

    public FactorySender(Factory factory, CenterTileBoard centerBoard) {
        this.factory = factory;
        this.factorySenderToCenterBoard = new FactorySenderToCenterBoard(centerBoard);
    }

    public void sendTiles(Tile tileSelected) {
        factory.addTilesSelected(tileSelected);
        factory.removeTilesSelected(tileSelected);
        factorySenderToCenterBoard.sendTilesToCenterBoard(factory.getTiles());
        factory.getTiles().clear();
    }

    public CenterTileBoard geCenterTileBoard() {
        return factorySenderToCenterBoard.getCenterBoard();
    }

}
