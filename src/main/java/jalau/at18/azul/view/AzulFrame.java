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
        add(new FactoryPanel());
        initialize();
    }

    public void initialize() {
        setLayout(null);
        setBounds(INITIAL_POSITION, INITIAL_POSITION, WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("AZUL GAME");
        setVisible(true);
    }
}
