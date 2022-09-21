package jalau.at18.azul.view;

import javax.swing.*;

public class AzulFrame extends JFrame {
    public static final int DEFAULT_POS1 = 500;
    public static final int DEFAULT_SIZE = 300;
    public static final int INITIAL_POSITION = 200;
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    public static final int TILES_HEIGHT = 50;
    public static final int TILES_WIDTH = 20;
    public static final int CENTER = 100;
    public AzulFrame() {

        //add(new PlayerPanel(0, 0, DEFAULT_POS1, DEFAULT_SIZE));
        //add(new PlayerPanel(0, DEFAULT_SIZE, DEFAULT_POS1, DEFAULT_SIZE));
        add(new TilesSend(HEIGHT, TILES_WIDTH, CENTER, TILES_HEIGHT));
        add(new TilesSend(HEIGHT + INITIAL_POSITION, TILES_WIDTH, CENTER, TILES_HEIGHT));
        add(new TilesSend(HEIGHT, DEFAULT_SIZE, CENTER, TILES_HEIGHT));
        add(new TilesSend(HEIGHT + INITIAL_POSITION, DEFAULT_SIZE + TILES_WIDTH, CENTER, TILES_HEIGHT));
        add(new TilesSend(HEIGHT, DEFAULT_POS1, CENTER, TILES_HEIGHT));
        add(new CenterList(HEIGHT + CENTER, DEFAULT_POS1 + CENTER, INITIAL_POSITION + CENTER, TILES_HEIGHT + CENTER));
        add(new FloorList(CENTER, TILES_HEIGHT + DEFAULT_SIZE, DEFAULT_SIZE, INITIAL_POSITION));
        add(new FloorList(CENTER, HEIGHT + CENTER, DEFAULT_SIZE, INITIAL_POSITION));
        add(new FactoryPanel());

        initialize();
    }

    public void initialize() {
        setLayout(null);
        setBounds(INITIAL_POSITION, INITIAL_POSITION, WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("AZUL GAME");
        //setLocationRelativeTo(null);
        setVisible(true);
    }
}
