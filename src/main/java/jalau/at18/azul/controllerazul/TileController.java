package jalau.at18.azul.controllerazul;

import jalau.at18.azul.model.BagSender;
import jalau.at18.azul.model.CenterTileBoard;
import jalau.at18.azul.model.Floor;
//import jalau.at18.azul.model.PyramidMovements;
import jalau.at18.azul.model.Tile;
import jalau.at18.azul.view.CenterButtons;
import jalau.at18.azul.view.FactoryButtonGroup;
import jalau.at18.azul.view.FactoryPanel;
import jalau.at18.azul.view.PlayerPanel;
import jalau.at18.azul.view.GameP1;
import jalau.at18.azul.view.GameP2;

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
    private GameP1 gamePlayer1;
    private GameP2 gamePlayer2;

    public TileController(FactoryPanel panel, BagSender newValues, PlayerPanel newPlayer1, PlayerPanel newPlayer2,
        CenterButtons newCenter, CenterTileBoard centernew, Floor floortiles) {
        this.factoryPanel = panel;
        this.gameAzul = newValues;
        this.player1 = newPlayer1;
        this.player2 = newPlayer2;
        this.center = newCenter;
        this.firstplayer = centernew;
     //   this.floorT = floortiles;
        this.gamePlayer1 = new GameP1(player1);
        this.gamePlayer2 = new GameP2(player2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int index = 0; index < NUMBER_OF_FACTORIES; index++) {
            List<Tile> game = gameAzul.getFactoryGroup();
            FactoryButtonGroup factoryButtons = (FactoryButtonGroup) factoryPanel.getComponent(index + FIRST_INDEX_FACTORY_COMPONENT);
            if (factoryButtons.isFactoryEmpty() && center.isCenterEmpty()) {
                gamePlayer1.player(index, PYRAMID_INDEX, player1);
                gamePlayer2.player(index, PYRAMID_INDEX, player2);
                factoryButtons.updateButtonGroup(game);
                gameAzul.removeTiles();
            }
        }
        cleanPyramidandFloor();
    }

    public void cleanPyramidandFloor() {
        center.updateCenterButtons(firstplayer.addFirstPlayer());
        player1.getfloor().clear();
        player2.getfloor().clear();
        player1.getfloorButtonGroup().clearFloorTiles();
        player2.getfloorButtonGroup().clearFloorTiles();
    }
}
