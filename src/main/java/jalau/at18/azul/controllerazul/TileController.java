package jalau.at18.azul.controllerazul;

import jalau.at18.azul.BagSender;
import jalau.at18.azul.Tile;
import jalau.at18.azul.view.FactoryButtonGroup;
import jalau.at18.azul.view.FactoryPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TileController implements ActionListener {

    private static final int NUMBER_OF_FACTORIES = 5;
    private static final int FIRST_INDEX_FACTORY_COMPONENT = 2;
    private FactoryPanel factoryPanel;
    private BagSender gameAzul;

    public TileController(FactoryPanel panel, BagSender newValues) {
        this.factoryPanel = panel;
        this.gameAzul = newValues;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int index = 0; index < NUMBER_OF_FACTORIES; index++) {
            List<Tile> game = gameAzul.getFactoryGroup();
            FactoryButtonGroup factoryButtons = (FactoryButtonGroup) factoryPanel.getComponent(index + FIRST_INDEX_FACTORY_COMPONENT);
            factoryButtons.updateButtonGroup(game);
            gameAzul.removeTiles();
        }
    }
}
