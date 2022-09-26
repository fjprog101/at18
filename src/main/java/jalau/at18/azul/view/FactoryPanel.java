package jalau.at18.azul.view;

import javax.swing.JPanel;

import jalau.at18.azul.BagSender;
import jalau.at18.azul.CenterTileBoard;
import jalau.at18.azul.controllerazul.TileController;

import java.awt.*;

public class FactoryPanel extends JPanel {
    public static final int ROWS = 4;
    public static final int COLS = 2;
    public static final int HORIZONTAL_GAP = 100;
    public static final int VERTIXCAL_GAP = 40;
    public static final int X_INITIAL_POSITION = 610;
    public static final int Y_INITIAL_POSITION = 20;
    public static final int WIDTH = 550;
    public static final int HEIGHT = 730;
    private static final int NUMBER_OF_FACTORIES = 5;

    private CenterButtons centerTileButtonGroup;
    private CenterTileBoard centerBoard;
    private StackButtonGroup stackButtonGroup;

    public FactoryPanel(StackButtonGroup newStackButtonGroup) {
        stackButtonGroup = newStackButtonGroup;
        centerBoard = new CenterTileBoard();
        BagSender bag = new BagSender();
        bag.saveBag();
        centerTileButtonGroup = new CenterButtons();
        setLayout(new GridLayout(ROWS, COLS, HORIZONTAL_GAP, VERTIXCAL_GAP));
        setBounds(X_INITIAL_POSITION, Y_INITIAL_POSITION, WIDTH, HEIGHT);
        add(new BagButton(new TileController(this, bag)));
        add(centerTileButtonGroup);
        addFactories();
    }

    public void addFactories() {
        for (int index = 0; index < NUMBER_OF_FACTORIES; index++) {
            add(new FactoryButtonGroup(centerTileButtonGroup, centerBoard, stackButtonGroup));
        }
    }

    public CenterButtons getCenterTileButtonGroup() {
        return this.centerTileButtonGroup;
    }

}
