package jalau.at18.azul.view;

import javax.swing.JPanel;

import jalau.at18.azul.BagSender;
import jalau.at18.azul.controllerazul.TileController;

import java.awt.*;

public class FactoryPanel extends JPanel {

    private FactoryButtonGroup tileButtonGroup;
    private FactoryButtonGroup tileButtonGroup1;
    private FactoryButtonGroup tileButtonGroup2;
    private FactoryButtonGroup tileButtonGroup3;
    private FactoryButtonGroup tileButtonGroup4;
    private TileController gameController;
    private BagButton tileButton;

    public static final int X_INITIAL_POSITION = 610;
    public static final int Y_INITIAL_POSITION = 20;
    public static final int WIDTH = 700;
    public static final int HEIGHT = 600;
    public static final int NUMBER_OF_FACTORIES = 5;
    public static final int ROWS = 3;
    public static final int COLS = 2;

    public static final int TILES_WIDTH = 20;
    public static final int INITIAL_POSITION = 200;
    public static final int DEFAULT_POS1 = 500;

    private CenterButtons centertileButtonGroup;

    public FactoryPanel() {

        BagSender bag = new BagSender();
        bag.saveBag();
        gameController = new TileController(this, bag);

        setLayout(new GridLayout(ROWS, COLS,100,100));
        setBounds(X_INITIAL_POSITION, Y_INITIAL_POSITION, WIDTH, HEIGHT);
        add(tileButton = new BagButton(gameController));
        addFactories();

    }

    public void addFactories() {
        add(tileButtonGroup = new FactoryButtonGroup(centertileButtonGroup));
        add(tileButtonGroup1 = new FactoryButtonGroup(centertileButtonGroup));
        add(tileButtonGroup2 = new FactoryButtonGroup(centertileButtonGroup));
        add(tileButtonGroup3 = new FactoryButtonGroup(centertileButtonGroup));
        add(tileButtonGroup4 = new FactoryButtonGroup(centertileButtonGroup));
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

}
