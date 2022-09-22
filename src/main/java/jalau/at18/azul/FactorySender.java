package jalau.at18.azul;

public class FactorySender {

    private Factory factory;
    private FactorySenderToPyramid factorySenderToPyramid;
    private FactorySenderToCenterBoard factorySenderToCenterBoard;

    public FactorySender(Factory factory, CenterTileBoard centerBoard) {
        this.factory = factory;
        this.factorySenderToPyramid = new FactorySenderToPyramid();
        this.factorySenderToCenterBoard = new FactorySenderToCenterBoard(centerBoard);
    }

    public void sendTiles(Tile tileSelected) {
        factory.addTilesSelected(tileSelected);
        factorySenderToPyramid.sendTilesToPyramid(factory.getTilesSelected());
        factory.removeTilesSelected(tileSelected);
        factorySenderToCenterBoard.sendTilesToCenterBoard(factory.getTiles());
        factory.getTiles().clear();
    }

    public CenterTileBoard geCenterTileBoard() {
        return factorySenderToCenterBoard.getCenterBoard();
    }

}
