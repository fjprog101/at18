package jalau.at18.kingoftokyo.view;

import javax.swing.*;

public class GameFrame extends JFrame {
    private static final int DEFAULT_POS = 30;
    private static final int DEFAULT_WIDTH = 1200;
    private static final int DEFAULT_HEIGHT = 700;

    public GameFrame() {
        setResizable(false);
        add(new ButtonRollDices());
        add(new DiceFace()); //DiceFace label = new  DiceFace();
        add(new ButtonFinishTurn());
        initialize();
    }

    private void initialize() {
        setBounds(DEFAULT_POS, DEFAULT_POS, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
}
