package jalau.at18.azul.controllerazul;

import jalau.at18.azul.BagSender;
import jalau.at18.azul.Tile;
import jalau.at18.azul.view.FactoryPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TileController implements ActionListener {
    private FactoryPanel factoryPanel;
    private BagSender gameAzul;

    public TileController(FactoryPanel panel, BagSender newValues) {
        this.factoryPanel = panel;
        this.gameAzul = newValues;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        List<Tile> game = gameAzul.getFactoryGroup();
        factoryPanel.getTileButtonGroup().updateButtonGroup(game);
        gameAzul.removeTiles();
        List<Tile> game1 = gameAzul.getFactoryGroup();
        factoryPanel.getTileButtonGroup1().updateButtonGroup(game1);
        gameAzul.removeTiles();
        List<Tile> game2 = gameAzul.getFactoryGroup();
        factoryPanel.getTileButtonGroup2().updateButtonGroup(game2);
        gameAzul.removeTiles();
        List<Tile> game3 = gameAzul.getFactoryGroup();
        factoryPanel.getTileButtonGroup3().updateButtonGroup(game3);
        gameAzul.removeTiles();
        List<Tile> game4 = gameAzul.getFactoryGroup();
        factoryPanel.getTileButtonGroup4().updateButtonGroup(game4);
        gameAzul.removeTiles();
    }
}
