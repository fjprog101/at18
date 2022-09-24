package jalau.at18.azul.view;

import javax.swing.JPanel;

import jalau.at18.azul.BagSender;
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

    private FactoryButtonGroup tileButtonGroup;
    private FactoryButtonGroup tileButtonGroup1;
    private FactoryButtonGroup tileButtonGroup2;
    private FactoryButtonGroup tileButtonGroup3;
    private FactoryButtonGroup tileButtonGroup4;
    private CenterButtons centerTileButtonGroup;

    public FactoryPanel() {
        BagSender bag = new BagSender();
        bag.saveBag();
        setLayout(new GridLayout(ROWS, COLS, HORIZONTAL_GAP, VERTIXCAL_GAP));
        setBounds(X_INITIAL_POSITION, Y_INITIAL_POSITION, WIDTH, HEIGHT);
        add(new BagButton(new TileController(this, bag)));
        add(centerTileButtonGroup = new CenterButtons());
        addFactories();
    }

    public void addFactories() {
        add(tileButtonGroup = new FactoryButtonGroup(centerTileButtonGroup));
        add(tileButtonGroup1 = new FactoryButtonGroup(centerTileButtonGroup));
        add(tileButtonGroup2 = new FactoryButtonGroup(centerTileButtonGroup));
        add(tileButtonGroup3 = new FactoryButtonGroup(centerTileButtonGroup));
        add(tileButtonGroup4 = new FactoryButtonGroup(centerTileButtonGroup));
    }

    public FactoryButtonGroup getTileButtonGroup() {
        return this.tileButtonGroup;
    }

    public FactoryButtonGroup getTileButtonGroup1() {
        return this.tileButtonGroup1;
    }

    public FactoryButtonGroup getTileButtonGroup2() {
        return this.tileButtonGroup2;
    }

    public FactoryButtonGroup getTileButtonGroup3() {
        return this.tileButtonGroup3;
    }

    public FactoryButtonGroup getTileButtonGroup4() {
        return this.tileButtonGroup4;
    }

    public CenterButtons getCenterTileButtonGroup() {
        return this.centerTileButtonGroup;
    }

}
