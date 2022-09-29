package jalau.at18.azul.view;

import javax.swing.JPanel;

import jalau.at18.azul.controllerazul.TileController;
import jalau.at18.azul.model.BagSender;
import jalau.at18.azul.model.CenterTileBoard;
import jalau.at18.azul.model.Floor;

import java.awt.*;

public class FactoryPanel extends JPanel {

    private CenterButtons centerTileButtonGroup;
    private CenterTileBoard centerBoard;
    private Floor floorBoard;
    private StackButtonGroup stackButtonGroup;
    private PlayerPanel player1;
    private PlayerPanel player2;

    public FactoryPanel(StackButtonGroup newStack, PlayerPanel newPlayer1, PlayerPanel newPlayer2) {
        stackButtonGroup = newStack;
        player1 = newPlayer1;
        player2 = newPlayer2;
        centerBoard = new CenterTileBoard();
        BagSender bag = new BagSender();
        bag.saveBag();
        centerTileButtonGroup = new CenterButtons(centerBoard, stackButtonGroup, player1.getfloorButtonGroup(),
                player2.getfloorButtonGroup(), player1.getfloor());
        setLayout(new GridLayout(Dimensions.FactoryPanel.ROWS_FACTORY_PANEL, Dimensions.FactoryPanel.COLS_FACTORY_PANEL,
                Dimensions.FactoryPanel.HORIZONTAL_GAP_FACTORY_PANEL,
                Dimensions.FactoryPanel.VERTIXCAL_GAP_FACTORY_PANEL));
        setBounds(Dimensions.FactoryPanel.X_INITIAL_POSITION_FACTORY_PANEL,
                Dimensions.FactoryPanel.Y_INITIAL_POSITION_FACTORY_PANEL, Dimensions.FactoryPanel.WIDTH_FACTORY_PANEL,
                Dimensions.FactoryPanel.HEIGHT_FACTORY_PANEL);
        add(new BagButton(
                new TileController(this, bag, player1, player2, centerTileButtonGroup, centerBoard, floorBoard)));
        add(centerTileButtonGroup);
        addFactories();
    }

    public void addFactories() {
        for (int index = 0; index < Dimensions.FactoryPanel.NUMBER_OF_FACTORIES_FACTORY_PANEL; index++) {
            add(new FactoryButtonGroup(centerTileButtonGroup, centerBoard, stackButtonGroup));
        }
    }

    public CenterButtons getCenterTileButtonGroup() {
        return this.centerTileButtonGroup;
    }

}
