package jalau.at18.azul.controllerazul;

import jalau.at18.azul.model.BagSender;
import jalau.at18.azul.model.CenterTileBoard;
import jalau.at18.azul.model.Floor;
import jalau.at18.azul.model.PyramidMovements;
import jalau.at18.azul.model.Tile;
import jalau.at18.azul.model.TileColor;
import jalau.at18.azul.view.CenterButtons;
import jalau.at18.azul.view.FactoryButtonGroup;
import jalau.at18.azul.view.FactoryPanel;
import jalau.at18.azul.view.PlayerPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TileController implements ActionListener {

    private static final int NUMBER_OF_FACTORIES = 5;
    private static final int FIRST_INDEX_FACTORY_COMPONENT = 2;
    private static final int PYRAMID_INDEX = 4;
    private FactoryPanel factoryPanel;
    private BagSender gameAzul;
    private PlayerPanel player1;
    private PlayerPanel player2;
    private CenterButtons center;
    private CenterTileBoard firstplayer;
    private int deductionP1 = 0;
    private int deductionP2 = 0;
    private int scoreP1 = 0;
    private int scoreP2 = 0;
    private PyramidMovements movements;
    private PyramidMovements movements2;
    private Floor floorT;
    //private WinnerLabel winner;
    public TileController(FactoryPanel panel, BagSender newValues, PlayerPanel newPlayer1, PlayerPanel newPlayer2,
        CenterButtons newCenter, CenterTileBoard centernew, Floor floortiles) {
        this.factoryPanel = panel;
        this.gameAzul = newValues;
        this.player1 = newPlayer1;
        this.player2 = newPlayer2;
        this.center = newCenter;
        this.firstplayer = centernew;
        this.floorT = floortiles;
        movements = new PyramidMovements(player1.getPyramidBoard());
        movements2 = new PyramidMovements(player2.getPyramidBoard());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int index = 0; index < NUMBER_OF_FACTORIES; index++) {
            List<Tile> game = gameAzul.getFactoryGroup();
            FactoryButtonGroup factoryButtons = (FactoryButtonGroup) factoryPanel.getComponent(index + FIRST_INDEX_FACTORY_COMPONENT);
            if (factoryButtons.isFactoryEmpty() && center.isCenterEmpty()) {
                if (movements.countEmptyPyramidTiles(index) == 0) {
                    Tile tileSelected = new Tile(TileColor.valueOf(player1.getPyramidBoard().getTileButton()[index][PYRAMID_INDEX].getTileValue()));
                    player1.getWallBoard().verifyTileWall(index, tileSelected);
                    movements.cleanPyramid(index);
                    deductionP1 = (player1.getfloor()).pointsDeducted();
                    scoreP1++;
                    player1.getScore().updateLabel(scoreP1 - deductionP1, 1);
                    if (player1.getWallBoard().verifyRowWall(index)) {
                        System.out.println("winner is player1");
                    }
                }
                if (movements2.countEmptyPyramidTiles(index) == 0) {
                    Tile tileSelected = new Tile(TileColor.valueOf(player2.getPyramidBoard().getTileButton()[index][PYRAMID_INDEX].getTileValue()));
                    player2.getWallBoard().verifyTileWall(index, tileSelected);
                    movements2.cleanPyramid(index);
                    deductionP2 = (player2.getfloor()).pointsDeducted();
                    scoreP2++;
                    player2.getScore().updateLabel(scoreP2 - deductionP2, 2);
                    if (player2.getWallBoard().verifyRowWall(index)) {
                        System.out.println("winner is player2");
                    }
                }
                factoryButtons.updateButtonGroup(game);
                gameAzul.removeTiles();
            }
        }
        center.updateCenterButtons(firstplayer.addFirstPlayer());
        player1.getfloor().clear();
        player1.getfloorButtonGroup().clearFloorTiles();
        player2.getfloorButtonGroup().clearFloorTiles();
    }
}
