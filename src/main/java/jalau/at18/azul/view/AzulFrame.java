package jalau.at18.azul.view;

import javax.swing.*;
import jalau.at18.azul.BagSender;
import jalau.at18.azul.controllerazul.TileController;

public class AzulFrame extends JFrame {
    public static final int DEFAULT_POS1 = 500;
    public static final int DEFAULT_SIZE = 300;
    public static final int INITIAL_POSITION = 200;
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    public static final int TILES_HEIGHT = 50;
    public static final int TILES_WIDTH = 20;
    public static final int CENTER = 100;
    private FactoryButtonGroup tileButtonGroup;
    private FactoryButtonGroup tileButtonGroup1;
    private CenterButtons centertileButtonGroup;
    private FloorButtons floorButtonGroup;
    private FloorButtons floorButtonGroup1;
    private PointerGroup pointergroup;
    private BagButton tileButton;
    private TileController gameController;

    public AzulFrame() {
        BagSender bag = new BagSender();
        bag.saveBag();
        gameController = new TileController(this, bag);
        initialize();
    }

    public FactoryButtonGroup getTileButtonGroup() {
        return this.tileButtonGroup;
    }

    public FactoryButtonGroup getTileButtonGroup1() {
        return this.tileButtonGroup1;
    }
    public CenterButtons getCenterTileButtonGroup() {
        return this.centertileButtonGroup;
    }
    public FloorButtons getfloorButtonGroup() {
        return this.floorButtonGroup;
    }
    public FloorButtons getfloorButtonGroup1() {
        return this.floorButtonGroup1;
    }

    public void initialize() {
        add(new PyramidBoard());
        add(new WallBoard());
        tileButton = new BagButton(gameController);
        centertileButtonGroup = new CenterButtons(HEIGHT + CENTER, DEFAULT_POS1 + CENTER, INITIAL_POSITION + TILES_HEIGHT, TILES_HEIGHT + CENTER);
        tileButtonGroup = new FactoryButtonGroup(HEIGHT, TILES_WIDTH, INITIAL_POSITION, DEFAULT_POS1, centertileButtonGroup);
        tileButtonGroup1 = new FactoryButtonGroup(HEIGHT + INITIAL_POSITION, TILES_WIDTH, INITIAL_POSITION, DEFAULT_POS1, centertileButtonGroup);
        floorButtonGroup = new FloorButtons(TILES_HEIGHT, TILES_HEIGHT + DEFAULT_SIZE, DEFAULT_POS1, INITIAL_POSITION);
        floorButtonGroup1 = new FloorButtons(TILES_HEIGHT, HEIGHT + CENTER, DEFAULT_POS1, INITIAL_POSITION);
        //pointergroup = new PointerGroup(100, 190, 50, 125);
        //add(pointergroup);
        add(tileButton);
        add(tileButtonGroup);
        add(tileButtonGroup1);
        add(centertileButtonGroup);
        add(floorButtonGroup);
        add(floorButtonGroup1);
        setLayout(null);
        setBounds(INITIAL_POSITION, INITIAL_POSITION, WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("AZUL GAME");
        setVisible(true);
    }
}
