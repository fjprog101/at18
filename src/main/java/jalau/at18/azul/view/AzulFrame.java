package jalau.at18.azul.view;

import javax.swing.*;

public class AzulFrame extends JFrame {
    public static final int DEFAULT_POS1 = 500;
    public static final int DEFAULT_SIZE = 300;
    public static final int INITIAL_POSITION = 200;
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;

    public AzulFrame() {

        add(new PlayerPanel(0, 0, DEFAULT_POS1, DEFAULT_SIZE));
        add(new PlayerPanel(0, DEFAULT_SIZE, DEFAULT_POS1, DEFAULT_SIZE));
        add(new TilesSend(600, 20, 200, 50));
        add(new TilesSend(800, 20, 200, 50));
        add(new TilesSend(600, 300, 200, 50));
        add(new TilesSend(800, 320, 200, 50));
        add(new TilesSend(600, 500, 200, 50));
        add(new FactoryPanel());


        initialize();
    }

    public void initialize() {
        setLayout(null);
        setBounds(200,200,900,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("AZUL GAME");
        //setLocationRelativeTo(null);
        setVisible(true);
    }
}
