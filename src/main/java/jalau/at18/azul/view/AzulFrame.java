package jalau.at18.azul.view;

import javax.swing.*;
import jalau.at18.azul.BagSender;
import jalau.at18.azul.Controller.TileController;

public class AzulFrame extends JFrame {
    public static final int DEFAULT_POS1 = 500;
    public static final int DEFAULT_SIZE = 300;
    public static final int INITIAL_POSITION = 200;
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    public static final int TILES_HEIGHT = 50;
    public static final int TILES_WIDTH = 20;
    public static final int CENTER = 100;
    private BagButton tileButtonGroup;
    private BagButton tileButtonGroup1;
    private BagButton tileButtonGroup2;
    private TileButton tileButton;
    private TileController gameController;

    public AzulFrame() {
      // add(new TileButtonGroup(HEIGHT, TILES_WIDTH, INITIAL_POSITION,
      // DEFAULT_POS1));
      // add(new TileButtonGroup(HEIGHT + INITIAL_POSITION, TILES_WIDTH, CENTER,
      // TILES_HEIGHT));
      // add(new TileButtonGroup(HEIGHT, DEFAULT_SIZE, CENTER, TILES_HEIGHT));
      // add(new TileButtonGroup(HEIGHT + INITIAL_POSITION, DEFAULT_SIZE +
      // TILES_WIDTH, CENTER, TILES_HEIGHT));
      // add(new TileButtonGroup(HEIGHT, DEFAULT_POS1, CENTER, TILES_HEIGHT));
        add(new CenterList(HEIGHT + CENTER, DEFAULT_POS1 + CENTER, INITIAL_POSITION + CENTER, TILES_HEIGHT + CENTER));
        add(new FloorList(CENTER, TILES_HEIGHT + DEFAULT_SIZE, DEFAULT_SIZE, INITIAL_POSITION));
        add(new FloorList(CENTER, HEIGHT + CENTER, DEFAULT_SIZE, INITIAL_POSITION));
        add(new FactoryPanel());
        BagSender bag = new BagSender();
        bag.saveBag();
        gameController = new TileController(this, bag.getFactoryGroup());
        initialize();
    }

    public BagButton getTileButtonGroup() {
        return this.tileButtonGroup;
    }

    public BagButton getTileButtonGroup1() {
        return this.tileButtonGroup1;
    }

    public void initialize() {
        tileButton = new TileButton(gameController);
        tileButtonGroup = new BagButton(HEIGHT, TILES_WIDTH, INITIAL_POSITION, DEFAULT_POS1);
        tileButtonGroup1 = new BagButton(HEIGHT + INITIAL_POSITION, TILES_WIDTH, CENTER, TILES_HEIGHT);
        add(tileButton);
        add(tileButtonGroup);
        add(tileButtonGroup1);
        setLayout(null);
        setBounds(INITIAL_POSITION, INITIAL_POSITION, WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("AZUL GAME");
        setVisible(true);
    }
}
