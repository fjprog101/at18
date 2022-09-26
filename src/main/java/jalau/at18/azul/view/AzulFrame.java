package jalau.at18.azul.view;

import javax.swing.*;

public class AzulFrame extends JFrame {

    public static final int PLAYER1 = 1;
    public static final int PLAYER2 = 2;
    public static final int PLAYER1_Y_POSITION = 0;
    public static final int PLAYER2_Y_POSITION = 401;
    public static final int INITIAL_POSITION = 10;
    public static final int WIDTH = 1200;
    public static final int HEIGHT = 780;
    private StackButtonGroup stackButtonGroup;

    public AzulFrame() {
        stackButtonGroup = new StackButtonGroup(INITIAL_POSITION);
        initialize();
    }

    public void initialize() {
        add(new PlayerPanel(PLAYER1, PLAYER1_Y_POSITION, stackButtonGroup));
        add(stackButtonGroup);
        add(new PlayerPanel(PLAYER2, PLAYER2_Y_POSITION, stackButtonGroup));
        add(new FactoryPanel(stackButtonGroup));
        setLayout(null);
        setBounds(INITIAL_POSITION, INITIAL_POSITION, WIDTH, HEIGHT);
        //setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("AZUL GAME");
        setVisible(true);
    }
}
