package jalau.at18.azul.controllerazul;

import jalau.at18.azul.BagSender;
import jalau.at18.azul.CenterTileBoard;
import jalau.at18.azul.Tile;
import jalau.at18.azul.TileColor;
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
    public TileController(FactoryPanel panel, BagSender newValues, PlayerPanel newPlayer1, PlayerPanel newPlayer2,
        CenterButtons newCenter, CenterTileBoard centernew) {
        this.factoryPanel = panel;
        this.gameAzul = newValues;
        this.player1 = newPlayer1;
        this.player2 = newPlayer2;
        this.center = newCenter;
        this.firstplayer = centernew;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int index = 0; index < NUMBER_OF_FACTORIES; index++) {
            List<Tile> game = gameAzul.getFactoryGroup();
            FactoryButtonGroup factoryButtons = (FactoryButtonGroup) factoryPanel.getComponent(index + FIRST_INDEX_FACTORY_COMPONENT);
            if (factoryButtons.isFactoryEmpty() && center.isCenterEmpty()) {
                if (player1.getPyramidBoard().countEmptyPyramidTiles(index) == 0) {
                    Tile tileSelected = new Tile(TileColor.valueOf(player1.getPyramidBoard().getTileButton()[index][PYRAMID_INDEX].getTileValue()));
                    player1.getWallBoard().verifyTileWall(index, tileSelected);
                    player1.getPyramidBoard().cleanPyramid(index);
                }
                if (player2.getPyramidBoard().countEmptyPyramidTiles(index) == 0) {
                    Tile tileSelected = new Tile(TileColor.valueOf(player2.getPyramidBoard().getTileButton()[index][PYRAMID_INDEX].getTileValue()));
                    player2.getWallBoard().verifyTileWall(index, tileSelected);
                    player2.getPyramidBoard().cleanPyramid(index);
                }
                factoryButtons.updateButtonGroup(game);
                gameAzul.removeTiles();
            }
        }
        center.updateCenterButtons(firstplayer.addFirstPlayer());
    }
}
